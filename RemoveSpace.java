import java.util.Scanner;

public class RemoveSpace {
    public void spaceRemove(String input) {
        String output = "";
        char[] a = input.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ' && a[i] != '\t') {
                output += a[i];
            }
        }
        System.out.println(output);

    }

    public void RemoveSpaceInString(String s) {
        System.out.println(s.replaceAll("\\s+", ""));
        System.out.println("-----------------");
        System.out.println(s.replaceAll(" ", ""));
    }

    public static void main(String[] args) {
        RemoveSpace foo = new RemoveSpace();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        foo.RemoveSpaceInString(s);
        sc.close();

    }
}
