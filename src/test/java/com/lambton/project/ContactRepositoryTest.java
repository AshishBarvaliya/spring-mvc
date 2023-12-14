package com.lambton.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void whenSaveContact_thenRetrieveSame() {
        Contact savedContact = contactRepository.save(new Contact("Ashish", "ash@gmail.com", "Hello there!"));
        Contact retrievedContact = contactRepository.findById(savedContact.getId()).orElse(null);
        assertNotNull(retrievedContact);
        assertEquals("Ashish", retrievedContact.getName());
        assertEquals("ash@gmail.com", retrievedContact.getEmail());
        assertEquals("Hello there!", retrievedContact.getMessage());
    }
}
