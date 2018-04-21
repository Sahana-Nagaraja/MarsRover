public enum MoveRight {
    N('E'), S('W'), E('S'), W('N');
    MoveRight(char direction) {
        this.direction = direction;
    }
    public char direction;
    public char getDirection(){
        return this.direction;
    }
}
