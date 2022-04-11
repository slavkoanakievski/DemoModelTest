package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "User", schema = "dbo", catalog = "Invoice Management")
public class Table_User {
    private Integer userId;
    private Integer companyId;
    private String employeeName;
    private String employeeSurname;
    private String employeeEmail;
    private Table_DimCompany dimCompanyByCompanyId;

    @Id
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "company_id", nullable = false)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "employee_name", nullable = false, length = 100)
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "employee_surname", nullable = false, length = 100)
    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    @Basic
    @Column(name = "employee_email", nullable = true, length = 100)
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table_User that = (Table_User) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (employeeSurname != null ? !employeeSurname.equals(that.employeeSurname) : that.employeeSurname != null)
            return false;
        if (employeeEmail != null ? !employeeEmail.equals(that.employeeEmail) : that.employeeEmail != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeeSurname != null ? employeeSurname.hashCode() : 0);
        result = 31 * result + (employeeEmail != null ? employeeEmail.hashCode() : 0);
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
}
