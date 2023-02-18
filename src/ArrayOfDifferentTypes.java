//Program to print different array types
public class ArrayOfDifferentTypes {
    public static void print(Integer[] a){
        for (int i:a) {
            System.out.println(i);
        }
    }
    public static void print(Double[] a){
        for (double i:a) {
            System.out.println(i);
        }
    }
    public static void print(Character[] a){
        for (char i:a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Integer[] intValue= {1,2,3,4};
        Double[] doubleValue = {1.2,3.2,4.1,1.1};
        Character[] charValue = {'q','s','v','d'};
        ArrayOfDifferentTypes.print(intValue);
        ArrayOfDifferentTypes.print(doubleValue);
        ArrayOfDifferentTypes.print(charValue);
    }
}