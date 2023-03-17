package com.example.democontact.Service;

import com.example.democontact.Entity.Contact;

import java.util.List;

public interface Myser {

    public Contact addcontact(Contact contact);

    public List<Contact> getcontact();



    public  Contact updatecontact(Contact contact);

    public  Contact deletecontact(Long id);
}
