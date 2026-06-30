package com.zxl.dailypractice.card.two.april.april7;

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
import static com.zxl.dailypractice.card.two.april.april7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_main_13771480132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public Solution_main_13771480132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = (Object[]) newArray("java.lang.String", 5);
        setElement(term46, 0, "MuLcgQHgqz");
        setElement(term46, 1, "xxtlPwDYFs");
        setElement(term46, 2, "jJCZpVmanW");
        setElement(term46, 3, "EGtDIRbSSb");
        setElement(term46, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april7.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term46;
        callMethod(klass, "main", argTypes, null, args);
    }

};


