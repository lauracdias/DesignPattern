package ordens.ordenacoes;

import ordens.Ordem;

public class ordenacaoSelectionSort implements Ordem
{
    @Override
    public int[] executaOrdenacao(int[] numeros)
    {
        for (int i = 0; i < numeros.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < numeros.length; j++)
            {
                if (numeros[j] < numeros[index])
                {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = numeros[index];
            numeros[index] = numeros[i];
            numeros[i] = smallerNumber;
        }
        return numeros;
    }
}
