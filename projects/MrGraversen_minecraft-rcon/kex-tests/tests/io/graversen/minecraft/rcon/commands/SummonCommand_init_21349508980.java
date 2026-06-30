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

public class SummonCommand_init_21349508980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28283;

    public SummonCommand_init_21349508980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28283 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term28284 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28297 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28310 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term28284, term28284.getClass(), "coordinate", "ZiyMvLArWJ");
        setField(term28283, term28283.getClass(), "x", term28284);
        setField(term28297, term28297.getClass(), "coordinate", "MaeokjEfWD");
        setField(term28283, term28283.getClass(), "y", term28297);
        setField(term28310, term28310.getClass(), "coordinate", "ocZcumnXEz");
        setField(term28283, term28283.getClass(), "z", term28310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term28283;
        args[1] = "rNNwyactDR";
        args[2] = "QJrTMTdxyh";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


