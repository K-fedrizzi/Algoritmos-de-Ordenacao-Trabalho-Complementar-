
package classe;


public class MergeSort 
{
    public void combinacao(String vet1[],int esq, int meio,int dir )
    {
        String vet2[] = new String[vet1.length];
        
        for(int i = 0; i < vet1.length;i++)
        {
            vet2[i] = vet1[i];
        }
        int i = esq;
        int j = meio+ 1;
        int k = esq;
        while(i <= meio && j <= dir)
        {
            if(vet2[i].compareToIgnoreCase(vet2[j]) < 0)
            {
                vet1[k++] = vet2[i++];
            }else{
                vet1[k++]= vet2[j++];
            }
        }
        while(i <= meio)
        {
            vet1[k++]= vet2[i++];
        }
        
    }
    public void mergeSort(String vet1[],int esq,int dir)
    {
        int meio;
        if(esq < dir)
        {
            meio = (esq + dir)/2;
            mergeSort(vet1, esq, meio);
            mergeSort(vet1, meio+1, dir);
            combinacao(vet1, esq, meio, dir);
        }
    }
}
