package no.hinesna;

import org.springframework.data.annotation.Id;

/**
 * Created by christerhansen on 06.10.15.
 */
public class Person {
    @Id
    String id;

    String fornavn;
    String etternavn;

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
}
