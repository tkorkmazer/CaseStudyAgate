package com.company.Model;

public class AdminStaff extends StaffMember {
    public AdminStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
        super.setStaffNo(staffNo);
        super.setStaffName(staffName);
        super.setStaffStartDate(staffStartDate);
        super.setStaffEmailAddress(staffEmailAddress);
    }
}
