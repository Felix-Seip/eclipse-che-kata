package day.hacking.wordwrap;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class WrapperTest {

    @Test
    public void wrap_twoWords_twoLines() {
        // Arrange

        // Act
        String result = new Wrapper().wrap("Hello World", 10);

        // Assert
        assertThat(result).isNotNull();
    }

}



