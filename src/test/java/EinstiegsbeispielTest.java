import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EinstiegsbeispielTest {

    Einstiegsbeispiel skalarproduct;

    @BeforeEach
    public void before(){
        skalarproduct= new Einstiegsbeispiel();
    }
    @Test
    public void ergebnisRichtig1(){
        int []a = {1,1,1,1,1,1};
        int []b = {2,2,2,2,2,2};
        int ergebnis = 0;
        assertEquals(skalarproduct.getInnerProdukt(a,b),ergebnis);

    }

}
