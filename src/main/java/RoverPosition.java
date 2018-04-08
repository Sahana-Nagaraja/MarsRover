public class RoverPosition {
    public int x;
    public int y;
    public char direction;

    RoverPosition(int x, int y, char direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public char getDirection(){
        return direction;
    }

    public boolean equals(Object o){
        return getClass() == o.getClass();
    }

}
