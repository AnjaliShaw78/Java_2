package com.assignment.main;

import com.assignment.defaultaccess.DefaultClass;
import com.assignment.protectedaccess.ProtectedClass;
import com.assignment.publicaccess.PublicClass;

public class MainClass {

	public static void main(String[] args) {
        PublicClass p = new PublicClass();
        p.publicMethod();
        
        ProtectedClass protect = new ProtectedClass();
        protect.protectedMethod();
        
        DefaultClass d = new DefaultClass();
        d.defaultMethod();
	}

}
