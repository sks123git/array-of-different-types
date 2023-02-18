//Program to print different array types using Generics
public class ArrayOfDifferentTypes {
    public static <E> void print(E[] array){    //
        for (E i:array) {
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