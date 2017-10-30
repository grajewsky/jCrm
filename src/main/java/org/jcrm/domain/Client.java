package org.jcrm.domain;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Client.
 */
@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 42)
    @Column(name = "name", length = 42)
    private String name;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "nip")
    private String NIP;

    @Column(name = "pesel")
    private String PESEL;

    @Column(name = "phone_home")
    private String phone_home;

    @Column(name = "phone_work")
    private String phone_work;

    // jhipster-needle-entity-add-field - Jhipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Client name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Client birthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getLast_name() {
        return last_name;
    }

    public Client last_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNIP() {
        return NIP;
    }

    public Client NIP(String NIP) {
        this.NIP = NIP;
        return this;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getPESEL() {
        return PESEL;
    }

    public Client PESEL(String PESEL) {
        this.PESEL = PESEL;
        return this;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public String getPhone_home() {
        return phone_home;
    }

    public Client phone_home(String phone_home) {
        this.phone_home = phone_home;
        return this;
    }

    public void setPhone_home(String phone_home) {
        this.phone_home = phone_home;
    }

    public String getPhone_work() {
        return phone_work;
    }

    public Client phone_work(String phone_work) {
        this.phone_work = phone_work;
        return this;
    }

    public void setPhone_work(String phone_work) {
        this.phone_work = phone_work;
    }
    // jhipster-needle-entity-add-getters-setters - Jhipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        if (client.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Client{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", birthdate='" + getBirthdate() + "'" +
            ", last_name='" + getLast_name() + "'" +
            ", NIP='" + getNIP() + "'" +
            ", PESEL='" + getPESEL() + "'" +
            ", phone_home='" + getPhone_home() + "'" +
            ", phone_work='" + getPhone_work() + "'" +
            "}";
    }
}
