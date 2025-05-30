public class LLTransaksi {
    NodeTransaksi head, tail;

    public LLTransaksi() {
        head = null;
        tail = null;
    }

    
    boolean isEmpty() {
        return head == null;
    }

      public void addLast(TransaksiPengisian data) {
        NodeTransaksi newNode = new NodeTransaksi(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
}
