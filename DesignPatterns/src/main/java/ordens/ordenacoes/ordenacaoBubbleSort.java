package ordens.ordenacoes;

import ordens.Ordem;

public class ordenacaoBubbleSort implements Ordem
{
    @Override
    public int[] executaOrdenacao(int[] numeros)
    {
        int n = numeros.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(numeros[j-1] > numeros[j])
                {
                    temp = numeros[j-1];
                    numeros[j-1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        return numeros;
    }
}
