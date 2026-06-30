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

public class ExecuteCommandBuilders_ExecuteInCommandBuilder_run_2913699532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public ExecuteCommandBuilders_ExecuteInCommandBuilder_run_2913699532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term646 = Class.forName((String) "io.graversen.minecraft.rcon.util.Dimensions");
        Field term645 = ((Class) term646).getDeclaredField((String) "THE_NETHER");
        ((Field) term645).setAccessible(true);
        Object enum2 = ((Field) term645).get((Object) null);
        term630 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteInCommandBuilder"));
        setField(term630, term630.getClass(), "dimension", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteInCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.base.ICommand");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "run", argTypes, term630, args);
    }

};


