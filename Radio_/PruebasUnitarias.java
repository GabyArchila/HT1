import java.beans.Transient;
import static org.junit.jupiter.api.Assertions.AssertEquals;


  @Test
  public void testmetodo_isOn(){
    isOn = true;
  }

  @Test
  public void testmetodo_turnOnOff() {
    onOff = false;
  }

  @Test
  public void testmetodo_saveStation() { 
    positionAM = 1000;
    station = 88.5;
  }
  
}