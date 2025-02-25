package entities;
// Generated 15-nov-2023 18:41:52 by Hibernate Tools 4.3.1



/**
 * Offer generated by hbm2java
 */
public class Offer  implements java.io.Serializable {


     private Integer id;
     private Businessman businessman;
     private String name;
     private String description;
     private String ubication;
     private Integer salary;
     private String contractType;

    public Offer() {
    }

    public Offer(Businessman businessman, String name, String description, String ubication, Integer salary, String contractType) {
       this.businessman = businessman;
       this.name = name;
       this.description = description;
       this.ubication = ubication;
       this.salary = salary;
       this.contractType = contractType;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Businessman getBusinessman() {
        return this.businessman;
    }
    
    public void setBusinessman(Businessman businessman) {
        this.businessman = businessman;
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
    public String getUbication() {
        return this.ubication;
    }
    
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
    public Integer getSalary() {
        return this.salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getContractType() {
        return this.contractType;
    }
    
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }




}


