package hibernate;
// Generated 10-06-2018 09:26:51 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User generated by hbm2java
 */
@Entity
@XmlRootElement(name = "user")
@Table(name="user"
    ,catalog="gradecheck"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class User  implements java.io.Serializable {


     private Integer id;
     @JsonManagedReference
     private Person person;
     private String username;
     private String pass;
     private String imagePath;
     private Boolean state;
     @JsonBackReference
     private Set students = new HashSet(0);
     @JsonBackReference
     private Set employees = new HashSet(0);

    public User() {
    }

	
    public User(Person person, String username, String pass, String imagePath) {
        this.person = person;
        this.username = username;
        this.pass = pass;
        this.imagePath = imagePath;
    }
    public User(Person person, String username, String pass, String imagePath, Boolean state, Set students, Set employees) {
       this.person = person;
       this.username = username;
       this.pass = pass;
       this.imagePath = imagePath;
       this.state = state;
       this.students = students;
       this.employees = employees;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id", nullable=false)
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    
    @Column(name="username", unique=true, nullable=false, length=10)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="pass", nullable=false, length=500)
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    
    @Column(name="image_path", nullable=false, length=1000)
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }




}


