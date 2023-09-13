import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        double correct = 0;
        for(int i = 0; i < 1000; i++) {
            //iterates through and adds a combination of 0, 0, and 1 to the list
            for(int h = 0; h < 3; h++) {
                list.add(0);
            }
            list.set((int) (Math.random() * 3), 1);
            int index = (int)(Math.random() * 3); //grabs random index from 0 - 2
            list.remove(index); //removes number at random index
            //iterates through list and removes the number 0 to simulate opening the door with
            //the goat in it
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) == 0) {
                    list.remove(j);
                    break;
                }
            }
            //sets the num variable equal to the element that's left in the list
            //(the other unopened door)
            int num = list.get(0);
            if(num == 1) {
                correct++;
            }
            list.clear();
        }
        System.out.println("The probability of getting the car when switching is " + Math.round((correct/1000) * 100) + "%");

        correct = 0;
        for(int i = 0; i < 1000; i++) {
            //iterates through and adds a combination of 0, 0, and 1 to the list
            for(int h = 0; h < 3; h++) {
                list.add(0);
            }
            list.set((int) (Math.random() * 3), 1);
            int index = (int)(Math.random() * 3); //grabs random index from 0 - 2
            //System.out.println("\tIndex picked was " + index + " which is the number " + list.get(index));
            if(list.get(index) == 1) {
                correct++;
            }
            list.clear();
        }
        System.out.println("The probability of getting the car without switching is " + Math.round(((correct / 1000) * 100)) + "%");
    }
}
