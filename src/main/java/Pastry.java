public class Pastry extends BakedGoods {

    //Instance fields | properties
    //Just a name which BakedGoods already have

    private int fillings;

    //Constructor
    public Pastry(String inputName,
                  String inputIngredients,
                  int  inputSellPrice,
                  int inputCostToMake,
                  int inputFillings){

        //The super relates back to BakedGoods
        super(inputName,
                inputIngredients,
                inputSellPrice,
                inputCostToMake);
        this.fillings = inputFillings;
    }

    //Methods
    //Insert method signature
    //1
    //Pseudo-code: create a method to add the filling
    //need to make sure that there is no filling = 0
    //I can add one (1) filling to a pastry
    //I have to add this.filling + 1; //this is hard coded
    public int addFilling(){
        return this.fillings;
    }

    //Attempting Question 5. Implementing at least 1 method overload
    public int addFilling(int flavor){
        flavor = 5;
        return flavor;
    }



}// Last curly bracket
