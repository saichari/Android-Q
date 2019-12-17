package com.sai.androidq;

public class ViewModelClass {

    private String Name;
    private String description;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ViewModelClass(String Name, String description) {
        this.Name = Name;
        this.description = description;
    }


}
