import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    BakedGoods bakedGoods;

    //Given
    @BeforeEach
    void setUp(){
        bakery = new Bakery("Paris",
                3);
    }

    //1
    @Test
    void canCountStock(){
        //When && Then
        assertThat(bakery.countStock()).isEqualTo(0);
    }

    //2
    @Test
    void canAddBakedGoods(){
        //When && Then
        //Creating one type of baked good for this test.
        BakedGoods bakedGoods = new BakedGoods("cake",
                "flour",
                30,
                15);
        bakery.addBakedGoods(bakedGoods);
        assertThat(bakery.countStock()).isEqualTo(1);
    }

    //2.1
    @Test
    void canAddMultipleBakedGoods(){
        //When && Then
        //Create two - three types of baked goods going to the bakery for this test
        BakedGoods bakedGoods = new BakedGoods("cake",
                "flour",
                30,
                15);
        Cake cake = new Cake("Carrot",
                "flour",
                30,
                15,
                false,
                1);
        Pastry pastry = new Pastry("Croissant",
                "Flour",
                15,
                7,
                1);
        bakery.addBakedGoods(bakedGoods);
        bakery.addBakedGoods(cake);
        bakery.addBakedGoods(pastry);
        assertThat(bakery.countStock()).isEqualTo(3);
    }

    //3
    //Test skipped
//    @Test
//    public void canCalculateProfit(){
//        bakery.calculateProfits();
//        Cake cake = new Cake("Carrot",
//                "flour",
//                30,
//                15,
//                false,
//                1);
//        assertThat(bakery.calculateProfits()).isEqualTo(15);
//
//    }


} // Last curly brackets
