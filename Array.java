//Classe Array
public class Array {
    private Pet[] lista=new Pet[3];
    private int contador=0;

    /**
     * insere um objeto do tipo Pet no array lista.
     * @param pet
     */
    public void inserir(Pet pet){
        lista[contador++]=pet;
        //lista[contador]=pet;
        // contador++; pode ser dessa maneira.
    }
/**
 * Exibir todo os cadastros armazenados em lista.
 */
    public void exibir(){
        for(int i=0 ; i < contador ; i++){
            System.out.println(lista[i]);
        }
    }
}