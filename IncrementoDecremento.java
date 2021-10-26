public class IncrementoDecremento {
    
    public static void main(String[] args){
        int count = 10;
        // Incremento
        count++;
        count++;
        // Pre-incremento
        System.out.println(++count);
        System.out.println(count);

        // Decremento
        count--;
        count--;
        // Pre-decremento
        System.out.println(--count);
        System.out.println(count);

        // Atajos de asignacion
        // count=count-5;
        count-=5;
        System.out.println(count);

    }

}
