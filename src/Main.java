import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        BinarySearch binarySearch = new BinarySearch();
        TemperatureConverter temperatureConverter = new TemperatureConverter(10);
        int[] array = new int[]{5,1,4,9,6,2};
        bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int index = binarySearch.binarySearch(array,5,0,array.length-1);
        System.out.println(index);
        System.out.println(temperatureConverter.convertToCalvin());
        System.out.println(temperatureConverter.convertToFahrenheit());
        System.out.println(temperatureConverter.convertToReomur());

    }
}
