public class Main {
    public static void main(String[] args) {
        SymbolTable sb = new SymbolTable(new HashTable(5));

        System.out.println(sb.getHashCode("A message"));

        sb.insert("a");
        sb.insert("-s");
        sb.insert("1");
        sb.insert("aa");
        sb.insert("aa");
        sb.insert("ana");

        System.out.println(sb);
        System.out.println(sb.find("aa"));
        System.out.println(sb.search("flcd"));
        System.out.println(sb.search("ana"));
    }
}