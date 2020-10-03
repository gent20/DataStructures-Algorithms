package gent.datastructureandalgorithms.hashtables.hashtables_linearprobing;

public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }


    public void put(String key, Employee employee){

        int hashedKey = hashKeys(key);
        if(occupied(hashedKey)){

            //this is called Linear Probing
            //check the whole hashTable, if to the end, back to index=0;
            // Hit the stopIndex means checked the whole hashtable
            int stopIndex = hashedKey;

            if(hashedKey==hashtable.length-1){
                hashedKey=0;
            }
            else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey!=stopIndex){
                hashedKey = (hashedKey +1) % hashtable.length;
            }
        }

        if(occupied(hashedKey)){
            System.out.println("Sorry there is already an employee at position"+hashedKey);
        }
        else{
            hashtable[hashedKey]=new StoredEmployee(key,employee);
        }
    }


    public Employee get(String key){//O(1)
        int hashedKey = findKey(key);
        if(hashedKey==-1){
            return null;
        }

        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey  = findKey(key);
        if(hashtable[hashedKey]==null){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        //rehash the entire hashtable
        StoredEmployee[] oldhashtable = hashtable;
        hashtable = new StoredEmployee[oldhashtable.length];
        for(int i =0;i<oldhashtable.length;i++){
            if(oldhashtable[i]!=null){
                put(oldhashtable[i].key, oldhashtable[i].employee);
            }
        }
        return employee;
    }


    private int hashKeys(String key){
        return key.length() % hashtable.length;
    }


    private int findKey(String key){
        int hashedKey = hashKeys(key);
        if(hashtable[hashedKey]!=null &&
                hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        }
        else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        //find the employee or looked up the whole hashtable
        if(hashtable[hashedKey]!= null &&
                hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }
    }


    private boolean occupied(int hashedkey){
        return hashtable[hashedkey]!=null;
    }


    public void printHashtable(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("empty");
            }
            else{
                System.out.println("position"+i+": "+hashtable[i].employee);
            }
        }
    }


}