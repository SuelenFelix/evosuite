package io.graversen.minecraft.rcon.commands.execute;

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
import static io.graversen.minecraft.rcon.commands.execute.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ExecuteCommandBuilders_executeIn_1660996213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4;

    public ExecuteCommandBuilders_executeIn_1660996213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1296 = Class.forName((String) "io.graversen.minecraft.rcon.util.Dimensions");
        Field term1295 = ((Class) term1296).getDeclaredField((String) "THE_END");
        ((Field) term1295).setAccessible(true);
        enum4 = ((Field) term1295).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Dimensions");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "executeIn", argTypes, null, args);
    }

};


