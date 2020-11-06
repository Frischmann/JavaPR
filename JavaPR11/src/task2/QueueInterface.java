package task2;

public interface QueueInterface<E> {
    // Инвариант - n >= 0, для любого i = 1..n: a(i) != null

    //Контракты описаны ниже:
    //pre: elem != null
    //post: n = n' + 1 ∧ ∀i=1..n' : a[i]' = a[i] ∧ a[n] = elem
    void enqueue(E elem);

    // pre: n > 0
    // post: ℝ = a[n] ∧ n = n' ∧ ∀i=1..n : a[i]' = a[i]
    E element();

    // pre: n > 0
    // post: ℝ = a[n] ∧ n = n' − 1 ∧ ∀i=1..n : a[i]' = a[i]
    E dequeue();

    // post: ℝ = n ∧ n = n' ∧ ∀i=1..n : a[i]' = a[i]
    int size();

    // post: ℝ = n > 0 ∧ n = n' ∧ ∀i=1..n : a[i]' = a[i]
    boolean isEmpty();

    //post: ℝ = 0
    void clear();

    //Схожих частей классов LinkedQueue и ArrayQueue не найдено,
    // создание базового класса AbstractQueue невеозможно.
}
