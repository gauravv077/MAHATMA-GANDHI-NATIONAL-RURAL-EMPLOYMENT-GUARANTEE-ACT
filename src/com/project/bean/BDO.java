package com.project.bean;

public class BDO {

private String BDOname;

private String BDOpassword;

public BDO() {
	
}

public BDO(String bDOname, String bDOpassword) {
	super();
	BDOname = bDOname;
	BDOpassword = bDOpassword;
}

public String getBDOname() {
	return BDOname;
}

public void setBDOname(String bDOname) {
	BDOname = bDOname;
}

public String getBDOpassword() {
	return BDOpassword;
}

public void setBDOpassword(String bDOpassword) {
	BDOpassword = bDOpassword;
}

@Override
public String toString() {
	return "BDO [BDOname=" + BDOname + ", f=" + BDOpassword + "]";
}



}
