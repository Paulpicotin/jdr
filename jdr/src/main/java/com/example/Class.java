package com.example;

import java.util.Scanner;

class Class implements IClass {
    String classe ;
    

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    };
    
       String CheckClasse(String classe) {
        if (java.util.Arrays.binarySearch(Classes, classe) < 0)
        {
            classe = " " ; 
            System.out.println("veuillez entrer une classe valide svp \n");
            System.out.println("Vous aveze le choix entre : " + java.util.Arrays.toString(Classes) );
            Scanner sc = new Scanner(System.in); 
            String str = sc.nextLine();
            classe = str ; 
            this.CheckClasse(classe);            
        }
        return classe;
    }
}
