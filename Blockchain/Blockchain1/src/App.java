import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       String statement1 = "My name is Ayan Kanti Das";
       int hashvalue = statement1.hashCode();
       System.out.println("Statement = " + statement1 + " whose hasvalue is = " + hashvalue);

       String [] list1 = {"alex", "goldy", "ayan"};
       String [] list2 = {"alex", "goldy", "ayan"};

       int hash1 = Arrays.hashCode(list1);
       int hash2 = Arrays.hashCode(list2);
        System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);


       String [] list3 = {"alex", "goldy", "ayan"};
       String [] list4 = {"alex", "goldy", "Ayan"};

       int hash3 = Arrays.hashCode(list3);
       int hash4 = Arrays.hashCode(list4);
       System.out.println("hash3 = " + hash3 + " hash4 = " + hash4);


       //demonstrate a series of block chain
       ArrayList<block> blockChain = new ArrayList<block>();

       String[] initialValues = {"Ayan have $200", "Sam have $300"};
       block firstBlock = new block(initialValues, 0);
       blockChain.add(firstBlock);
       System.out.println("First Block is : " + firstBlock.toString());
       System.out.println("The block chain is " + blockChain.toString());

        //block 2
       String[] ayanGive = {"Ayan give Tim $20", "Ayan give Sim $60", "Ayan give Rim $30"};
       block secondBlock = new block(ayanGive, firstBlock.getBlockHash());
       blockChain.add(secondBlock);
       System.out.println("Second  Block is : " + secondBlock.toString());
       System.out.println("The block chain is " + blockChain.toString());

       //block 3
       String[] ayangetSomeBack = {"Tim give Ayan $10", "Sim give Ayan $30", "Rim give Ayan $90"};
       block thirdBlock = new block(ayangetSomeBack, firstBlock.getBlockHash());
       blockChain.add(thirdBlock);
       System.out.println("Third  Block is : " + thirdBlock.toString());
       System.out.println("The block chain is " + blockChain.toString());

        
    }
}
