public class MarsRover {
    public String pattern;
    private RoverPosition roverPosition = new RoverPosition(3, 3, 'E');
    private RoverMovement roverMovement = new RoverMovement(roverPosition);
    MarsRover(String pattern){
        this.pattern = pattern;
    }

    private void moveRover() {
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'L') {
                if(roverPosition.direction == 'N')
                roverPosition.direction = RoverMovement.MoveLeft.N.getDirection();
                else if(roverPosition.direction == 'S')
                    roverPosition.direction = RoverMovement.MoveLeft.S.getDirection();
                else if(roverPosition.direction == 'E')
                    roverPosition.direction = RoverMovement.MoveLeft.E.getDirection();
                else
                    roverPosition.direction = RoverMovement.MoveLeft.W.getDirection();
            }
            else if (pattern.charAt(i) == 'R') {
                if(roverPosition.direction == 'N')
                    roverPosition.direction = RoverMovement.MoveRight.N.getDirection();
                else if(roverPosition.direction == 'S')
                    roverPosition.direction = RoverMovement.MoveRight.S.getDirection();
                else if(roverPosition.direction == 'E')
                    roverPosition.direction = RoverMovement.MoveRight.E.getDirection();
                else
                    roverPosition.direction = RoverMovement.MoveRight.W.getDirection();
            } else
                roverMovement.moveStraight(roverPosition);


        }
        System.out.println(roverPosition.x + " " +roverPosition.y+ " " +roverPosition.direction);
    }

    public static void main (String[] args){
        MarsRover marsRover = new MarsRover("MMRMMRMRRM");
        marsRover.moveRover();
    }
}
