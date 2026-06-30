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

public class Position_getZ_14100964345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14730;

    public Position_getZ_14100964345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14730 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14731 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14744 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14757 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term14731, term14731.getClass(), "coordinate", "LvtrsXUliU");
        setField(term14730, term14730.getClass(), "x", term14731);
        setField(term14744, term14744.getClass(), "coordinate", "xLbjWUgOIL");
        setField(term14730, term14730.getClass(), "y", term14744);
        setField(term14757, term14757.getClass(), "coordinate", "jDtqGUpnZN");
        setField(term14730, term14730.getClass(), "z", term14757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZ", argTypes, term14730, args);
    }

};


