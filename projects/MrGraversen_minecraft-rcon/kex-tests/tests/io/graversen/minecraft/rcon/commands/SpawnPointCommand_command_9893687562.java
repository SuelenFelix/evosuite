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

public class SpawnPointCommand_command_9893687562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2465;

    public SpawnPointCommand_command_9893687562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2465 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.SpawnPointCommand"));
        Object term2466 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2467 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2480 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2493 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2506 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2467, term2467.getClass(), "coordinate", "IpQuOGMgmj");
        setField(term2466, term2466.getClass(), "x", term2467);
        setField(term2480, term2480.getClass(), "coordinate", "pJbnHTYrxn");
        setField(term2466, term2466.getClass(), "y", term2480);
        setField(term2493, term2493.getClass(), "coordinate", "iIRsCSYqXH");
        setField(term2466, term2466.getClass(), "z", term2493);
        setField(term2465, term2465.getClass(), "position", term2466);
        setField(term2506, term2506.getClass(), "targetString", "nghfqDXyCG");
        setField(term2465, term2465.getClass(), "target", term2506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SpawnPointCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term2465, args);
    }

};


