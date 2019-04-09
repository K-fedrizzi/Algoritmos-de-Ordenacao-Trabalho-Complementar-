
package classe;


public class Main {

    
    public static void main(String[] args) 
    {
       String vet[] = {"restaurante do meu","tio","A","avenida JK","esta localizado o","wilson"}; 
       QuickSort q = new QuickSort();
       q.quickSort(vet, 0, vet.length-1);
       
       for(int i = 0; i < vet.length;i++)
       {
           System.out.print(vet[i]+" ");
       }
    }
    
}
