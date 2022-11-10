package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 0));

        List<Integer> emptyList = new ArrayList<>();

        int actual1 = App.take(numbers, 3).size();
        assertThat(actual1).isEqualTo(3);

        int actual2 = App.take(numbers, 7).size();
        assertThat(actual2).isEqualTo(7);

        List<Integer> actual3 = App.take(numbers, 0);
        assertThat(actual3).isEmpty();

        int actual4 = App.take(numbers, 13).size();
        assertThat(actual4).isEqualTo(10);

        List<Integer> actual5 = App.take(numbers, -1);
        assertThat(actual5).isEmpty();

        int actual6 = App.take(numbers, 9).size();
        assertThat(actual6).isEqualTo(9);

        List<Integer> actual7 = App.take(emptyList, 4);
        assertThat(actual7).isEmpty();
        // END
    }
}
