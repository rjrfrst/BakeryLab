
// We have to change this to an abstract: check or not
public class BakedGoods {

    //Inheritance fields | properties
    //Make sure to change private to protected: check or not
    private String name;
    private String ingredients;
    private int sellPrice;
    private int costToMake;

    //Constructor
    public BakedGoods(String inputName,
                      String inputIngredients,
                      int inputSellPrice,
                      int inputCostToMake){
        this.name = inputName;
        this.ingredients = inputIngredients;
        this.sellPrice = inputSellPrice;
        this.costToMake = inputCostToMake;
    }

    //Methods
    //Method 1
    // method signature
    public int calculateMargin(){
        return this.sellPrice - this.costToMake;
    }

    //Getters && Setters

} //Last curly bracket
