public class RoverPosition {
    int x;
    int y;
    char direction;

    RoverPosition() {
        this.x = 3;
        this.y = 3;
        this.direction = 'E';
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    char getDirection() {
        return direction;
    }

    public boolean equals(Object o) {
        return getClass() == o.getClass();
    }

}
