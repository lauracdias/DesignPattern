import ordens.BubbleSort;
import ordens.InsertionSort;
import ordens.Ordenacao;
import ordens.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestOrdenacao
{
    Ordenacao ordenacao;

    @Test
    public void testeBubbleSort()
    {
        ordenacao = new BubbleSort();
        int[] numeros = {9, 16, 4};
        int[] resultadoObtido = ordenacao.executaOrdenacao(numeros);
        int[] resultadoEsperado = {4, 9, 16};
        assertArrayEquals(resultadoObtido, resultadoEsperado);
    }

    @Test
    public void testeInsertionSort()
    {
        ordenacao = new InsertionSort();
        int[] numeros = {10, 2, 5};
        int[] resultadoObtido = ordenacao.executaOrdenacao(numeros);
        int[] resultadoEsperado = {2, 5, 10};
        assertArrayEquals(resultadoObtido, resultadoEsperado);
    }

    @Test
    public void testeSelectionSort()
    {
        ordenacao = new SelectionSort();
        int[] numeros = {25, 8, 13};
        int[] resultadoObtido = ordenacao.executaOrdenacao(numeros);
        int[] resultadoEsperado = {8, 13, 25};
        assertArrayEquals(resultadoObtido, resultadoEsperado);
    }


}
