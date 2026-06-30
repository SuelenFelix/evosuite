package io.graversen.minecraft.rcon.commands;

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
import static io.graversen.minecraft.rcon.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpawnPointCommand_init_19593659100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;
     Object term2291;

    public SpawnPointCommand_init_19593659100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2278 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2278, term2278.getClass(), "targetString", "aSkmSwTnEw");
        term2291 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2292 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2305 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2318 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term2292, term2292.getClass(), "coordinate", "xvkbvaEGYd");
        setField(term2291, term2291.getClass(), "x", term2292);
        setField(term2305, term2305.getClass(), "coordinate", "HBGNxdNURv");
        setField(term2291, term2291.getClass(), "y", term2305);
        setField(term2318, term2318.getClass(), "coordinate", "mfCpTPPQQm");
        setField(term2291, term2291.getClass(), "z", term2318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SpawnPointCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Object[] args = new Object[2];
        args[0] = term2278;
        args[1] = term2291;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


