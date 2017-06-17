package org.rbsg.java.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.rbsg.java.controller.PrimesController;

//@XmlRootElement(name = "primesResponse")
public class PrimesResponse implements Serializable {

	final static Logger logger = Logger.getLogger(PrimesResponse.class);
	
    private static final long serialVersionUID = 1746127840105174833L;

    private  Integer initial;
    private  List<Integer> primes;
    
    public PrimesResponse(){
        
    }

    public PrimesResponse(Integer initial, List<Integer> primes) {
        this.initial = initial;
        this.primes = primes;
    }

     
    public void setInitial(Integer initial) {
        this.initial = initial;
    }
    
     
    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }
 
    public Integer getInitial() {
    	
    	logger.info("## initial: " + initial);
        return initial;
    }

    public List<Integer> getPrimes() {
    	logger.info("## primes: " + primes);
        return primes;
    }
}
