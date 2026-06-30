package io.basquiat.interfacebbuljit.noodle.domain.vo;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static io.basquiat.interfacebbuljit.noodle.domain.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Topping_init_3790970789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Topping_init_3790970789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[2] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[3] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[4] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


