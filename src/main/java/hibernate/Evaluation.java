package hibernate;
// Generated 10-06-2018 09:26:51 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Evaluation generated by hbm2java
 */
@Entity
@XmlRootElement( name = "evaluation")
@XmlSeeAlso ({Grade.class})
@Table(name="evaluation"
    ,catalog="gradecheck"
)
public class Evaluation  implements java.io.Serializable {


     private Integer id;
     @JsonManagedReference
     private Course course;
     private String name;
     private String description;
     private int percentage;
     private String period;
     private Boolean laboratory;
     private Date startDate;
     private Date endDate;
     private Boolean state;
     @JsonBackReference
     private Set grades = new HashSet(0);

    public Evaluation() {
    }

	
    public Evaluation(Course course, String name, String description, int percentage, Date startDate, Date endDate) {
        this.course = course;
        this.name = name;
        this.description = description;
        this.percentage = percentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public Evaluation(Course course, String name, String description, int percentage, String period, Boolean laboratory, Date startDate, Date endDate, Boolean state, Set grades) {
       this.course = course;
       this.name = name;
       this.description = description;
       this.percentage = percentage;
       this.period = period;
       this.laboratory = laboratory;
       this.startDate = startDate;
       this.endDate = endDate;
       this.state = state;
       this.grades = grades;
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
    @JoinColumn(name="course_id", nullable=false)
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", nullable=false, length=1000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="percentage", nullable=false)
    public int getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    
    @Column(name="period", length=2)
    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }

    
    @Column(name="laboratory")
    public Boolean getLaboratory() {
        return this.laboratory;
    }
    
    public void setLaboratory(Boolean laboratory) {
        this.laboratory = laboratory;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="start_date", nullable=false, length=10)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="end_date", nullable=false, length=10)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="evaluation")
    public Set getGrades() {
        return this.grades;
    }
    
    public void setGrades(Set grades) {
        this.grades = grades;
    }




}


