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

public class TeleportCommand_init_11153464321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7256;
     Object term7269;

    public TeleportCommand_init_11153464321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7256 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7256, term7256.getClass(), "targetString", "pumvwBWvpy");
        term7269 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term7270 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term7283 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term7296 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term7270, term7270.getClass(), "coordinate", "HwLHeGLyhe");
        setField(term7269, term7269.getClass(), "x", term7270);
        setField(term7283, term7283.getClass(), "coordinate", "RDnkgWkcbz");
        setField(term7269, term7269.getClass(), "y", term7283);
        setField(term7296, term7296.getClass(), "coordinate", "IBpaxltauX");
        setField(term7269, term7269.getClass(), "z", term7296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.TeleportCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Object[] args = new Object[2];
        args[0] = term7256;
        args[1] = term7269;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


