package com.example.democontact.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
    @Id
    public Long id;
    public String firstname;
    public String lastname;
    public  String emailid;
    public String phoneno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public Contact(Long id, String firstname, String lastname, String emailid, String phoneno) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.phoneno = phoneno;
    }
    public Contact()
    {

    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phoneno='" + phoneno + '\'' +
                '}';
    }
}
