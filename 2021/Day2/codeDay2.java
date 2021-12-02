import java.io.File;
import java.util.Scanner;

class codeDay2{
    public static void main (String[] args){
        String input = "input";

        part1(input);
        part2(input);
    }

    public static void part1(String input){

        try{
            Scanner sc = new Scanner(new File("./2021/Day2/"+input));
            
            int posX=0; // la distance a droite
            int posY=0; // la profondeur (donc up -/down +)

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                int[] data = Direction(line);
                int direction = data[0];
                int distance = data[1];

                switch(direction){
                    case(1): //up
                        posY-=distance;
                        break;
                    case(3): //down
                        posY+=distance;
                        break;
                    case(2): //forward
                        posX+=distance;
                        break;
                    default:
                        System.out.println("sadge");
                }
            }
            System.out.println(posX*posY);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void part2(String input){

        try{
            Scanner sc = new Scanner(new File("./2021/Day2/"+input));
            
            int posX=0; // la distance a droite
            int posY=0; // la profondeur (donc up -/down +)
            int aim = 0;

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                int[] data = Direction(line);
                int direction = data[0];
                int distance = data[1];


                switch(direction){
                    case(1): //up
                        aim-=distance;
                        break;
                    case(3): //down
                        aim+=distance;
                        break;
                    case(2): //forward
                        posX+=distance;
                        posY+=(aim*distance);
                        break;
                    default:
                        System.out.println("sadge");
                }
            }
            System.out.println(posX*posY);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static int[] Direction(String line)
    {
        String[] splittedLine = line.split(" ");
        int dir = 0; // 1 up, 2 right, 3 down, 4 left (not used in part1)
        int value = Integer.parseInt(splittedLine[1]);

        switch(splittedLine[0]){
            case("forward"):
                dir = 2;
                break;
            case("up"):
                dir = 1;
                break;
            case("down"):
                dir = 3;
                break;
            default:
        }

        return new int[]{dir, value};
    }
}