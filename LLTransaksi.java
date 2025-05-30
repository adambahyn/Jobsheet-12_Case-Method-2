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

    public void print() {
        NodeTransaksi current = head;
        System.out.println("Daftar Transaksi: ");
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }
}
