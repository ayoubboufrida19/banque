package mes_servlets;


import mes_servlets.ICcreditMetier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP PROBOOK
 */
public class creditmetierImpl implements ICcreditMetier{

    @Override
    public double calculerMesuablilite(double capital, double taux, double duree) {
     double t=taux/100;
     double t1=capital*t/12;
     double t2=1-Math.pow(1+t/12, -duree);
     return t1/t2;
    }
    //test unitaire:
    
    
    
}
