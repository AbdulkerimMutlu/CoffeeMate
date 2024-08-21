package Deneme01;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String>bismil=new ArrayList<>();
        bismil.add("Kerim");
        bismil.add("Sefa");
        bismil.add("Merve");
        bismil.add("Ümmühan");
        for (int i = 0; i < bismil.size(); i++) {
            System.out.println("bismil = " + bismil.get(i));
        }
        boolean VarMi=bismil.contains("Sefa");
        System.out.println("bismil = " + VarMi);
        System.out.println(bismil);
        if (VarMi==true)
            System.out.println("seni aramızda görmek güzeldi");
    }
}
