package ordens;

import ordens.Ordem;

public abstract class Ordenacao
{
    protected Ordem ordenacaoEscolhida;

    public int[] executaOrdenacao (int[] numeros)
    {
        return ordenacaoEscolhida.executaOrdenacao(numeros);
    }

    public Ordem getOrdenacaoEscolhida() {
        return ordenacaoEscolhida;
    }

    public void setOrdenacaoEscolhida(Ordem ordenacaoEscolhida) {
        this.ordenacaoEscolhida = ordenacaoEscolhida;
    }
}
