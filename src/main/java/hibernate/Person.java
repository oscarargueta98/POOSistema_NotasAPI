package hibernate;
// Generated 10-06-2018 09:26:51 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Person generated by hbm2java
 */
@Entity
@XmlRootElement(name = "person")
@Table(name="person"
    ,catalog="gradecheck"
    , uniqueConstraints = {@UniqueConstraint(columnNames="email"), @UniqueConstraint(columnNames="dui")} 
)
public class Person  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String surname;
     private String phone;
     private String email;
     private String dui;
     private String address;
     private Boolean state;
     private Set users = new HashSet(0);

    public Person() {
    }

	
    public Person(String name, String surname, String phone, String email, String dui, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dui = dui;
        this.address = address;
    }
    public Person(String name, String surname, String phone, String email, String dui, String address, Boolean state, Set users) {
       this.name = name;
       this.surname = surname;
       this.phone = phone;
       this.email = email;
       this.dui = dui;
       this.address = address;
       this.state = state;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="surname", nullable=false, length=50)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Column(name="phone", nullable=false, length=8)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="email", unique=true, nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="dui", unique=true, nullable=false, length=10)
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }

    
    @Column(name="address", nullable=false, length=500)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="person")
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}

