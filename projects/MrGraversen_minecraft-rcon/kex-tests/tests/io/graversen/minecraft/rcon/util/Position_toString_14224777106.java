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
import java.lang.Object;

public class Position_toString_14224777106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14800;

    public Position_toString_14224777106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14800 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14801 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14814 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14827 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14801, term14801.getClass(), "coordinate", "nGKItKLYNC");
        setField(term14800, term14800.getClass(), "x", term14801);
        setField(term14814, term14814.getClass(), "coordinate", "UiUYnPrcCi");
        setField(term14800, term14800.getClass(), "y", term14814);
        setField(term14827, term14827.getClass(), "coordinate", "UoYtihxVaS");
        setField(term14800, term14800.getClass(), "z", term14827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14800, args);
    }

};


