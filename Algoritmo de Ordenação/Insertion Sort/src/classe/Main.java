
package classe;


public class Main {

    
    public static void main(String[] args) 
    {
       String vet[] = {"Barracas Coloridas,","As","estao estragando","sol, da","no","varanda na casa da tia Zilda!!"};
       
        InsertionSort i = new InsertionSort();
        
        i.insertionSort(vet);
        for(int x = 0 ; x < vet.length;x++)
        {
            System.out.print(vet[x]+" ");
        }
    }
    
}
