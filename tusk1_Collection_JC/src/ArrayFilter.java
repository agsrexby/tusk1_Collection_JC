import java.lang.reflect.Array;

public class ArrayFilter {

    public static Object[] filter(Object[] array, Filter filter) {
        Object[] result = (Object[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        int index = 0;

        for (Object element : array) {
            // Применяем фильтр к элементу
            Object filteredElement = filter.apply(element);
            // Добавляем результат в новый массив
            result[index++] = filteredElement;
        }

        return result;
    }
}