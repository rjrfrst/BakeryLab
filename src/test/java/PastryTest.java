import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PastryTest {

    Pastry pastry;

    //Given
    @BeforeEach
    void setUp(){
        pastry = new Pastry("Croissant",
                "Flour",
                15,
                7,
                2);
    }

//    @Test
//    //When && Then
//    void canAddFilling(){
//        assertThat(pastry.addFilling()).isEqualTo(2);
//    }

    //Question 5 attempt test

    @Test
    //When && Then
    void canAddFilling__noArgument(){ // modified
        int expected = 2;
        int actual = pastry.addFilling();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    //When && Then
    void canAddFilling__yesArgument(){
        int expected = 5;
        int actual = pastry.addFilling(5);
        assertThat(actual).isEqualTo(expected);
    }






} //Last curly bracket
