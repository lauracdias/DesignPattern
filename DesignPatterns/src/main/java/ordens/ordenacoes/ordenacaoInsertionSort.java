package ordens.ordenacoes;

import ordens.Ordem;

public class ordenacaoInsertionSort implements Ordem
{
    @Override
    public int[] executaOrdenacao(int[] numeros)
    {
        int n = numeros.length;
        for (int j = 1; j < n; j++)
        {
            int key = numeros[j];
            int i = j-1;
            while ((i > -1) && ( numeros [i] > key))
            {
                numeros [i+1] = numeros [i];
                i--;
            }
            numeros[i+1] = key;
        }
        return numeros;
    }
}
