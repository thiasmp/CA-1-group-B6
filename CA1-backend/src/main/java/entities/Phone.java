package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQuery(name = "Phone.deleteAllRows", query = "DELETE from Address")
@Table (name = "phone")
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Person person;

    public Phone() {
    }

    private String number;
    private String description;

    public Phone(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}