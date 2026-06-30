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

public class Position_getY_14100954734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14660;

    public Position_getY_14100954734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14660 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14661 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14674 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14687 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14661, term14661.getClass(), "coordinate", "BndsHwAFMv");
        setField(term14660, term14660.getClass(), "x", term14661);
        setField(term14674, term14674.getClass(), "coordinate", "GzFkzHGYFt");
        setField(term14660, term14660.getClass(), "y", term14674);
        setField(term14687, term14687.getClass(), "coordinate", "tShwQLRGNe");
        setField(term14660, term14660.getClass(), "z", term14687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term14660, args);
    }

};


