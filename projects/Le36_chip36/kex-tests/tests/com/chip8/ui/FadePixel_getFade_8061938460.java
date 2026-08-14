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

public class FadePixel_getFade_8061938460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;

    public FadePixel_getFade_8061938460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term372 = new Double(0.13238746331190498);
        term371 = newInstance(Class.forName("com.chip8.ui.FadePixel"));
        setField(term371, term371.getClass(), "fade", term372);
        setByteField(term371, term371.getClass(), "plane", (byte) 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.ui.FadePixel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFade", argTypes, term371, args);
    }

};


