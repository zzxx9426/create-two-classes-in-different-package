package com.github.hcsp;

import com.github.hcsp.pet2.Cat;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        Home home = new Home();
        home.cat = new com.github.hcsp.pet1.Cat();
        home.cat = new Cat();
    }
}
