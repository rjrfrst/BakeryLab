import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    //Given
    @BeforeEach
    void setUp(){
        bakery = new Bakery();
    }


    @Test
    void canCountStock(){
        assertThat(bakery.countStock()).isEqualTo(0);
    }

//    @Test
//    void canCalculateProfits(){
//        //When && Then
//        assertThat(bakery.calculateProfits()).isEqualTo(0);
//    }
//

//    @Test
//    void canCalculateLoss(){
//        //When && Then
//        assertThat(bakery.calculateLoss()).isEqualTo(0);
//    }





} // Last curly brackets
