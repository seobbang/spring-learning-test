package cholog;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() { // String 클래스의 replace 메서드를 익히기 위한 테스트
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void  split() {
        String[] splitArray = "1,2".split(",");
        assertThat(splitArray).contains("1","2");
    }

    @Test
    void splitExactly() {
        String[] splitArray = "1".split(",");
        assertThat(splitArray).containsExactly("1");
    }
}

