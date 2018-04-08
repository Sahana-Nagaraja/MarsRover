//Understands the direction and returns the direction after movement.

public class RoverMovement {
    public int x;
    public int y;
    public char direction;

    RoverMovement(){

    }
    RoverMovement(RoverPosition roverPosition){
        this.x = roverPosition.getX();
        this.y = roverPosition.getY();
        this.direction = roverPosition.getDirection();
    }

    public RoverPosition moveStraight(RoverPosition roverPosition) {
        if(roverPosition.direction == 'N') roverPosition.y = roverPosition.y+1;
        else if(roverPosition.direction == 'S') roverPosition.y = roverPosition.y-1;
        else if(roverPosition.direction == 'E') roverPosition.x = roverPosition.x+1;
        //else if(roverPosition.getDirection() == 'W') roverPosition.setX(-1);
        else roverPosition.x = roverPosition.x-1;
        return roverPosition;
    }

    enum MoveRight {
        N('E'), S('W'), E('S'), W('N');
        MoveRight(char direction) {
            this.direction = direction;
        }
        public char direction;
        public char getDirection(){
            return this.direction;
        }
    }

    enum MoveLeft {
        N('W'), S('E'), E('N'), W('S');
        MoveLeft(char direction) {
            this.direction = direction;
        }
        public char direction;
        public char getDirection() {
            return this.direction;
        }
    }
}
