public class Heap{
    
    private int[] heap;
    private int size;

    //COntrutor
    public Heap(int capacity){
        heap = new int[capacity];
    }

    //Método inserir com excessão isFull
    public void insert(int V){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }

        //Retorna o valor redimensionado
        heap[size] = V;

        fixHeapAbove(size);
        size++;
    }

    public int delete(int i) {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }

        int parent = getParent(i);
        int deleteV = heap[i];

        heap[i] = heap[size -1];
        //return heap[i] = heap[size -1];
        if(i == 0 || heap[i] < heap[parent]){
            fixHeapBelow(i, size - 1);
        }else{
            fixHeapAbove(i);
        }

        size--;

        return deleteV;
    }
    
    //Heap-Sort Extra
    public void sort(){
        int lastheapi = size -1;
        for (int i = 0; i < lastheapi; i++){
            int aux = heap[0];
            heap[0] = heap[lastheapi - i];
            heap[lastheapi - i] =  aux;

            fixHeapBelow(0, lastheapi -i -1);

        }
    }

    public int removeMin(){
        //System.out.println("Size " + heap[size - 1]+ " root " + heap[0]);
        int root = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = root;
        size--;
        fixHeapBelow(0, size - 1);
        return root;

    }

    //Verifica o valor do pai "acima" para ajustar com o do filho
    private void fixHeapAbove(int i){
        int newV = heap[i];
        while (i > 0 && newV > heap[getParent(i)]){
           heap[i] = heap[getParent(i)];
           i = getParent(i); 
        }

        heap[i] = newV;
    }

    //Reajusta a partir dos elementos da heap presentes abaixo
    private void fixHeapBelow(int i, int lastHeapI){
        int childToSwap;

        //Verifica se tem filho a esquerda e ou se tem filho a direita
        while(i <= lastHeapI){
            int leftChild = getChild(i, true);
            int rightChild = getChild(i, false);
            if(leftChild <= lastHeapI){
                if(rightChild > lastHeapI){
                    childToSwap = leftChild;
                }else{
                    //Verifica qual o maior filho a esquerda ou a direita
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
                //Se o indice é menor do que o filho e fazer a troca 
                if (heap[i] < heap[childToSwap]){
                    int aux = heap[i];
                    heap[i] = heap[childToSwap];
                    heap[childToSwap] = aux;
                }else{
                    break;
                }

                //Compara o novo indice com seu filho(s)
                i = childToSwap;
            }else{
                break;
            }
        }
    }

    //Heap a heap
    public void printHeap(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    //Verifica se está cheio
    public boolean isFull(){
        return size == heap.length;
    }

    //Verifica o pai da ramificação
    public int getParent(int i){
        return (i - 1)/2;
    }
    
    //Retorna se estiver vazio
    public boolean isEmpty(){
        return size == 0;
    }

    //Height
    public int Height(int i){
        int cont = 0;
        while(heap[i] != 0){
            if(i >= size -1){
            break;
            }
            cont++;
            i = 2 * i + 1;
        }
        return cont;
    }
    //Deep
    public int Deep(int i){
        int cont = 0;
        while(heap[i] != heap[0]){
            cont++;
            i = getParent(i);
        }
        return cont;
    }

    //HeapSort

    //Cálculo de filho esquerdo ou direito
    public int getChild(int i, boolean left){
        return 2 * i + (left ? 1 : 2);
    }
}
