package com.sai.androidq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ViewModelClass[] listdata;
    public RecyclerViewAdapter(ViewModelClass[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.recycler_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ViewModelClass myListData = listdata[position];
        holder.textView_name.setText(listdata[position].getName());
        holder.textView_description.setText(listdata[position].getDescription());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_name, textView_description;
        public ConstraintLayout constraintLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView_name = (TextView) itemView.findViewById(R.id.textView_name);
            this.textView_description = (TextView) itemView.findViewById(R.id.textView_description);
            this.constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.constraintLayout);
        }
    }
}
