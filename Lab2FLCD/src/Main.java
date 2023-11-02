import scanner.PIF;
import symbolTbl.HashTable;
import symbolTbl.SymbolTable;
import util.FileCleaner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        FileCleaner fileCleaner= new FileCleaner();
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


    }
}