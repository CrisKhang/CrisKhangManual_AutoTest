package com.poly.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    private static EntityManagerFactory fatory;
    static public EntityManager getEntityManager() {
    	if(fatory == null || !fatory.isOpen()) {
    		fatory = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
    	}
    	return fatory.createEntityManager();
    }
    static public void shutdown() {
    	if(fatory != null && fatory.isOpen()) {
    		fatory.close();
    	}
    	fatory = null;
    }
    
}
