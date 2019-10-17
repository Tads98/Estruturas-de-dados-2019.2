class No
{
    private Object element;
    private No pai;
    //private Vector filhos = new Vector();
    No leftChild;
	No rightChild;
    
    public No(Object value)
    {
        this.pai = null;
        this.element = value;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public Object element()
    {
        return element;
    }

    public No parent()
    {
        return pai;
    }

    public void setelement(Object element)
    {
        this.element = element;
    }
    
    /*
    public void addChild(No o)
    {
        filhos.add(o);
    }
    public void removeChild(No o)
    {
        filhos.remove(o);
    }/
    public int childrenNumber()
    {
        return filhos.size();
    }
    public Iterator children()
    {
        return filhos.iterator();
    }*/

    public Object getelement(){
        return this.element;
    }

    public void setpai(No pai){
        this.pai = pai;
    }

    public No getpai(){
        return this.pai;
    }

    public void setleftChild(No leftChild){
        this.leftChild = leftChild;
    }

    public No getleftChild(){
        return this.leftChild;
    }

    public void setRightChild(No rightChild){
        this.rightChild = rightChild;
    }

    public No getrightChild(){
        return this.rightChild;
    }

    
    public int Height() {
        int leftHeight = 0, rightHeight = 0;

        if(this.leftChild != null){
            leftHeight = this.leftChild.Height();
        }

        if(this.leftChild != null){
            rightHeight = this.rightChild.Height();
        return 1 + Math.max(leftHeight, rightHeight);
        }
        return Height;
	}
}
