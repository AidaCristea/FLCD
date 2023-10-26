public class SymbolTable {

    HashTable hashTable;

    public SymbolTable(HashTable hashTable) {
        this.hashTable = hashTable;
    }

    public int getHashCode(String key) {
        return hashTable.hashFunction(key);
    }

    public void insert(String key) {
        hashTable.insert(key);
    }

    public boolean search(String key) {
        return hashTable.search(key);
    }

    public String find(String key) {
        return hashTable.findValue(key);
    }

    public String toString() {
        return "SymbolTable " + hashTable.toString();
    }
}
