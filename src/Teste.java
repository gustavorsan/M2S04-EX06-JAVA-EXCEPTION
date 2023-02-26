public class Teste {
    public void Validar(String valorCampo,Integer tamanhoMaximo) throws TamanhoInvalidoException {
        if(valorCampo == null || tamanhoMaximo == null){
            throw new IllegalArgumentException("Parametro inválido");
        }
        if(valorCampo.length() > tamanhoMaximo){
            throw new TamanhoInvalidoException("Tamanho iválido");
        }
    }
}
