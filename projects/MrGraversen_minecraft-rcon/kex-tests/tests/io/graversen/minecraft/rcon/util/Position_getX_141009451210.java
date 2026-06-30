package io.graversen.minecraft.rcon.util;

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
import static io.graversen.minecraft.rcon.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Position_getX_141009451210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14878;

    public Position_getX_141009451210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14878 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        setField(term14878, term14878.getClass(), "x", null);
        setField(term14878, term14878.getClass(), "y", null);
        setField(term14878, term14878.getClass(), "z", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term14878, args);
    }

};


