import java.io.File;
import java.util.Scanner;

class codeDay1{
    public static void main (String[] args){
        // part1();
        part2();
    }

    public static void part1(){

        try{
            Scanner sc = new Scanner(new File("./2021/Day1/input"));
            String previousLine = sc.nextLine();
            int numOfIncrease = 0;

            while(sc.hasNextLine()){
                String currentLine = sc.nextLine();
                if(Integer.parseInt(currentLine) - Integer.parseInt(previousLine)>0){
                    numOfIncrease++;
                }

                previousLine = currentLine;
            }

            System.out.println(numOfIncrease);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void part2(){
        try{
            Scanner sc = new Scanner(new File("./2021/Day1/input"));
            
            String firstLine = sc.nextLine();
            String secondLine = sc.nextLine();
            String thirdLine = sc.nextLine();

            int numOfIncrease = 0;
            int triplet = Integer.parseInt(firstLine)+Integer.parseInt(secondLine)+Integer.parseInt(thirdLine);

            while(sc.hasNextLine()){
                firstLine = secondLine;
                secondLine = thirdLine;
                thirdLine = sc.nextLine();

                int curTriplet = Integer.parseInt(firstLine)+Integer.parseInt(secondLine)+Integer.parseInt(thirdLine);

                if((curTriplet - triplet)>0){
                    numOfIncrease++;
                }

                triplet = curTriplet;
            }

            System.out.println(numOfIncrease);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}