package com.example.booktopia.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class PublishingHouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPubHouse ;
    private String namePubHouse;
    private String emailPubHouse;
    private String  addressPubHouse;

    public Long getIdPubHouse() {
        return idPubHouse;
    }

    public String getNamePubHouse() {
        return namePubHouse;
    }

    public String getEmailPubHouse() {
        return emailPubHouse;
    }

    public String getAddressPubHouse() {
        return addressPubHouse;
    }


    public void setIdPubHouse(Long idPubHouse) {
        this.idPubHouse = idPubHouse;
    }

    public void setNamePubHouse(String namePubHouse) {
        this.namePubHouse = namePubHouse;
    }

    public void setEmailPubHouse(String emailPubHouse) {
        this.emailPubHouse = emailPubHouse;
    }

    public void setAddressPubHouse(String addressPubHouse) {
        this.addressPubHouse = addressPubHouse;
    }


    public PublishingHouse(Long idPubHouse, String namePubHouse, String emailPubHouse, String addressPubHouse) {
        this.idPubHouse = idPubHouse;
        this.namePubHouse = namePubHouse;
        this.emailPubHouse = emailPubHouse;
        this.addressPubHouse = addressPubHouse;
    }

    public PublishingHouse() {
        super();
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "idPubHouse=" + idPubHouse +
                ", namePubHouse='" + namePubHouse + '\'' +
                ", emailPubHouse='" + emailPubHouse + '\'' +
                ", addressPubHouse='" + addressPubHouse +
                '}';
    }
}

