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
public class Patient {
    private String patientId;
    private String firstName;
    private String lastName;
    private String nic;
    private String dob;
    private String gender;
    private String bloodGroup;
    private String alergyDetails;
    private String specialNotes;
    private String postalCode;
    private String street;
    private String city;
    private String district;

    public Patient() {
    }

    public Patient(String patientId, String firstName, String lastName, String nic, String dob, String gender, String bloodGroup, String alergyDetails, String specialNotes, String postalCode, String street, String city, String district) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.dob = dob;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.alergyDetails = alergyDetails;
        this.specialNotes = specialNotes;
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
        this.district = district;
    }

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
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
     * @return the bloodGroup
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * @param bloodGroup the bloodGroup to set
     */
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    /**
     * @return the alergyDetails
     */
    public String getAlergyDetails() {
        return alergyDetails;
    }

    /**
     * @param alergyDetails the alergyDetails to set
     */
    public void setAlergyDetails(String alergyDetails) {
        this.alergyDetails = alergyDetails;
    }

    /**
     * @return the specialNotes
     */
    public String getSpecialNotes() {
        return specialNotes;
    }

    /**
     * @param specialNotes the specialNotes to set
     */
    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
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

    
}
