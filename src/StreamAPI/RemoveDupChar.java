package StreamAPI;

public class RemoveDupChar {

    public static void RemoveDup(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        string.chars().distinct().forEach(c->stringBuilder.append((char) c));

        System.out.println(stringBuilder);
    }

    public static void main(String []args)
    {
        RemoveDupChar.RemoveDup("Proooggraamiingggg");
    }
}