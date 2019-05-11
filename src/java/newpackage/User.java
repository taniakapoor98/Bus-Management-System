package newpackage;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrik
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String uname;
   
    private String email;

    

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String pwd;
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
