import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10, 20); i++)
            numbers.add(random.nextInt(100));

        System.out.println("Произвольный ряд чисел: " + numbers);

        while (numbers.size() > 1)
        {
            numbers = pairSum(numbers);
            if (numbers.size() > 1)
                System.out.println("Промежуточный результат: " + numbers);
            else
            {
                System.out.println("Итоговое число: " + numbers.getFirst());
                break;
            }
        }
    }


    private static List<Integer> pairSum(List<Integer> numbers)
    {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i += 2)
            result.add(numbers.get(i) + numbers.get(i + 1));

        if (numbers.size() % 2 != 0)
            result.add(numbers.getLast());

        return result;
    }
}
