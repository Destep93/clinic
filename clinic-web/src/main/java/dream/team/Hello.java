/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dream.team;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author stels
 */
@Named(value = "hello")
@SessionScoped
public class Hello implements Serializable {

    private String test= "hello";
    /**
     * Creates a new instance of hello
     */
    public Hello() {
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    
}
