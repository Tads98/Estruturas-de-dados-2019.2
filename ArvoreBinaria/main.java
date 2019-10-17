public class main{
public static void main(String[] args){
    ArvoreBinaria a = new ArvoreBinaria(3);
    No raiz = null;
    
    raiz = a.insert(raiz, 8);
    raiz = a.insert(raiz, 3);
    raiz = a.insert(raiz, 6);
    raiz = a.insert(raiz, 10);
    raiz = a.insert(raiz, 4);
    raiz = a.insert(raiz, 7);
    raiz = a.insert(raiz, 1);
    raiz = a.insert(raiz, 14);
    raiz = a.insert(raiz, 13);

    //raiz = a.delete(raiz, 1);
    //raiz = a.delete(raiz, 14);
    raiz = a.delete(raiz, 3);
    }
}