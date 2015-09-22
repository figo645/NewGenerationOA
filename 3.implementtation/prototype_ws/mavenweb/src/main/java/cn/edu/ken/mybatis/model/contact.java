package cn.edu.ken.mybatis.model;

public class Contact {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.idcontact
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private Integer idcontact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.meetings_idmeetings
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private Integer meetingsIdmeetings;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.contacttype_idcontacttype
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private Integer contacttypeIdcontacttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.username
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.password
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.userlocale
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private String userlocale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.usersetting
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private String usersetting;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.retired
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private Boolean retired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact.department_iddepartment
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    private Integer departmentIddepartment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.idcontact
     *
     * @return the value of contact.idcontact
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public Integer getIdcontact() {
        return idcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.idcontact
     *
     * @param idcontact the value for contact.idcontact
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setIdcontact(Integer idcontact) {
        this.idcontact = idcontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.meetings_idmeetings
     *
     * @return the value of contact.meetings_idmeetings
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public Integer getMeetingsIdmeetings() {
        return meetingsIdmeetings;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.meetings_idmeetings
     *
     * @param meetingsIdmeetings the value for contact.meetings_idmeetings
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setMeetingsIdmeetings(Integer meetingsIdmeetings) {
        this.meetingsIdmeetings = meetingsIdmeetings;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.contacttype_idcontacttype
     *
     * @return the value of contact.contacttype_idcontacttype
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public Integer getContacttypeIdcontacttype() {
        return contacttypeIdcontacttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.contacttype_idcontacttype
     *
     * @param contacttypeIdcontacttype the value for contact.contacttype_idcontacttype
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setContacttypeIdcontacttype(Integer contacttypeIdcontacttype) {
        this.contacttypeIdcontacttype = contacttypeIdcontacttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.username
     *
     * @return the value of contact.username
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.username
     *
     * @param username the value for contact.username
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.password
     *
     * @return the value of contact.password
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.password
     *
     * @param password the value for contact.password
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.userlocale
     *
     * @return the value of contact.userlocale
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public String getUserlocale() {
        return userlocale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.userlocale
     *
     * @param userlocale the value for contact.userlocale
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setUserlocale(String userlocale) {
        this.userlocale = userlocale == null ? null : userlocale.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.usersetting
     *
     * @return the value of contact.usersetting
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public String getUsersetting() {
        return usersetting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.usersetting
     *
     * @param usersetting the value for contact.usersetting
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setUsersetting(String usersetting) {
        this.usersetting = usersetting == null ? null : usersetting.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.retired
     *
     * @return the value of contact.retired
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public Boolean getRetired() {
        return retired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.retired
     *
     * @param retired the value for contact.retired
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact.department_iddepartment
     *
     * @return the value of contact.department_iddepartment
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public Integer getDepartmentIddepartment() {
        return departmentIddepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact.department_iddepartment
     *
     * @param departmentIddepartment the value for contact.department_iddepartment
     *
     * @mbggenerated Tue Sep 22 11:29:48 CST 2015
     */
    public void setDepartmentIddepartment(Integer departmentIddepartment) {
        this.departmentIddepartment = departmentIddepartment;
    }
}