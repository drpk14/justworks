package entities;
// Generated 25-oct-2022 14:37:38 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ofert generated by hbm2java
 */
public class Ofert  implements java.io.Serializable {


     private Integer id;
     private Businessman businessman;
     private String name;
     private String description;
     private String ubication;
     private Integer salary;
     private String contractType;
     private Set labelOferts = new HashSet(0);

    public Ofert() {
    }

    public Ofert(Businessman businessman, String name, String description, String ubication, Integer salary, String contractType, Set labelOferts) {
       this.businessman = businessman;
       this.name = name;
       this.description = description;
       this.ubication = ubication;
       this.salary = salary;
       this.contractType = contractType;
       this.labelOferts = labelOferts;
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
    public Set getLabelOferts() {
        return this.labelOferts;
    }
    
    public void setLabelOferts(Set labelOferts) {
        this.labelOferts = labelOferts;
    }




}


