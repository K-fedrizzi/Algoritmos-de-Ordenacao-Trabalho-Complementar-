
package classe;


public class Main {

    
    public static void main(String[] args) 
    {
        String vet[] = {"as","para onde","Brancas","estou","casas do quarteirao","Sao lindas!"};
        BubbleSort b  = new BubbleSort();
        b.bubbleSort(vet);
        for(int  i = 0; i < vet.length;i++)
        {
            System.out.print(vet[i]+" ");
        }
    }
    
}
