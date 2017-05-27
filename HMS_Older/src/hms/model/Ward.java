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
public class Ward {
    private String wardId;
    private String wardType;
    private String description;

    public Ward() {
    }

    public Ward(String wardId, String wardType, String description) {
        this.wardId = wardId;
        this.wardType = wardType;
        this.description = description;
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
     * @return the wardType
     */
    public String getWardType() {
        return wardType;
    }

    /**
     * @param wardType the wardType to set
     */
    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
