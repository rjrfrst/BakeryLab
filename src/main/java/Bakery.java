import java.util.ArrayList;
import java.util.OptionalDouble;

public class Bakery {

    //Instance fields
    private String name;

    private int stock;

    private ArrayList<BakedGoods> bakedGoods;

    //Constructors
    public Bakery(String inputName, int inputStock){
        this.name = inputName;
        this.stock = 3;
        this.bakedGoods = new ArrayList<>();

    }


    //Methods
    //1
    //Insert method signature
    //I want to count the stocks
    public int countStock(){
        return this.bakedGoods.size();
    }

    //2
    //Insert method signature
    //I want to add one stock of baked goods and test it.
    public void addBakedGoods(BakedGoods bakedGoods){
        this.bakedGoods.add(bakedGoods);
    }


    //3
    //Pseudo-code: we want to calculate the profits.
    //The bakery needs to calculate the profits
    //I need to pass the bakedGoods ArrayList<> to the method
    //Once I have the BakedGoods object within the calculateProfits. I should see the profits
    //
    //Loop through the bakedGoods in the bakery.
    //count the total of the calculateMargin.

    //Code skipped
//    public int calculateProfits(){
//        int totalProfits = 0;
//        for (int i = 0; totalProfits < this.bakedGoods.size(); i++){
//            BakedGoods bakery = (BakedGoods) this.bakedGoods.get(i);
//            totalProfits += 1;
//
//        }
//        return totalProfits;
//    }
//


    

    //Getter && Setters






} // Last curly brackets


