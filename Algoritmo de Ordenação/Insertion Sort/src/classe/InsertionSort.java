
package classe;


public class InsertionSort 
{
    public void insertionSort(String vet[])
    {
        for(int i  = 1; i < vet.length; i++)
        {
            int  j = i;
            
           while(j > 0 && vet[j].compareToIgnoreCase(vet[j-1]) < 0)
           {
               String troca = vet[j];
                   vet[j] = vet[j-1];
                   vet[j-1] = troca;
                      
                      j = j-1;
           }
        }
    }
}
