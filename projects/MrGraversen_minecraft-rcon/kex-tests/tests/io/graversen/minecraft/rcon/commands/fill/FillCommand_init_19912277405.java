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

public class FillCommand_init_19912277405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public FillCommand_init_19912277405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[2] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        argTypes[3] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        argTypes[4] = Class.forName("io.graversen.minecraft.rcon.util.FillModes");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


