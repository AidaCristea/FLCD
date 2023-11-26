import FA.FiniteAutomata;
import scanner.PIF;
import util.FileCleaner;

public class Main {
    public static void main(String[] args) {

        FileCleaner fileCleaner = new FileCleaner();
        fileCleaner.cleaner("PIF1.out");
        fileCleaner.cleaner("PIF2.out");
        fileCleaner.cleaner("PIF3.out");
        fileCleaner.cleaner("PIF1Error.out");
        fileCleaner.cleaner("ST1.out");
        fileCleaner.cleaner("ST2.out");
        fileCleaner.cleaner("ST3.out");
        fileCleaner.cleaner("ST1Error.out");


        PIF pif = new PIF();
        pif.readProblem("p1.txt", "PIF1.out", "ST1.out");
        System.out.println();
        System.out.println();
        pif.readProblem("p2.txt", "PIF2.out", "ST2.out");
        System.out.println();
        System.out.println();
        pif.readProblem("p3.txt", "PIF3.out", "ST3.out");
        System.out.println();
        System.out.println();
        pif.readProblem("p1Error.txt", "PIF1Error.out", "ST1Error.out");

       /* FiniteAutomata fa1 = new FiniteAutomata("D:\\FACULTATE\\Materiale facultate 2023-2024\\LFTC\\Labs\\Lab3\\FLCD\\Lab2FLCD\\src\\FA\\Dummy.in");
        fa1.readFile();
        if(!fa1.isDFA())
        {
            System.out.println("Not valid fa");
        }

        boolean res = fa1.isAccepted("a2b");
        System.out.println(res);
        System.out.println(fa1.isAccepted("C5b"));
        System.out.println(fa1.isAccepted("c5b"));
*/

        /*FiniteAutomata fa2 = new FiniteAutomata("D:\\FACULTATE\\Materiale facultate 2023-2024\\LFTC\\Labs\\Lab3\\FLCD\\Lab2FLCD\\src\\FA\\IntegerConstant.in");
        fa2.readFile();
        if(!fa2.isDFA())
        {
            System.out.println("Not valid fa");
        }

        boolean res2 = fa2.isAccepted("a2b");
        System.out.println(res2);
        System.out.println(fa2.isAccepted("023"));
        System.out.println(fa2.isAccepted("723"));
        System.out.println(fa2.isAccepted("-10"));*/



        /*FiniteAutomata fa3 = new FiniteAutomata("D:\\FACULTATE\\Materiale facultate 2023-2024\\LFTC\\Labs\\Lab3\\FLCD\\Lab2FLCD\\src\\FA\\StringConstant.in");
        fa3.readFile();
        if(!fa3.isDFA())
        {
            System.out.println("Not valid fa");
        }

        boolean res3 = fa3.isAccepted("a2b");
        System.out.println(res3);
        System.out.println(fa3.isAccepted("\"dsf_dsd\""));*/


        /*FiniteAutomata fa4 = new FiniteAutomata("D:\\FACULTATE\\Materiale facultate 2023-2024\\LFTC\\Labs\\Lab3\\FLCD\\Lab2FLCD\\src\\FA\\Identifiers.in");
        fa4.readFile();
        if(!fa4.isDFA())
        {
            System.out.println("Not valid fa");
        }

        *//*boolean res4 = fa4.isAccepted("a2b");
        System.out.println(res4);*//*
        System.out.println(fa4.isAccepted("fsf"));
        System.out.println(fa4.isAccepted("sds_ds3jed"));
        System.out.println(fa4.isAccepted("ana8"));
        System.out.println(fa4.isAccepted("asms_jans3"));
        System.out.println(fa4.isAccepted("3eq"));*/
    }
}