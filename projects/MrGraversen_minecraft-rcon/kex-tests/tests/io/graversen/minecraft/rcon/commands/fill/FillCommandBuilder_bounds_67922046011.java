package io.graversen.minecraft.rcon.commands.fill;

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
import static io.graversen.minecraft.rcon.commands.fill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FillCommandBuilder_bounds_67922046011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4467;

    public FillCommandBuilder_bounds_67922046011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4467 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        setField(term4467, term4467.getClass(), "position1", null);
        setField(term4467, term4467.getClass(), "position2", null);
        setField(term4467, term4467.getClass(), "block", null);
        setField(term4467, term4467.getClass(), "replaceBlock", null);
        setField(term4467, term4467.getClass(), "fillMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "bounds", argTypes, term4467, args);
    }

};


