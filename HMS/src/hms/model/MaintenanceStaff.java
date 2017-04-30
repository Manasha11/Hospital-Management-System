/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.model;

/**
 *
 * @author Manasha
 */
public class MaintenanceStaff {
    private String mStaffId;
    private String employeeId;
    private String firstName;
    private String lastName;
    private String nic;
    private String dob;
    private String gender;
    private String contatctNo;
    private String postalCode;
    private String street;
    private String city;
    private String district;
    private String email;

    public MaintenanceStaff() {
    }

    public MaintenanceStaff(String mStaffId, String employeeId, String firstName, String lastName, String nic, String dob, String gender, String contatctNo, String postalCode, String street, String city, String district, String email) {
        this.mStaffId = mStaffId;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.dob = dob;
        this.gender = gender;
        this.contatctNo = contatctNo;
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
        this.district = district;
        this.email = email;
    }

    /**
     * @return the mStaffId
     */
    public String getmStaffId() {
        return mStaffId;
    }

    /**
     * @param mStaffId the mStaffId to set
     */
    public void setmStaffId(String mStaffId) {
        this.mStaffId = mStaffId;
    }

    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the contatctNo
     */
    public String getContatctNo() {
        return contatctNo;
    }

    /**
     * @param contatctNo the contatctNo to set
     */
    public void setContatctNo(String contatctNo) {
        this.contatctNo = contatctNo;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
