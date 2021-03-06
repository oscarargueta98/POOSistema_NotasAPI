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
 * Course generated by hbm2java
 */
@Entity
@XmlRootElement( name = "course" )
@Table(name="course"
    ,catalog="gradecheck"
    , uniqueConstraints = @UniqueConstraint(columnNames="course_code") 
)
public class Course  implements java.io.Serializable {


     private Integer id;
     @JsonManagedReference
     private Course course;
     @JsonManagedReference
     private Faculty faculty;
     private String name;
     private String courseCode;
     private String semester;
     private Boolean inter;
     private Boolean laboratory;
     private int uv;
     private Boolean state;
     @JsonBackReference
     private Set evaluations = new HashSet(0);
     @JsonBackReference
     private Set careerCourses = new HashSet(0);
     @JsonBackReference
     private Set courses = new HashSet(0);
     @JsonBackReference
     private Set courseTeachers = new HashSet(0);

    public Course() {
    }

	
    public Course(String name, String courseCode, String semester, int uv) {
        this.name = name;
        this.courseCode = courseCode;
        this.semester = semester;
        this.uv = uv;
    }
    public Course(Course course, Faculty faculty, String name, String courseCode, String semester, Boolean inter, Boolean laboratory, int uv, Boolean state, Set evaluations, Set careerCourses, Set courses, Set courseTeachers) {
       this.course = course;
       this.faculty = faculty;
       this.name = name;
       this.courseCode = courseCode;
       this.semester = semester;
       this.inter = inter;
       this.laboratory = laboratory;
       this.uv = uv;
       this.state = state;
       this.evaluations = evaluations;
       this.careerCourses = careerCourses;
       this.courses = courses;
       this.courseTeachers = courseTeachers;
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
    @JoinColumn(name="prerequisite_id")
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="faculty_id")
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="course_code", unique=true, nullable=false, length=10)
    public String getCourseCode() {
        return this.courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    
    @Column(name="semester", nullable=false, length=2)
    public String getSemester() {
        return this.semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }

    
    @Column(name="inter")
    public Boolean getInter() {
        return this.inter;
    }
    
    public void setInter(Boolean inter) {
        this.inter = inter;
    }

    
    @Column(name="laboratory")
    public Boolean getLaboratory() {
        return this.laboratory;
    }
    
    public void setLaboratory(Boolean laboratory) {
        this.laboratory = laboratory;
    }

    
    @Column(name="uv", nullable=false)
    public int getUv() {
        return this.uv;
    }
    
    public void setUv(int uv) {
        this.uv = uv;
    }

    
    @Column(name="state")
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set getEvaluations() {
        return this.evaluations;
    }
    
    public void setEvaluations(Set evaluations) {
        this.evaluations = evaluations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set getCareerCourses() {
        return this.careerCourses;
    }
    
    public void setCareerCourses(Set careerCourses) {
        this.careerCourses = careerCourses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set getCourseTeachers() {
        return this.courseTeachers;
    }
    
    public void setCourseTeachers(Set courseTeachers) {
        this.courseTeachers = courseTeachers;
    }




}


