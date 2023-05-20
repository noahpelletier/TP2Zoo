public class Employee {

    private String Nom;
    private String Prenom;
    private String typeEmployee;
    private int nbEmployee;

    public Employee(){}

    public Employee(String aNom,String aPrenom,String aTypeEmployee,int aNbEmployee){
        aNbEmployee=nbEmployee;
        aNom=Nom;
        aPrenom=Prenom;
        aTypeEmployee=typeEmployee;

    }
    public void setNom(String aNom){
        Nom=aNom;

    }
    public String getNom(){
        return Nom;
    }
    public void setPrenom(String aPrenom){
        Prenom=aPrenom;

    }
    public String getPrenom(){
        return Prenom;

    }
    public void setNbEmployee(int aNbEmployee){
        nbEmployee=aNbEmployee;
    }
    public int getNbEmployee(){
        return nbEmployee;

    }
    public void setTypeEmployee(String aTypeEmployee){
        typeEmployee=aTypeEmployee;

    }
    public String getTypeEmployee(){
        return typeEmployee;
    }
    @Override
    public String toString(){
        String txt="";
        txt="Nom de l'employé:"+getNom()+"  ,  ";
        txt+="Prenom de l'employé:"+getPrenom()+"  ,  ";
        txt+="Numéro de l'employé:"+getNbEmployee()+"  ,  ";
        txt+=" Type d'employé:"+getTypeEmployee()+"  ,  ";
        return txt;
    }
}
