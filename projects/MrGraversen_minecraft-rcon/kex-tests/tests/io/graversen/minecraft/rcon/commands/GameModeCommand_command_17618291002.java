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

public class GameModeCommand_command_17618291002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4668;

    public GameModeCommand_command_17618291002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4695 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameModes");
        Field term4694 = ((Class) term4695).getDeclaredField((String) "CREATIVE");
        ((Field) term4694).setAccessible(true);
        Object enum8 = ((Field) term4694).get((Object) null);
        term4668 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GameModeCommand"));
        Object term4681 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term4668, term4668.getClass(), "gameMode", enum8);
        setField(term4681, term4681.getClass(), "targetString", "ywmcuThdfL");
        setField(term4668, term4668.getClass(), "target", term4681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GameModeCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term4668, args);
    }

};


