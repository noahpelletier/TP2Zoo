public class Animaux {
    private String especes;
    private String nomAnimal;
    private double nbNourritureJourKg;
    private String genreAnimal;
    private String groupeSocial;
    private String dateArrive;
    private String lieuNaissance;
    private boolean isExotique;
    private boolean isDomestique;
    private int frequenceNourriture;
    private int nbEmployeeDesigner;
    private int nbEnclosDesigner;
    private String dateNaissance;

    public Animaux(){}

    public Animaux(String aEspeces,String aNomAnimals,double aNbNourritureJourKg,String aGenreAnimal,String aGroupeSocial,String aDateArrive,String aLieuNaissance,boolean aIsExotique,boolean aIsDomestique,int aFrequenceNourritureJourKg,int aNbEmployeeDesigner,int aNbEnclosDesigner,String aDateNaissance){
        aDateNaissance=dateNaissance;
        aDateArrive=dateArrive;
        aEspeces=especes;
        aGroupeSocial=groupeSocial;
        aGenreAnimal=genreAnimal;
        aFrequenceNourritureJourKg=frequenceNourriture;
        aIsDomestique=isDomestique;
        aIsExotique=isExotique;
        aNbEmployeeDesigner=nbEmployeeDesigner;
        aNbEnclosDesigner=nbEnclosDesigner;
        aNbNourritureJourKg=nbNourritureJourKg;
        aNomAnimals=nomAnimal;
        aLieuNaissance=lieuNaissance;

    }
    public void setNbEmployee(int aNbEmployeeDesigner){
        nbEmployeeDesigner=aNbEmployeeDesigner;
    }
    public int getNbEmployeeDesigner(){
        return nbEmployeeDesigner;
    }
    public void setEspeces(String aEspeces){
        aEspeces=especes;
    }
    public String getEspeces(){
        return especes;
    }
    public void setNomAnimal(String aNomAnimal){
        aNomAnimal=nomAnimal;
    }
    public String getNomAnimal(){
        return nomAnimal;
    }
    public void setNbNourritureJourKg(double aNbNourritureJourKg){
        aNbNourritureJourKg=nbNourritureJourKg;
    }
    public double getFrequenceNourriture(){
        return nbNourritureJourKg;
    }
    public void setGenreAnimal(String aGenreAnimal){
        aGenreAnimal=genreAnimal;
    }
    public String getGenreAnimal(){
        return genreAnimal;
    }
    public void setDateArrive(String aDateArrive){
        aDateArrive=dateArrive;
    }
    public String getDateArrive(){
        return dateArrive;
    }
    public void setIsExotic(boolean aIsExotique){
        aIsExotique=isExotique;
    }
    public boolean getIsexotique(){
        return isExotique;
    }
    public void setIsDomestic(boolean aIsDomestique){
        aIsDomestique=isDomestique;
    }
    public boolean getIsDomestique(){
        return isDomestique;
    }
    public void setGroupeSocial(String aGroupeSocial){
        aGroupeSocial=groupeSocial;
    }
    public String getGroupeSocial(){
        return groupeSocial;
    }
    public void setNbEnclosDesigner(int aNbEnclosDesigner){
        aNbEnclosDesigner=nbEnclosDesigner;
    }
    public int getNbEnclosDesigner(){
        return nbEnclosDesigner;
    }

    public void setLieuNaissance(String aLieuNaissance) {
        aLieuNaissance=lieuNaissance;
    }
    public String getLieuNaissance(){
        return lieuNaissance;
    }
    public void setDateNaissance(String aDateNaissance){
        aDateNaissance=dateNaissance;
    }
    public String getDateNaissance(){
        return dateNaissance;
    }
    @Override
    public String toString(){
        String txt="";
        txt="Date de naissance:"+getDateNaissance()+"  ,  ";
        txt+="Lieu de naissace:"+getLieuNaissance()+"  ,  ";
        txt+="Nombre de l'enclos:"+getNbEnclosDesigner()+"  ,  ";
        txt+="Groupe social:"+getGroupeSocial()+"  ,  ";
        txt+="est domestique:"+getIsDomestique()+"  ,  ";
        txt+="est exotique:"+getIsexotique()+"  ,  ";
        txt+="Date d'arrive au zoo:"+getDateArrive()+"  ,  ";
        txt+="Genre:"+getGenreAnimal()+"  ,  ";
        txt+="frequence des repas:"+getFrequenceNourriture()+"  ,  ";
        txt+="Nom de l'animal:"+getNomAnimal()+"  ,  ";
        txt+="Espece de l'animal:"+getEspeces()+"  ,  ";
        txt+="Numéro de l'employé désigné a l'animal:"+getNbEmployeeDesigner()+"  ,  ";
        return txt;
    }
}
