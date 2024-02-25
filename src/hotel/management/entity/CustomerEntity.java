/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.entity;

/**
 *
 * @author Deshini
 */
public class CustomerEntity {
    
    private String customerId;
    private String customerTitle;
    private String customerFirstName;
    private String customerLastName;
    private String customerNic;
    private String customerAddress;
    private String customerContact;

    public CustomerEntity() {
    }

    public CustomerEntity(String customerId, String customerTitle, String customerFirstName, String customerLastName, String customerNic, String customerAddress, String customerContact) {
        this.customerId = customerId;
        this.customerTitle = customerTitle;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerNic = customerNic;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerTitle
     */
    public String getCustomerTitle() {
        return customerTitle;
    }

    /**
     * @param customerTitle the customerTitle to set
     */
    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    /**
     * @return the customerFirstName
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * @param customerFirstName the customerFirstName to set
     */
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    /**
     * @return the customerLastName
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * @param customerLastName the customerLastName to set
     */
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    /**
     * @return the customerNic
     */
    public String getCustomerNic() {
        return customerNic;
    }

    /**
     * @param customerNic the customerNic to set
     */
    public void setCustomerNic(String customerNic) {
        this.customerNic = customerNic;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the customerContact
     */
    public String getCustomerContact() {
        return customerContact;
    }

    /**
     * @param customerContact the customerContact to set
     */
    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "customerId=" + customerId + ", customerTitle=" + customerTitle + ", customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName + ", customerNic=" + customerNic + ", customerAddress=" + customerAddress + ", customerContact=" + customerContact + '}';
    }
    
}
