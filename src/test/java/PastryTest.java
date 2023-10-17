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

    @Test
    //When && Then
    void canAddFilling(){
        assertThat(pastry.addFilling()).isEqualTo(2);
    }






} //Last curly bracket
