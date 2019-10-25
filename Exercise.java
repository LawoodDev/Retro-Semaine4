class Exercise {

    static String hello = "Hello world";
    //TODO This fonction should display hello to someone using the variable above
    public static void sayHelloTo(String name){
        System.out.println(name);
    }

    //TODO Correct this syntax to make this to work, this should display all elment of a tab used in parameter
    public static void displayTab(int[] faketab){
        int[] mytab = {1,2,3}
        for(; a< myTab.length; a++){
            int a = 0;
            if(true) {
                boolean b = true;
            }
            if(b) {
                System.out.print(mytab[a] + " ");
            }
        }
    }

    //TODO Make this fonction work to add a to b
    //Utilisation: addAtoB(4,5) dont la valeur de retour est 9 dans cette exemple
    public static int addAtoB(int a,){
        int b;
        return a+b
    }

    // Executing this program should display:
    // sayHelloTo(monAmis)->"Hello my firend."
    // displayTab(mytab)-> 43 75 765 90 87
    // sayHelloTo(a,b)-> 9
    public static void main(String[] args) {
        // Dont touch this
        int b = 9;
        int a = 6;
        String[] monAmis = " my friend."
        int[] mytab = {43, 75, 765, 90, 87};
        // Dont touch this up

        sayHelloTo(monAmis);
        displayTab(mytab);
        System.out.println(addAtoB(b));

    }
}