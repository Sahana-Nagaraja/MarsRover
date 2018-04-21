class OutputPosition {

    private String pattern;
    private RoverPosition roverPosition = new RoverPosition();

    OutputPosition(String pattern) {
        this.pattern = pattern;
    }

    void moveRover() {
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'L') getDirectionForLeftMove();
            else if (pattern.charAt(i) == 'R') getDirectionForRightMove();
            else moveStraight(roverPosition);
        }
        System.out.println(roverPosition.x + " " + roverPosition.y + " " + roverPosition.direction);
    }

    private void getDirectionForRightMove() {
        if (roverPosition.direction == 'N') roverPosition.direction = MoveRight.N.getDirection();
        else if (roverPosition.direction == 'S') roverPosition.direction = MoveRight.S.getDirection();
        else if (roverPosition.direction == 'E') roverPosition.direction = MoveRight.E.getDirection();
        else roverPosition.direction = MoveRight.W.getDirection();
    }

    private void getDirectionForLeftMove() {
        if (roverPosition.direction == 'N') roverPosition.direction = MoveLeft.N.getDirection();
        else if (roverPosition.direction == 'S') roverPosition.direction = MoveLeft.S.getDirection();
        else if (roverPosition.direction == 'E') roverPosition.direction = MoveLeft.E.getDirection();
        else roverPosition.direction = MoveLeft.W.getDirection();
    }

    private void moveStraight(RoverPosition roverPosition) {
        if (roverPosition.direction == 'N') roverPosition.y = roverPosition.y + 1;
        else if (roverPosition.direction == 'S') roverPosition.y = roverPosition.y - 1;
        else if (roverPosition.direction == 'E') roverPosition.x = roverPosition.x + 1;
        else roverPosition.x = roverPosition.x - 1;
    }
}
