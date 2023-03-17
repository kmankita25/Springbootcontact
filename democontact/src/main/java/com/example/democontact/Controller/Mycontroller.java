package com.example.democontact.Controller;

import com.example.democontact.Entity.Contact;
import com.example.democontact.Repository.Myrep;
import com.example.democontact.Service.Myser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private Myser myser;
    @PostMapping("/m1")
    public Contact addcontact(@RequestBody Contact contact)
    {
        return this.myser.addcontact(contact);
    }
   @GetMapping("/m1")
    public List<Contact> getcontact(){
        return this.myser.getcontact();
    }



    @GetMapping("/firstname/{id}")
    public List<Contact> getcontact(@PathVariable Long id ){
        return this.myser.getcontact();
    }


    @PutMapping("/m1")

    public  Contact updatecontact(@RequestBody Contact contact)
    {
        return this.myser.updatecontact(contact);
    }

    @DeleteMapping("/m1/{id}")
    public Contact deletecontact(@PathVariable Long id)
    {
        return this.myser.deletecontact(id);
    }

}
