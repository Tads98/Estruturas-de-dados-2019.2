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

    //Cálculo de filho esquerdo ou direito
    public int getChild(int i, boolean left){
        return 2 * i + (left ? 1 : 2);
    }
}
