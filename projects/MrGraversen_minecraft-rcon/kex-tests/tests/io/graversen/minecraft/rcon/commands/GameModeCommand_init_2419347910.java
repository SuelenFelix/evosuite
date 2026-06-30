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
import java.lang.String;
import java.lang.Object;

public class GameModeCommand_init_2419347910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4065;
     Object enum6;

    public GameModeCommand_init_2419347910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4065 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term4065, term4065.getClass(), "targetString", "jDmhBrIoDa");
        Class<? extends Object> term4151 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameModes");
        Field term4150 = ((Class) term4151).getDeclaredField((String) "SURVIVAL");
        ((Field) term4150).setAccessible(true);
        enum6 = ((Field) term4150).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GameModeCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.GameModes");
        Object[] args = new Object[2];
        args[0] = term4065;
        args[1] = enum6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


