import java.util.*;
class CompareTwoLists{
    public static void main(String args[]){
        List <String> List1 = new ArrayList();
        System.out.println("Enter the input for first list");
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        List1.add(string1);

        List <String> List2 = new ArrayList();
        System.out.println("Enter the input for second list");
        Collections.sort(List1);

        String string2 = input.nextLine();
        List2.add(string2);
        Collections.sort(List2);

        for (int i = 0; i < List1.size(); i++) {
        }
        System.out.println(List1);

        for (int i = 0; i < List2.size(); i++) {
        }
        System.out.println(List2);

        System.out.println(List1.equals(List2));
    }
}
