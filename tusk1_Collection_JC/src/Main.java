public class Main {
    public static void main(String[] args) {
        // Пример массива
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Создаем фильтр, который удваивает каждый элемент
        Filter doubleFilter = new Filter() {
            @Override
            public Object apply(Object o) {
                if (o instanceof Integer) {
                    return (Integer) o * 2;
                }
                return o; // Возвращаем элемент без изменений, если не Integer
            }
        };

        // Применяем фильтр к массиву
        Object[] filteredArray = ArrayFilter.filter(numbers, doubleFilter);

        // Выводим результат
        for (Object num : filteredArray) {
            System.out.println(num);
        }
    }
}