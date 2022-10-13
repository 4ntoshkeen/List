package needs;
import java.util.*;

public class MyClass<L> implements List<L>{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<L> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(L l) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends L> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends L> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public L get(int index) {
        return null;
    }

    @Override
    public L set(int index, L element) {
        return null;
    }

    @Override
    public void add(int index, L element) {

    }

    @Override
    public L remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<L> listIterator() {
        return null;
    }

    @Override
    public ListIterator<L> listIterator(int index) {
        return null;
    }

    @Override
    public List<L> subList(int fromIndex, int toIndex) {
        return null;
    }
}
