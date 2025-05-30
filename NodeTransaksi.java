public class NodeTransaksi {
    TransaksiPengisian data;
    NodeTransaksi prev;
    NodeTransaksi next;

    public NodeTransaksi(TransaksiPengisian data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
