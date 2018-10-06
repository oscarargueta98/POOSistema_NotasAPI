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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Career generated by hbm2java
 */
@Entity
@Table(name="career"
    ,catalog="gradecheck"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Career  implements java.io.Serializable {


     private Integer id;
     private CareerType careerType;
     private Faculty faculty;
     private String name;
     private Boolean state;
     private Set careerCourses = new HashSet(0);
     private Set careerStudents = new HashSet(0);

    public Career() {
    }

	
    public Career(CareerType careerType, Faculty faculty, String name) {
        this.careerType = careerType;
        this.faculty = faculty;
        this.name = name;
    }
    public Career(CareerType careerType, Faculty faculty, String name, Boolean state, Set careerCourses, Set careerStudents) {
       this.careerType = careerType;
       this.faculty = faculty;
       this.name = name;
       this.state = state;
       this.careerCourses = careerCourses;
       this.careerStudents = careerStudents;
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
    @JoinColumn(name="career_type_id", nullable=false)
    public CareerType getCareerType() {
        return this.careerType;
    }
    
    public void setCareerType(CareerType careerType) {
        this.careerType = careerType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="faculty_id", nullable=false)
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="career")
    public Set getCareerCourses() {
        return this.careerCourses;
    }
    
    public void setCareerCourses(Set careerCourses) {
        this.careerCourses = careerCourses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="career")
    public Set getCareerStudents() {
        return this.careerStudents;
    }
    
    public void setCareerStudents(Set careerStudents) {
        this.careerStudents = careerStudents;
    }




}


