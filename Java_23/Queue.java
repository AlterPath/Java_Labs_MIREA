//Шаг 1
public interface Queue<E> {
    void enqueue(E element); // Добавление элемента в конец очереди
    E dequeue(); // Получение и удаление элемента из начала очереди
    E peek(); // Получение элемента из начала очереди (без удаления)
    boolean isEmpty(); // Проверка, пуста ли очередь
    int size(); // Получение размера очереди
    void clear(); // Очистка очереди (удаление всех элементов)
}

