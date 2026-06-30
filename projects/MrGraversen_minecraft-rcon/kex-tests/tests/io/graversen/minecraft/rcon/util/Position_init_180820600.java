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

public class Position_init_180820600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14515;
     Object term14528;
     Object term14541;

    public Position_init_180820600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14515 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14515, term14515.getClass(), "coordinate", "nyiiPDVjAc");
        term14528 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14528, term14528.getClass(), "coordinate", "aKnKipADSo");
        term14541 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14541, term14541.getClass(), "coordinate", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Coordinate");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Coordinate");
        argTypes[2] = Class.forName("io.graversen.minecraft.rcon.util.Coordinate");
        Object[] args = new Object[3];
        args[0] = term14515;
        args[1] = term14528;
        args[2] = term14541;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


