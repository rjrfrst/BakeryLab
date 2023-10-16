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
                1);
    }

    @Test
    //When && Then
    void canAddFilling(){
        assertThat(pastry.addFilling()).isEqualTo(1);
    }





} //Last curly bracket
