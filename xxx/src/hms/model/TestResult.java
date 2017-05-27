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
public class TestResult {
    private String resultId;
    private String testId;
    private String patientId;
    private String admissionId;
    private String resultDescription;

    public TestResult() {
    }

    public TestResult(String resultId, String testId, String patientId, String admissionId, String resultDescription) {
        this.resultId = resultId;
        this.testId = testId;
        this.patientId = patientId;
        this.admissionId = admissionId;
        this.resultDescription = resultDescription;
    }

    /**
     * @return the resultId
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * @param resultId the resultId to set
     */
    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * @return the testId
     */
    public String getTestId() {
        return testId;
    }

    /**
     * @param testId the testId to set
     */
    public void setTestId(String testId) {
        this.testId = testId;
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
     * @return the resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * @param resultDescription the resultDescription to set
     */
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
    
    
}
