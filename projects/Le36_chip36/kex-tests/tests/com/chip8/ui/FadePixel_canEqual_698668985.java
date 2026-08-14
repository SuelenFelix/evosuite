package com.chip8.ui;

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
import static com.chip8.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class FadePixel_canEqual_698668985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396;
     Object term400;

    public FadePixel_canEqual_698668985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term397 = new Double(0.2641345529914265);
        term396 = newInstance(Class.forName("com.chip8.ui.FadePixel"));
        setField(term396, term396.getClass(), "fade", term397);
        setByteField(term396, term396.getClass(), "plane", (byte) -29);
        term400 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.ui.FadePixel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term400;
        callMethod(klass, "canEqual", argTypes, term396, args);
    }

};


