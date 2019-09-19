class Main {
    public static void main(String[] args) {
      StackArrayImplementation st = new StackArrayImplementation(3);
          st.push(34);
          st.push(314);
          st.push(24);
          st.push(14);
          st.push(40);
      //st.push('t');
      st.StackN(st);
  
          /*System.out.println(st.isEmpty());
          System.out.println(st.isFull());
          System.out.println(st.capacity);
          System.out.println(st.peek());
          System.out.println(st.pop());
          st.display();*/
  
    }
  }