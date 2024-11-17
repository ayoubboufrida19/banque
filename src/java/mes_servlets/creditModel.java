/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mes_servlets;

/**
 *
 * @author HP PROBOOK
 */
public class creditModel {
    private double montant;
    private double taux;
    private double mensualite;
    private int duree;
    
    //getter and setters:
  public double getmontant(){
    return montant;
} 
    public int getduree(){
    return duree;
} 
 public void setduree(int d){
 this.duree=d;
} 
      public double gettaux(){
    return taux;
} 
        public double getmensualite(){
    return mensualite;
} 
        public void setmontant(double montant){
            this.montant=montant;
            
        }
        public void setmensualite(double m){
            this.mensualite=m;
            
        }
         public void settaux(double d){
            this.taux=d;
            
        }
         public creditModel(double montant,double taux,double mens,int duree){
             this.mensualite=mens;
             this.montant=montant;
             this.taux=taux;
             this.duree=duree;
         }
         public  creditModel(){};
}

