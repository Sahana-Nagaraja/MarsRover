import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverMovementTest {

    @Test
    public void shouldReturnNWhenWIsMovedRight(){
        assertEquals('N', RoverMovement.MoveRight.W.getDirection());
    }
    @Test
    public void shouldReturnSWhenEIsMovedRight(){
        assertEquals('S', RoverMovement.MoveRight.E.getDirection());
    }
    @Test
    public void shouldReturnEWhenNIsMovedRight(){
        assertEquals('E', RoverMovement.MoveRight.N.getDirection());
    }
    @Test
    public void shouldReturnWWhenSIsMovedRight(){
        assertEquals('W', RoverMovement.MoveRight.S.getDirection());
    }

    @Test
    public void shouldReturnSWhenWIsMovedLeft(){
        assertEquals('S', RoverMovement.MoveLeft.W.getDirection());
    }
    @Test
    public void shouldReturnNWhenEIsMovedLeft(){
        assertEquals('N', RoverMovement.MoveLeft.E.getDirection());
    }
    @Test
    public void shouldReturnWWhenNIsMovedLeft(){
        assertEquals('W', RoverMovement.MoveLeft.N.getDirection());
    }
    @Test
    public void shouldReturnEWhenSIsMovedLeft(){
        assertEquals('E', RoverMovement.MoveLeft.S.getDirection());
    }

    @Test
    public void shouldReturnXPlus1WhenDirectionIsE(){
        RoverPosition roverPosition = new RoverPosition(1,2,'E');
        RoverPosition roverPosition1 = new RoverPosition(2,2,'E');
        assertEquals(roverPosition1, new RoverMovement().moveStraight(roverPosition));
    }
    @Test
    public void shouldReturnXPlus1WhenDirectionIsW(){
        RoverPosition roverPosition = new RoverPosition(1,2,'W');
        RoverPosition roverPosition1 = new RoverPosition(0,2,'W');
        assertEquals(roverPosition1, new RoverMovement().moveStraight(roverPosition));
    }
    @Test
    public void shouldReturnYPlus1WhenDirectionIsN(){
        RoverPosition roverPosition = new RoverPosition(1,2,'N');
        RoverPosition roverPosition1 = new RoverPosition(1,3,'N');
        assertEquals(roverPosition1,new RoverMovement().moveStraight(roverPosition));
    }
    @Test
    public void shouldReturnYMinus1WhenDirectionIsS(){
        RoverPosition roverPosition = new RoverPosition(1,2,'S');
        RoverPosition roverPosition1 = new RoverPosition(1,1,'S');
        assertEquals(roverPosition1,new RoverMovement().moveStraight(roverPosition));
    }
}
