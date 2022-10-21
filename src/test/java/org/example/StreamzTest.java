package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamzTest {
    @Test
    public void tyghj(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
        //when

        //then
        assertThat(streamz.getResult(values)).isEqualTo(8);
    }
}
