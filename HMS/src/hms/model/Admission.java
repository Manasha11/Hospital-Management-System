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
public class Admission {
    private String admissionId;
    private String patientId;
    private String wardId;
    private String date;
    private String recommendedBy;
    private String confirmedBy;
    private String leadingConsultant;
    private String leadingConsultantId;
    private double advancePayment;

    public Admission() {
    }

    public Admission(String admissionId, String patientId, String wardId, String date, String recommendedBy, String confirmedBy, String leadingConsultant, String leadingConsultantId, double advancePayment) {
        this.admissionId = admissionId;
        this.patientId = patientId;
        this.wardId = wardId;
        this.date = date;
        this.recommendedBy = recommendedBy;
        this.confirmedBy = confirmedBy;
        this.leadingConsultant = leadingConsultant;
        this.leadingConsultantId = leadingConsultantId;
        this.advancePayment = advancePayment;
    }

    /**
     * @return the admissionId
     */
    public String getAdmissionId() {
        return admissionId;
    }

    /**
     * @param admissionId the admissionId to set
     */
    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
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
     * @return the wardId
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * @param wardId the wardId to set
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the recommendedBy
     */
    public String getRecommendedBy() {
        return recommendedBy;
    }

    /**
     * @param recommendedBy the recommendedBy to set
     */
    public void setRecommendedBy(String recommendedBy) {
        this.recommendedBy = recommendedBy;
    }

    /**
     * @return the confirmedBy
     */
    public String getConfirmedBy() {
        return confirmedBy;
    }

    /**
     * @param confirmedBy the confirmedBy to set
     */
    public void setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
    }

    /**
     * @return the leadingConsultant
     */
    public String getLeadingConsultant() {
        return leadingConsultant;
    }

    /**
     * @param leadingConsultant the leadingConsultant to set
     */
    public void setLeadingConsultant(String leadingConsultant) {
        this.leadingConsultant = leadingConsultant;
    }

    /**
     * @return the leadingConsultantId
     */
    public String getLeadingConsultantId() {
        return leadingConsultantId;
    }

    /**
     * @param leadingConsultantId the leadingConsultantId to set
     */
    public void setLeadingConsultantId(String leadingConsultantId) {
        this.leadingConsultantId = leadingConsultantId;
    }

    /**
     * @return the advancePayment
     */
    public double getAdvancePayment() {
        return advancePayment;
    }

    /**
     * @param advancePayment the advancePayment to set
     */
    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    
}
