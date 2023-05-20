public class Enclos {


    private int nbEnclos;
    private String zone;
    private String protection;
    private String sizeEnclos;


    public Enclos(){}
    public Enclos(int aNbEnclos, String aZone, String aProtection, String aSizeEnclos){
        aNbEnclos=nbEnclos;
        aZone=zone;
        aProtection=protection;
        aSizeEnclos=sizeEnclos;

    }

    public void setNbEnclos(int aNbEnclos){
        nbEnclos=aNbEnclos;
    }
    public int getNbEnclos(){
        return nbEnclos;
    }
    public void setZone(String aZone){
        zone=aZone;
    }
    public String getZone(){
        return zone;
    }
    public void setProtection(String aProtection){
        protection=aProtection;
    }
    public String getProtection(){
        return protection;
    }
    public void setSizeEnclos(String aSizeEnclos){
        sizeEnclos=aSizeEnclos;
    }
    public String getSizeEnclos(){
        return sizeEnclos;
    }
    @Override
    public String toString(){
        String txt="";
        txt="Numéro de l'enclos:"+getNbEnclos()+"  ,  ";
        txt+="Type de zone de l'enclos:"+getZone()+"  ,  ";
        txt+="protection spéciale de l'enclos:"+getProtection()+"  ,  ";
        txt+="Taille de l'enclos:"+getSizeEnclos()+"  ,  ";
        return txt;
    }










}
