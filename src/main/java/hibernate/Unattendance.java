package hibernate;
// Generated 10-06-2018 09:26:51 AM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Unattendance generated by hbm2java
 */
@Entity
@XmlRootElement(name = "unattendance")
@Table(name="unattendance"
    ,catalog="gradecheck"
)
public class Unattendance  implements java.io.Serializable {


     private Integer id;
     @JsonManagedReference
     private RegisteredCourse registeredCourse;
     private Date unattendanceDate;
     private Boolean state;

    public Unattendance() {
    }

	
    public Unattendance(RegisteredCourse registeredCourse) {
        this.registeredCourse = registeredCourse;
    }
    public Unattendance(RegisteredCourse registeredCourse, Date unattendanceDate, Boolean state) {
       this.registeredCourse = registeredCourse;
       this.unattendanceDate = unattendanceDate;
       this.state = state;
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
    @JoinColumn(name="registered_course_id", nullable=false)
    public RegisteredCourse getRegisteredCourse() {
        return this.registeredCourse;
    }
    
    public void setRegisteredCourse(RegisteredCourse registeredCourse) {
        this.registeredCourse = registeredCourse;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="unattendance_date", length=10)
    public Date getUnattendanceDate() {
        return this.unattendanceDate;
    }
    
    public void setUnattendanceDate(Date unattendanceDate) {
        this.unattendanceDate = unattendanceDate;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }




}


