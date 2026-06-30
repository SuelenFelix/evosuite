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

public class Position_getX_14100945123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14590;

    public Position_getX_14100945123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14590 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14591 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14604 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14617 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14591, term14591.getClass(), "coordinate", "UlajhuVLaP");
        setField(term14590, term14590.getClass(), "x", term14591);
        setField(term14604, term14604.getClass(), "coordinate", "gGSMzuGICf");
        setField(term14590, term14590.getClass(), "y", term14604);
        setField(term14617, term14617.getClass(), "coordinate", "hxCBltsObl");
        setField(term14590, term14590.getClass(), "z", term14617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term14590, args);
    }

};


