import com.mycompany.prestamoest.Metodos;
import static javafx.scene.input.KeyCode.N;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestP {
    
    public TestP() {
    }
    
     Metodos m =new Metodos();
    
    @Test
    public void usuario(){
    assertEquals("Juan", m.User("Juan"));
    }
    
    @Test
    public void contraseña(){
    assertEquals("Juan1234", m.Contra("Juan1234"));
    }

    @Test
    public void tarjeta(){
        assertEquals(16, m.Tarjeta(N.getName()));
    }
    
    @Test
    public void CVV(){
        assertEquals(3, m.CVV(N.getName()));
    }
    
    @Test
    public void Edad(){
        assertEquals(25 , m.Edad(25));
    }
}
