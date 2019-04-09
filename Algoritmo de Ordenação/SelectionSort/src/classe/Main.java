
package classe;


public class Main {

    
    public static void main(String[] args) 
    {
        String vet[] = {"Brenda flores,","A","da","escada","caiu","grave,","foi","morreu"};
        SelectionSort s = new SelectionSort();
        s.selectionSort(vet);
        for(int  i = 0 ; i < vet.length; i++)
        {
            System.out.print(vet[i]+" ");
        }
    }
    
    
}
