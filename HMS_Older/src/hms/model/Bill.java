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
public class Bill {
    private String billId;
    private String admissionId;
    private String patientId;
    private double medicalCharge;
    private double serviceCharge;
    private double roomCharge;
    private double hospitalCharge;
    private double total;
    private double discount;
    private double netTotal;

    public Bill() {
    }

    public Bill(String billId, String admissionId, String patientId, double medicalCharge, double serviceCharge, double roomCharge, double hospitalCharge, double total, double discount, double netTotal) {
        this.billId = billId;
        this.admissionId = admissionId;
        this.patientId = patientId;
        this.medicalCharge = medicalCharge;
        this.serviceCharge = serviceCharge;
        this.roomCharge = roomCharge;
        this.hospitalCharge = hospitalCharge;
        this.total = total;
        this.discount = discount;
        this.netTotal = netTotal;
    }

    /**
     * @return the billId
     */
    public String getBillId() {
        return billId;
    }

    /**
     * @param billId the billId to set
     */
    public void setBillId(String billId) {
        this.billId = billId;
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
     * @return the medicalCharge
     */
    public double getMedicalCharge() {
        return medicalCharge;
    }

    /**
     * @param medicalCharge the medicalCharge to set
     */
    public void setMedicalCharge(double medicalCharge) {
        this.medicalCharge = medicalCharge;
    }

    /**
     * @return the serviceCharge
     */
    public double getServiceCharge() {
        return serviceCharge;
    }

    /**
     * @param serviceCharge the serviceCharge to set
     */
    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    /**
     * @return the roomCharge
     */
    public double getRoomCharge() {
        return roomCharge;
    }

    /**
     * @param roomCharge the roomCharge to set
     */
    public void setRoomCharge(double roomCharge) {
        this.roomCharge = roomCharge;
    }

    /**
     * @return the hospitalCharge
     */
    public double getHospitalCharge() {
        return hospitalCharge;
    }

    /**
     * @param hospitalCharge the hospitalCharge to set
     */
    public void setHospitalCharge(double hospitalCharge) {
        this.hospitalCharge = hospitalCharge;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the netTotal
     */
    public double getNetTotal() {
        return netTotal;
    }

    /**
     * @param netTotal the netTotal to set
     */
    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
}
