package entities;
// Generated 15-nov-2023 18:41:52 by Hibernate Tools 4.3.1



/**
 * CandidatureStateChangedNotification generated by hbm2java
 */
public class CandidatureStateChangedNotification  implements java.io.Serializable {


     private Integer id;
     private Candidature candidature;
     private Notification notification;

    public CandidatureStateChangedNotification() {
    }

    public CandidatureStateChangedNotification(Candidature candidature, Notification notification) {
       this.candidature = candidature;
       this.notification = notification;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Candidature getCandidature() {
        return this.candidature;
    }
    
    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }
    public Notification getNotification() {
        return this.notification;
    }
    
    public void setNotification(Notification notification) {
        this.notification = notification;
    }




}


