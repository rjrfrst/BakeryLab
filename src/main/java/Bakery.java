import java.util.ArrayList;

public class Bakery {

    //Instance fields
    private String name;
    private ArrayList<Stock> stocks;
    private int counter;

    //Constructors
    public Bakery(){
        this.stocks = new ArrayList<>();
    }


    //Methods
    //1
    //Insert method signature

    public int countStock(){
        return this.stocks.size();
    }

    //2
    //Pseudo-code: we want to calculate the profits.
    //We have to add all the sellPrice and the costToMake to determine the profits
//    public int calculateProfits(){
//        retur
//    }





} // Last curly brackets


