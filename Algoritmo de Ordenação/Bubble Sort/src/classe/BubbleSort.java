
package classe;


public class BubbleSort 
{
    public void bubbleSort(String vet[])
    {
        for(int i = 0;i < vet.length;i++)
        {
            for(int j = 0; j < vet.length;j++)
            {
                if(vet[i].compareToIgnoreCase(vet[j])< 0)
                {
                    String troca = vet[i];
                          vet[i] = vet[j];
                          vet[j] = troca;
                }
            }
        }
    }
}
