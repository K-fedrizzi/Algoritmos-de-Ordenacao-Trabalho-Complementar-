
package classe;


public class Main {

    
    public static void main(String[] args) 
    {
        String vet[] = {"Camelias","As","floreceram","no manha da","sabado de ","noite de","Taubate"};
        MergeSort m = new MergeSort();
        
        m.mergeSort(vet, 0, vet.length-1);
        for(int i = 0; i < vet.length;i++)
        {
            System.out.print(vet[i]+" ");
        }
    }
    
}
