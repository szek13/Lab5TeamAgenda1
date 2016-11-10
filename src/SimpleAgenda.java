public class SimpleAgenda {

    static String[] listName = new String[3]; // store the names
    static int index=0;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int option=0;
        do {

            // afisare meniu
            System.out.println("1.Display Names");
            System.out.println("2.Add Name");
            System.out.println("3.Delete Name");
            System.out.println("4.Exit");


            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1: print();break;
                case 2: add();break;
                case 3: del();break;

            }


        }
        while(option!=4);

    }

    static void add() {

        // de optimizat cand se umple agenda

        // de optimizat daca deja exista o pers cu acel nume
        if (index < listName.length) {
            String name = SkeletonJava.readStringConsole("Add Name:");
            listName[index] = name;
            index++;
        } else {
            System.out.println("Memory full, please delete");
        }
    }


    static void print() {
        for(index=0; index<listName.length; index++) {
            System.out.println(listName[index]);
        }
    }

    static void del() {

        // citeste un nume
        // il cauta in array
        //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";
        SkeletonJava.readIntConsole("Add Name");
        for(SkeletonJava.readIntConsole("Add Name");
        if ("AddName".equals(listName[index])) {
            listName[index] = "";


        }

    }
    static void modify() {

        // citeste un nume
        // il cauta in array
        // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou
        SkeletonJava.readIntConsole("Add Name");
        for(SkeletonJava.readIntConsole("Add Name"){
            if("Add Name".equals(listName[index])){
                System.out.println("Please enter new Name: ");
                listName[index]=SkeletonJava.readIntConsole();
            }

        }
    }


}

