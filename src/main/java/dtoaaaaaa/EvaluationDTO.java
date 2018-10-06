package dtoaaaaaa;
// Generated 10-06-2018 08:41:00 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Evaluation generated by hbm2java
 */
public class EvaluationDTO  implements java.io.Serializable {


     private Integer id;
     private CourseDTO course;
     private String name;
     private String description;
     private int percentage;
     private String period;
     private Boolean laboratory;
     private Date startDate;
     private Date endDate;
     private Boolean state;
     private Set<GradeDTO> grades = new HashSet<GradeDTO>(0);

    public EvaluationDTO() {
    }

	
    public EvaluationDTO(CourseDTO course, String name, String description, int percentage, Date startDate, Date endDate) {
        this.course = course;
        this.name = name;
        this.description = description;
        this.percentage = percentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public EvaluationDTO(CourseDTO course, String name, String description, int percentage, String period, Boolean laboratory, Date startDate, Date endDate, Boolean state, Set<GradeDTO> grades) {
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
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public CourseDTO getCourse() {
        return this.course;
    }
    
    public void setCourse(CourseDTO course) {
        this.course = course;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }
    public Boolean getLaboratory() {
        return this.laboratory;
    }
    
    public void setLaboratory(Boolean laboratory) {
        this.laboratory = laboratory;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Boolean getState() {
        return this.state;
    }
    
    public void setState(Boolean state) {
        this.state = state;
    }
    public Set<GradeDTO> getGrades() {
        return this.grades;
    }
    
    public void setGrades(Set<GradeDTO> grades) {
        this.grades = grades;
    }




}


