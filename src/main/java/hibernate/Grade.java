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

/**
 * Grade generated by hbm2java
 */
@Entity
@Table(name="grade"
    ,catalog="gradecheck"
)
public class Grade  implements java.io.Serializable {


     private Integer id;
     private Evaluation evaluation;
     private RegisteredCourse registeredCourse;
     private float grade;
     private String observations;
     private Boolean state;
     private Set corrections = new HashSet(0);

    public Grade() {
    }

	
    public Grade(Evaluation evaluation, RegisteredCourse registeredCourse, float grade) {
        this.evaluation = evaluation;
        this.registeredCourse = registeredCourse;
        this.grade = grade;
    }
    public Grade(Evaluation evaluation, RegisteredCourse registeredCourse, float grade, String observations, Boolean state, Set corrections) {
       this.evaluation = evaluation;
       this.registeredCourse = registeredCourse;
       this.grade = grade;
       this.observations = observations;
       this.state = state;
       this.corrections = corrections;
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
    @JoinColumn(name="evaluation_id", nullable=false)
    public Evaluation getEvaluation() {
        return this.evaluation;
    }
    
    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="registered_course_id", nullable=false)
    public RegisteredCourse getRegisteredCourse() {
        return this.registeredCourse;
    }
    
    public void setRegisteredCourse(RegisteredCourse registeredCourse) {
        this.registeredCourse = registeredCourse;
    }

    
    @Column(name="grade", nullable=false, precision=4)
    public float getGrade() {
        return this.grade;
    }
    
    public void setGrade(float grade) {
        this.grade = grade;
    }

    
    @Column(name="observations", length=1000)
    public String getObservations() {
        return this.observations;
    }
    
    public void setObservations(String observations) {
        this.observations = observations;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grade")
    public Set getCorrections() {
        return this.corrections;
    }
    
    public void setCorrections(Set corrections) {
        this.corrections = corrections;
    }




}


