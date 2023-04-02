public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];              // Массив с пустыми ячейками
        for (int i = 0; i<numbers.length; i++){
            numbers [i] = i*10;                  //Помещаем в этот массив данные
        }
        for (int i = 0; i<numbers.length; i++){  // Выводим на экран, то что получилось
            System.out.println(numbers [i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3,4,5};            // Создаем массив и помещаем туда заранее данные
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers1 [i]);
        }
    }
}

