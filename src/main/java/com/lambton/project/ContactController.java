package com.lambton.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }


    @PostMapping("/contact")
    public String submitForm(@Valid Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "contact";
        }
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/contacts")
    public String listContacts(Model model, @RequestParam(name = "name", required = false) String name) {
        if (name != null) {
            model.addAttribute("contacts", contactRepository.findByName(name));
        } else {
            model.addAttribute("contacts", contactRepository.findAll());
        }
        return "list";
    }
}
