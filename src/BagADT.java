public interface BagADT<T> {
    void add(T type);
    T removeLast();
    int getSize();
    T toArray();
    void isFull();

    void displayBag();
}
