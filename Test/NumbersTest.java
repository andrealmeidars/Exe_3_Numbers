import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumbersTest {

    private Numbers numbers;

    @Before
    public void setUp() throws Exception {
        this.numbers = new Numbers();

    }



    @Test
    public void returnSumWith2Numbers(){
        assertThat(numbers.getSumNumbers(1,2), is(3));
    }


    @Test
    public void returnDoubleValueWith2EqualsNumbers(){
        assertThat(numbers.getSumNumbers(2,2), is(8));
    }



}
