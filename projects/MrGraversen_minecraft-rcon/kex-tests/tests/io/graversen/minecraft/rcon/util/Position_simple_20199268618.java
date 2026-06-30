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
import java.lang.Long;

public class Position_simple_20199268618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14870;
     Object term14871;
     Object term14873;
     Object term14875;

    public Position_simple_20199268618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14870 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        setField(term14870, term14870.getClass(), "x", null);
        setField(term14870, term14870.getClass(), "y", null);
        setField(term14870, term14870.getClass(), "z", null);
        term14871 = new Long(0L);
        term14873 = new Long(0L);
        term14875 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term14871;
        args[1] = term14873;
        args[2] = term14875;
        callMethod(klass, "simple", argTypes, term14870, args);
    }

};


