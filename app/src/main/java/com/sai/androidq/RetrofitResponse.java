package com.sai.androidq;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RetrofitResponse{

	@SerializedName("AREA_ID")
	private int aREAID;

	@SerializedName("LASTMETDOC")
	private int lASTMETDOC;

	@SerializedName("ORG_ID")
	private int oRGID;

	@SerializedName("address")
	private String address;

	@SerializedName("special_id")
	private int specialId;

	@SerializedName("phy_id")
	private int phyId;

	@SerializedName("special_code")
	private String specialCode;

	@SerializedName("special_name")
	private String specialName;

	@SerializedName("IS_ACTIVE")
	private String iSACTIVE;

	@SerializedName("EMAILREPORTS")
	private String eMAILREPORTS;

	@SerializedName("RATING")
	private int rATING;

	@SerializedName("LOC_ADDRESS_ID")
	private int lOCADDRESSID;

	@SerializedName("IS_PRIMARY_LOC")
	private String iSPRIMARYLOC;

	@SerializedName("LOCATION_ID")
	private int lOCATIONID;

	@SerializedName("org_name")
	private String orgName;

	@SerializedName("phy_name")
	private String phyName;

	@SerializedName("LOCATION_NAME")
	private String lOCATIONNAME;

	@SerializedName("BASICPROSDATA")
	private int bASICPROSDATA;

	@SerializedName("status")
	private String status;

	public void setAREAID(int aREAID){
		this.aREAID = aREAID;
	}

	public int getAREAID(){
		return aREAID;
	}

	public void setLASTMETDOC(int lASTMETDOC){
		this.lASTMETDOC = lASTMETDOC;
	}

	public int getLASTMETDOC(){
		return lASTMETDOC;
	}

	public void setORGID(int oRGID){
		this.oRGID = oRGID;
	}

	public int getORGID(){
		return oRGID;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setSpecialId(int specialId){
		this.specialId = specialId;
	}

	public int getSpecialId(){
		return specialId;
	}

	public void setPhyId(int phyId){
		this.phyId = phyId;
	}

	public int getPhyId(){
		return phyId;
	}

	public void setSpecialCode(String specialCode){
		this.specialCode = specialCode;
	}

	public String getSpecialCode(){
		return specialCode;
	}

	public void setSpecialName(String specialName){
		this.specialName = specialName;
	}

	public String getSpecialName(){
		return specialName;
	}

	public void setISACTIVE(String iSACTIVE){
		this.iSACTIVE = iSACTIVE;
	}

	public String getISACTIVE(){
		return iSACTIVE;
	}

	public void setEMAILREPORTS(String eMAILREPORTS){
		this.eMAILREPORTS = eMAILREPORTS;
	}

	public String getEMAILREPORTS(){
		return eMAILREPORTS;
	}

	public void setRATING(int rATING){
		this.rATING = rATING;
	}

	public int getRATING(){
		return rATING;
	}

	public void setLOCADDRESSID(int lOCADDRESSID){
		this.lOCADDRESSID = lOCADDRESSID;
	}

	public int getLOCADDRESSID(){
		return lOCADDRESSID;
	}

	public void setISPRIMARYLOC(String iSPRIMARYLOC){
		this.iSPRIMARYLOC = iSPRIMARYLOC;
	}

	public String getISPRIMARYLOC(){
		return iSPRIMARYLOC;
	}

	public void setLOCATIONID(int lOCATIONID){
		this.lOCATIONID = lOCATIONID;
	}

	public int getLOCATIONID(){
		return lOCATIONID;
	}

	public void setOrgName(String orgName){
		this.orgName = orgName;
	}

	public String getOrgName(){
		return orgName;
	}

	public void setPhyName(String phyName){
		this.phyName = phyName;
	}

	public String getPhyName(){
		return phyName;
	}

	public void setLOCATIONNAME(String lOCATIONNAME){
		this.lOCATIONNAME = lOCATIONNAME;
	}

	public String getLOCATIONNAME(){
		return lOCATIONNAME;
	}

	public void setBASICPROSDATA(int bASICPROSDATA){
		this.bASICPROSDATA = bASICPROSDATA;
	}

	public int getBASICPROSDATA(){
		return bASICPROSDATA;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"RetrofitResponse{" + 
			"aREA_ID = '" + aREAID + '\'' + 
			",lASTMETDOC = '" + lASTMETDOC + '\'' + 
			",oRG_ID = '" + oRGID + '\'' + 
			",address = '" + address + '\'' + 
			",special_id = '" + specialId + '\'' + 
			",phy_id = '" + phyId + '\'' + 
			",special_code = '" + specialCode + '\'' + 
			",special_name = '" + specialName + '\'' + 
			",iS_ACTIVE = '" + iSACTIVE + '\'' + 
			",eMAILREPORTS = '" + eMAILREPORTS + '\'' + 
			",rATING = '" + rATING + '\'' + 
			",lOC_ADDRESS_ID = '" + lOCADDRESSID + '\'' + 
			",iS_PRIMARY_LOC = '" + iSPRIMARYLOC + '\'' + 
			",lOCATION_ID = '" + lOCATIONID + '\'' + 
			",org_name = '" + orgName + '\'' + 
			",phy_name = '" + phyName + '\'' + 
			",lOCATION_NAME = '" + lOCATIONNAME + '\'' + 
			",bASICPROSDATA = '" + bASICPROSDATA + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}