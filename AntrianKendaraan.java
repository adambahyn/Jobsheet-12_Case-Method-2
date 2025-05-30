public class AntrianKendaraan {
    Kendaraan[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianKendaraan(int n) {
        max = n;
        data = new Kendaraan[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
    
    public void tambahAntrian(Kendaraan input) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            rear = (rear + 1) % max;
            data[rear] = input;
            size++;
            System.out.println(">> Kendaraan masuk ke antrian.");
        }
    }

    public Kendaraan layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada kendaraan di antrian.");
            return null;
        } else {
            Kendaraan dequeued = data[front];
            front = (front + 1) % max;
            size--;
            return dequeued;
        }
    }

    public void print() {
        System.out.println("-- Antrian Kendaraan --");
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Kendaraan: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public int jumlahKendaraan() {
        return size;
    }
}