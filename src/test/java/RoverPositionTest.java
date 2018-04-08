import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverPositionTest {
    @Test
    public void shouldReturnXPosition(){
        assertEquals(1, new RoverPosition(1,2,'N').getX());
    }
    @Test
    public void shouldReturnYPosition(){
        assertEquals(2, new RoverPosition(1,2,'N').getY());
    }
    @Test
    public void shouldReturnTheDirection(){
        assertEquals('N', new RoverPosition(1,2,'N').getDirection());
    }
}
