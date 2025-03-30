public class Test {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        System.out.println("Hello world!");

        int a = 1;
        System.out.println(Integer.toString(a));

        String name = "Rahul Kumar";
        System.out.println(name);

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     i++;
        // }

        // star pattern
        for(int i = 0; i<5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }
}
