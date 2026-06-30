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

public class TeleportCommand_init_19805062000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7210;
     Object term7223;

    public TeleportCommand_init_19805062000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7210 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7210, term7210.getClass(), "targetString", "riMtzCoxNj");
        term7223 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7223, term7223.getClass(), "targetString", "YAXkVjQZcV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.TeleportCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        Object[] args = new Object[2];
        args[0] = term7210;
        args[1] = term7223;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


