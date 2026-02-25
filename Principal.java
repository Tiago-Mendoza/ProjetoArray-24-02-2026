public class Principal {

    public static void main(String[] args) {
        
        Array array = new Array();
        Pet pet1 = new Pet("mel","SRD", 13.1f, 1);
        Pet pet2 = new Pet("Gaia","SRD", 15.1f, 2);
        //chamadas dos métodos.
        
        array.inserir(pet1);
        array.inserir(pet2);
        array.exibir();

    }
}