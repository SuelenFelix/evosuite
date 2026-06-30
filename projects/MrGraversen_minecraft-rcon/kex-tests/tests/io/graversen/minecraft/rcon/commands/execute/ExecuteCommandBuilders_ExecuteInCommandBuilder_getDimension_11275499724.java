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

public class ExecuteCommandBuilders_ExecuteInCommandBuilder_getDimension_11275499724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;

    public ExecuteCommandBuilders_ExecuteInCommandBuilder_getDimension_11275499724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term897 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteInCommandBuilder"));
        setField(term897, term897.getClass(), "dimension", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteInCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDimension", argTypes, term897, args);
    }

};


