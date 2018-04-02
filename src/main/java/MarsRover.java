import javax.xml.soap.SOAPPart;

public class MarsRover {

    private String getDirections(int final_x, int final_y, int x_co, int y_co, char direction, String pattern) {
        for(int i=0; i<pattern.length();i++){
            if(pattern.charAt(i)=='L'){
                if(direction=='N'){
                    direction = 'W';
                }
                else if(direction == 'W'){
                    direction = 'S';
                }
                else if(direction == 'S'){
                    direction = 'E';
                }
                else if(direction == 'E'){
                    direction = 'N';
                }
            }
            if(pattern.charAt(i)=='R'){
                if(direction=='N'){
                    direction = 'E';
                }
                else if(direction == 'E'){
                    direction = 'S';
                }
                else if(direction == 'S'){
                    direction = 'W';
                }
                else if(direction == 'W'){
                    direction = 'N';
                }

            }
            if(pattern.charAt(i)=='M'){
                if(direction == 'E') {
                    x_co = x_co + 1;
                }
                if(direction =='W'){
                    x_co = x_co - 1;
                }
                if(direction == 'N'){
                    y_co = y_co +1;
                }
                if(direction == 'S')
                {
                    y_co = y_co-1;
                }
            }
        }
        System.out.println(x_co+" "+y_co+" "+direction);
        return x_co+" "+y_co+" "+direction;
    }

    public static void main(String args[]) {
        MarsRover marsRover = new MarsRover();
        marsRover.getDirections(5,5,1, 2, 'N', "LMLMLMLMM");
        marsRover.getDirections(5,5,3, 3, 'E', "MMRMMRMRRM");

    }
}