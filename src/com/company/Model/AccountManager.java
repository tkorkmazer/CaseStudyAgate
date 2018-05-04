package com.company.Model;

public class AccountManager extends StaffMember {
    public AccountManager(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
        super.setStaffNo(staffNo);
        super.setStaffName(staffName);
        super.setStaffStartDate(staffStartDate);
        super.setStaffEmailAddress(staffEmailAddress);
    }
}
