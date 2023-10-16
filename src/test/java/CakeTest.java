import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {


    Cake cake;

    //Given
    @BeforeEach
    void setUp(){
        cake = new Cake("Carrot",
                "Flour",
                30,
                15,
                false,
                1);
    }

    @Test
    //When && Then
    void canAddLayers(){
        assertThat(cake.addLayers()).isEqualTo(2);
    }


} //last curly bracket
