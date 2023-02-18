//Program to print different array types using Generics
public class ArrayOfDifferentTypes<E> {
    private E[] array;

    public ArrayOfDifferentTypes(E[] array){
        this.array=array;
    }
    public void toPrint(){
        ArrayOfDifferentTypes.toPrint(this.array);
    }
    public static <E> void toPrint(E[] array){    //
        for (E i:array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer[] intValue= {1,2,3,4};
        Double[] doubleValue = {1.2,3.2,4.1,1.1};
        Character[] charValue = {'q','s','v','d'};
        new ArrayOfDifferentTypes(intValue).toPrint();
        ArrayOfDifferentTypes.toPrint(doubleValue);
        ArrayOfDifferentTypes.toPrint(charValue);
    }
}