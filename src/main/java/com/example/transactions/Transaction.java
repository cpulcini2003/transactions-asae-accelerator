package com.example.transactions;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate timestamp;
    Double amount;
    String description;

    String context;
    String category;
    String media;
    String peer;
  
    String base64Image;

    //CONSTRUCTORS
    public Transaction() {

    }

    public Transaction(
            LocalDate timestamp,
            Double amount,
            String description) {
                this.timestamp = timestamp;
                this.amount = amount;
                this.description = description;
            }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getPeer() {
        return peer;
    }

    public void setPeer(String peer) {
        this.peer = peer;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", timestamp=" + timestamp + ", amount=" + amount + ", description="
                + description + ", context=" + context + ", category=" + category + ", media=" + media + ", peer="
                + peer + ", base64Image=" + base64Image + "]";
    }
}

