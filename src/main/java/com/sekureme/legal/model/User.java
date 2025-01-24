package com.sekureme.legal.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID userId;

    @Lob
    private byte[] email;

    @Lob
    private byte[] emailSalt;

    @Lob
    private byte[] firstName;

    @Lob
    private byte[] firstNameSalt;

    @Lob
    private byte[] lastName;

    @Lob
    private byte[] lastNameSalt;

  
    @Lob
    private byte[] encryptionKey;

    private String preferredLanguage;

    private String createdAt;

    private String updatedAt;

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public byte[] getEmail() {
        return this.email;
    }

    public void setEmail(byte[] email) {
        this.email = email;
    }

    public byte[] getEmailSalt() {
        return this.emailSalt;
    }

    public void setEmailSalt(byte[] emailSalt) {
        this.emailSalt = emailSalt;
    }

    public byte[] getFirstName() {
        return this.firstName;
    }

    public void setFirstName(byte[] firstName) {
        this.firstName = firstName;
    }

    public byte[] getFirstNameSalt() {
        return this.firstNameSalt;
    }

    public void setFirstNameSalt(byte[] firstNameSalt) {
        this.firstNameSalt = firstNameSalt;
    }

    public byte[] getLastName() {
        return this.lastName;
    }

    public void setLastName(byte[] lastName) {
        this.lastName = lastName;
    }

    public byte[] getLastNameSalt() {
        return this.lastNameSalt;
    }

    public void setLastNameSalt(byte[] lastNameSalt) {
        this.lastNameSalt = lastNameSalt;
    }

    public byte[] getEncryptionKey() {
        return this.encryptionKey;
    }

    public void setEncryptionKey(byte[] encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
}