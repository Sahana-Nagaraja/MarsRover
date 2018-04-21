public enum MoveLeft {
    N('W'), S('E'), E('N'), W('S');
    MoveLeft(char direction) {
        this.direction = direction;
    }
    public char direction;
    public char getDirection() {
        return this.direction;
    }
}
