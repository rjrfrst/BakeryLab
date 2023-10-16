public class Cake extends BakedGoods {

    //Properties | Instance fields
    private boolean vegan;
    private int layers;

    //Constructors
    public Cake(String inputName,
                String inputIngredients,
                int inputSellPrice,
                int inputCostToMake,
                boolean vegan,
                int layers){
        //The super relates to the parent abstract class
        super(inputName,
                inputIngredients,
                inputSellPrice,
                inputCostToMake);
        this.vegan = vegan;
        this.layers = layers;
    }

    //Methods
    //1
    //Method Signature
    //Pseudo-code: make sure we can add 1 layer to the cake
    //it will be an int therefore it must require a return and not a void
    //I have to add this.layers + 1
    //In the CakeTest there is only 1 layer but we want 2 and the expected is 2
    public int addLayers(){
        return this.layers + 1;
    }


} //Last curly brackets
