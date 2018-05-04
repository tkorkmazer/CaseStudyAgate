package com.company.Model;

public abstract class StaffMember {
    private int staffNo;
    private String staffName;
    private String staffStartDate;
    private String staffEmailAddress;

    public StaffMember(){
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffStartDate() {
        return staffStartDate;
    }

    public void setStaffStartDate(String staffStartDate) {
        this.staffStartDate = staffStartDate;
    }

    public String getStaffEmailAddress() {
        return this.staffEmailAddress;
    }

    public void setStaffEmailAddress(String staffEmailAddress) {
        this.staffEmailAddress = staffEmailAddress;
    }
}
