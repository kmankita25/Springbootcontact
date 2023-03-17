package com.example.democontact.Service;

import com.example.democontact.Entity.Contact;
import com.example.democontact.Repository.Myrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySerImpl implements Myser{
    @Autowired
    private Myrep myrep;
    @Override
    public Contact addcontact(Contact contact) {
        return myrep.save(contact);
    }

    @Override
    public List<Contact> getcontact() {
        return myrep.findAll();
    }



    @Override
    public Contact updatecontact(Contact contact) {
        return myrep.save(contact);
    }

    @Override
    public Contact deletecontact(Long id) {
        Contact contact= myrep.getReferenceById(id);
        myrep.delete(contact);
        return null;
    }
}
