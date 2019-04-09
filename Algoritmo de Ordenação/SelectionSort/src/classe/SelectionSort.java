
package classe;


public class SelectionSort 
{
    public void selectionSort(String vet[])
    {
        for(int  i = 0 ; i < vet.length-1;i++)
        {
            int min = i;
            for(int j = i+1; j < vet.length;j++)
            {
                if(vet[j].compareToIgnoreCase(vet[min]) < 0)
                {
                    min = j;
                }
            }
            if(i != min)
            {
                String troca = vet[i];
                      vet[i] = vet[min];
                    vet[min] = troca;
                
            }
        }
    }
}
