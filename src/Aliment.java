public class Aliment {
    private String Stocks;
    private String format;
    private String typeAliment;

    public Aliment(){}

    public Aliment(String aStocks,String aFormat,String aTypeAliment){
        Stocks=aStocks;
        format=aFormat;
        typeAliment=aTypeAliment;

    }
    public void setStocks(String aStocks){
        Stocks=aStocks;
    }
    public String getStocks(){
        return Stocks;

    }
    public void setAliments(String aFormat){
        format=aFormat;
    }
    public String getFormat(){
        return format;
    }
    public void setTypeAliment(String aTypeAliment){
        typeAliment=aTypeAliment;

    }
    public String getTypeAliment(){
        return typeAliment;
    }
    @Override
    public String toString(){
        String txt="";
        txt="Stockage actuelle des aliments:"+getStocks()+"  ,  ";
        txt+="types d'aliments:"+getTypeAliment()+"  ,  ";
        txt+="Format de la nourriture:"+getFormat()+"  ,  ";
        return txt;

    }
}
