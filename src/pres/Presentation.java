package pres;

import doa.DoaImp;
import metier.MetierImpl;

public class Presentation {
     public static void main(String[] args) {
         //couplage fort
         MetierImpl i=new MetierImpl();
         DoaImp d=new DoaImp();
         i.setD(d);
         System.out.println("res ="+i.calcul());
    }
}
