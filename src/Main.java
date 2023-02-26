public class Main {
    public static void main(String[] args) {
        Teste teste = new Teste();

        try {
            teste.Validar("teste",2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            teste.Validar("teste",8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            teste.Validar("teste",null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}