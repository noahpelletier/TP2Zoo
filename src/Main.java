import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Enclos> arrayOfEnclos = new ArrayList<Enclos>();
        String zone,protection,sizeEnclos;
        int nbEnclos;
        ArrayList<Animaux> arrayOfAnimaux = new ArrayList<Animaux>();
        String especes, nomAnimal,genreAnimal,groupeSocial,dateArrive,lieuNaissance,dateNaissance;
        int frequenceNourriture,nbEmployeeDesigner,nbEnclosDesigner;
        boolean isExotique=false,isDomestique=false;
        double nbNourritureJourKg;
        ArrayList<Aliment> arrayOfAliment = new ArrayList<Aliment>();
        String Stocks,format,typeAliment;
        ArrayList<Employee> arrayOfEmployee = new ArrayList<Employee>();
        String Nom,Prenom,typeEmployee;
        int nbEmployee;

        while (true){

            System.out.println("1=Ajouter un animal(s)\n2=Ajouter un enclos\n3=Ajouter un employe\n4=Ajouter de la nourriture aux stocks\n5=Afficher toutes les informations disponibles\n6=afficher tous les animaux dans les enclos\n7=afficher tous les animaux avec un employe responsable\n8=modifier les données d'un animal\n9=Quitter");
            int option=0;
            System.out.println("Choisisez une option parmi les nombres proposés:");
            option=sc.nextInt();


            if (option==1){
                System.out.println("Choisisez son espece:");
                especes=sc.next();
                System.out.println("choisisez son nom:");
                nomAnimal=sc.next();
                System.out.println("choisisez son genre:");
                genreAnimal=sc.next();
                System.out.println("choisisez sa date de naissance:");
                dateNaissance=sc.next();
                System.out.println("choisisez son lieu de naissance:");
                lieuNaissance=sc.next();
                System.out.println("choisisez sa date d'arrive:");
                dateArrive=sc.next();
                System.out.println("choisisez son groupe social:");
                groupeSocial=sc.next();
                System.out.println("choisisez sa frequence de repas:");
                frequenceNourriture=sc.nextInt();
                System.out.println("choisisez la quantité de nourriture en kilos par jour l'animal ingurgite");
                nbNourritureJourKg=sc.nextDouble();
                System.out.println("choisisez le numéro de l'employé désigner:");
                nbEmployeeDesigner=sc.nextInt();
                System.out.println("choisisez le numéro d'enclos designer:");
                nbEnclosDesigner=sc.nextInt();
                System.out.println("est ce que l'animals est exotique(oui/non):");
                String isExotique1=sc.next();
                if(isExotique1.equalsIgnoreCase("oui"))isExotique=true;
                if(isExotique1.equalsIgnoreCase("non"))isExotique=false;
                System.out.println("est ce que l'animal est domestique(oui/non):");
                String isDomestique1=sc.next();
                if(isDomestique1.equalsIgnoreCase("oui"))isDomestique=true;
                if(isDomestique1.equalsIgnoreCase("non"))isDomestique=false;
                Animaux newAnimals=new Animaux(groupeSocial,dateNaissance,nbNourritureJourKg,dateArrive,especes,nomAnimal,genreAnimal,isExotique,isDomestique,nbEmployeeDesigner,frequenceNourriture,nbEnclosDesigner,lieuNaissance);
                arrayOfAnimaux.add(newAnimals);
                System.out.println(newAnimals);




            } else if (option==2){
                System.out.println("choisisez une zone:");
                zone=sc.next();
                System.out.println("choisisez la protection si il y ne as une:");
                protection= sc.next();
                System.out.println("choisisez la grandeur de l'enclos");
                sizeEnclos= sc.next();
                System.out.println("choisisez le numero de l'enclos");
                nbEnclos= sc.nextInt();
                Enclos newEnclos=new Enclos(nbEnclos,protection,zone,sizeEnclos);
                arrayOfEnclos.add(newEnclos);
                System.out.println(newEnclos);

            }
            if(option==3){
                System.out.println("choisisez le nom de l'employe");
                Nom=sc.next();
                System.out.println("choisisez le prenom de l'employe");
                Prenom=sc.next();
                System.out.println("choisisez le type d'employe");
                typeEmployee=sc.next();
                System.out.println("choisisez le numero de l'employe");
                nbEmployee=sc.nextInt();
                Employee newEmployee=new Employee(Nom,Prenom,typeEmployee,nbEmployee);
                arrayOfEmployee.add(newEmployee);
                System.out.println(newEmployee);
            }
            if(option==4){
                System.out.println("ajouter la nourriture aux stocks");
                Stocks= sc.next();
                System.out.println("choisisez le format de la nourriture");
                format=sc.next();
                System.out.println("choisisez le type d'aliment");
                typeAliment= sc.next();
                Aliment newAliment=new Aliment(Stocks,format,typeAliment);
                arrayOfAliment.add(newAliment);
                System.out.println(newAliment);
            }
            if(option==5){
                for(Animaux a:arrayOfAnimaux)
                    System.out.println(a);
                for(Aliment b:arrayOfAliment)
                    System.out.println(b);
                for(Employee c:arrayOfEmployee)
                    System.out.println(c);
                for(Enclos d:arrayOfEnclos)
                    System.out.println(d);

            }
            if(option==6){
                System.out.println(arrayOfAnimaux);





            }
            if(option==7){
                /*
                System.out.println(nbEmployeeDesigner);
                System.out.println(arrayOfAnimaux);


                 */
            }
            if(option==8){
                for(Animaux i : arrayOfAnimaux){
                    System.out.println(i.getNomAnimal());


                }
                System.out.println("choisiser le numéro de l'animal pour modifier ces informations:");
            }
            if(option==9){
                break;

            }


            }


        }


    }


