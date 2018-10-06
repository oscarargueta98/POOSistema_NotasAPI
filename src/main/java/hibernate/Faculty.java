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

/**
 * Faculty generated by hbm2java
 */
@Entity
@Table(name="faculty"
    ,catalog="gradecheck"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Faculty  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Boolean state;
     private Set careers = new HashSet(0);
     private Set courses = new HashSet(0);

    public Faculty() {
    }

	
    public Faculty(String name) {
        this.name = name;
    }
    public Faculty(String name, Boolean state, Set careers, Set courses) {
       this.name = name;
       this.state = state;
       this.careers = careers;
       this.courses = courses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", unique=true, nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="faculty")
    public Set getCareers() {
        return this.careers;
    }
    
    public void setCareers(Set careers) {
        this.careers = careers;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="faculty")
    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }




}

