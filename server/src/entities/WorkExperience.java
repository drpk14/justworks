package entities;
// Generated 14-feb-2023 11:28:17 by Hibernate Tools 4.3.1



/**
 * WorkExperience generated by hbm2java
 */
public class WorkExperience  implements java.io.Serializable {


     private Integer id;
     private Knowledge knowledge;
     private String workName;
     private String company;

    public WorkExperience() {
    }

    public WorkExperience(Knowledge knowledge, String workName, String company) {
       this.knowledge = knowledge;
       this.workName = workName;
       this.company = company;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Knowledge getKnowledge() {
        return this.knowledge;
    }
    
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
    public String getWorkName() {
        return this.workName;
    }
    
    public void setWorkName(String workName) {
        this.workName = workName;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }




}


