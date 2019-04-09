
package classe;


public class QuickSort 
{
    public int Partition(String vet[],int inicio, int fim)
    {
        int i = inicio;
        int j = fim;
        String pivot = vet[(inicio + fim)/2];
        
        while(i <= j)
        {
            
           while(vet[i].compareToIgnoreCase(pivot) < 0) 
           {
               i++;
           }
           while(vet[j].compareToIgnoreCase(pivot) > 0)
           {
               j--;
           }
           if(i <= j)
           {
               String troca = vet[i];
                     vet[i]  = vet[j];
                     vet[j]  = troca;
                     i++;
                     j--;
           }
        }
        return i;
    }
    public void quickSort(String vet[],int inicio,int fim)
    {
        int i = Partition(vet, inicio, fim);
        if(inicio < i-1)
        {
            quickSort(vet, inicio, i-1);         
        }
        if(inicio < fim)
        {
            quickSort(vet, i, fim);
        }
    }
}
