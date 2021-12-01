import java.io.File;
import java.util.Scanner;

class code{
    public static void main (String[] args){
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
}