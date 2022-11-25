public interface BagADT<T> {
    void add(T type, int howMany);
    void discard();
    int getSize();
    void toArray();
    void isFull();
}
