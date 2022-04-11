package com.example.demo.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Dim_Client", schema = "dbo", catalog = "Invoice Management")
public class Table_DimClient {
    private Integer clientId;
    private String clientName;
    private String clientSurname;
    private String clientEmail;
    private String clientStreet;
    private String clientCity;
    private String clientCountry;
    private Integer clientPostalCode;
    private String clientMobileNumber;
    private String clientContactPerson;
    private Integer clientAccountNumber;
    private String clientBank;
    private Integer clientType;
    private Integer companyId;
    private Table_DimCompany dimCompanyByCompanyId;
    private Collection<Table_Invoice> invoicesByClientId;

    @Id
    @Column(name = "client_id", nullable = false)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "client_name", nullable = false, length = 100)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "client_surname", nullable = true, length = 100)
    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    @Basic
    @Column(name = "client_email", nullable = false, length = 100)
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Basic
    @Column(name = "client_street", nullable = false, length = 100)
    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        this.clientStreet = clientStreet;
    }

    @Basic
    @Column(name = "client_city", nullable = false, length = 100)
    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    @Basic
    @Column(name = "client_country", nullable = false, length = 100)
    public String getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }

    @Basic
    @Column(name = "client_postal_code", nullable = false)
    public Integer getClientPostalCode() {
        return clientPostalCode;
    }

    public void setClientPostalCode(Integer clientPostalCode) {
        this.clientPostalCode = clientPostalCode;
    }

    @Basic
    @Column(name = "client_mobile_number", nullable = false, length = 50)
    public String getClientMobileNumber() {
        return clientMobileNumber;
    }

    public void setClientMobileNumber(String clientMobileNumber) {
        this.clientMobileNumber = clientMobileNumber;
    }

    @Basic
    @Column(name = "client_contact_person", nullable = true, length = 100)
    public String getClientContactPerson() {
        return clientContactPerson;
    }

    public void setClientContactPerson(String clientContactPerson) {
        this.clientContactPerson = clientContactPerson;
    }

    @Basic
    @Column(name = "client_account_number", nullable = true)
    public Integer getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(Integer clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    @Basic
    @Column(name = "client_bank", nullable = true, length = 100)
    public String getClientBank() {
        return clientBank;
    }

    public void setClientBank(String clientBank) {
        this.clientBank = clientBank;
    }

    @Basic
    @Column(name = "client_type", nullable = true)
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_DimClient that = (Table_DimClient) o;

        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (clientSurname != null ? !clientSurname.equals(that.clientSurname) : that.clientSurname != null)
            return false;
        if (clientEmail != null ? !clientEmail.equals(that.clientEmail) : that.clientEmail != null) return false;
        if (clientStreet != null ? !clientStreet.equals(that.clientStreet) : that.clientStreet != null) return false;
        if (clientCity != null ? !clientCity.equals(that.clientCity) : that.clientCity != null) return false;
        if (clientCountry != null ? !clientCountry.equals(that.clientCountry) : that.clientCountry != null)
            return false;
        if (clientPostalCode != null ? !clientPostalCode.equals(that.clientPostalCode) : that.clientPostalCode != null)
            return false;
        if (clientMobileNumber != null ? !clientMobileNumber.equals(that.clientMobileNumber) : that.clientMobileNumber != null)
            return false;
        if (clientContactPerson != null ? !clientContactPerson.equals(that.clientContactPerson) : that.clientContactPerson != null)
            return false;
        if (clientAccountNumber != null ? !clientAccountNumber.equals(that.clientAccountNumber) : that.clientAccountNumber != null)
            return false;
        if (clientBank != null ? !clientBank.equals(that.clientBank) : that.clientBank != null) return false;
        if (clientType != null ? !clientType.equals(that.clientType) : that.clientType != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientId != null ? clientId.hashCode() : 0;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (clientSurname != null ? clientSurname.hashCode() : 0);
        result = 31 * result + (clientEmail != null ? clientEmail.hashCode() : 0);
        result = 31 * result + (clientStreet != null ? clientStreet.hashCode() : 0);
        result = 31 * result + (clientCity != null ? clientCity.hashCode() : 0);
        result = 31 * result + (clientCountry != null ? clientCountry.hashCode() : 0);
        result = 31 * result + (clientPostalCode != null ? clientPostalCode.hashCode() : 0);
        result = 31 * result + (clientMobileNumber != null ? clientMobileNumber.hashCode() : 0);
        result = 31 * result + (clientContactPerson != null ? clientContactPerson.hashCode() : 0);
        result = 31 * result + (clientAccountNumber != null ? clientAccountNumber.hashCode() : 0);
        result = 31 * result + (clientBank != null ? clientBank.hashCode() : 0);
        result = 31 * result + (clientType != null ? clientType.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public Table_DimCompany getDimCompanyByCompanyId() {
        return dimCompanyByCompanyId;
    }

    public void setDimCompanyByCompanyId(Table_DimCompany dimCompanyByCompanyId) {
        this.dimCompanyByCompanyId = dimCompanyByCompanyId;
    }

    @OneToMany(mappedBy = "dimClientByClientId")
    public Collection<Table_Invoice> getInvoicesByClientId() {
        return invoicesByClientId;
    }

    public void setInvoicesByClientId(Collection<Table_Invoice> invoicesByClientId) {
        this.invoicesByClientId = invoicesByClientId;
    }
}
