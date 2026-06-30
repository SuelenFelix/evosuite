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

public class ExecuteCommandBuilders_ExecuteAtCommandBuilder_run_7134107975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;

    public ExecuteCommandBuilders_ExecuteAtCommandBuilder_run_7134107975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteAtCommandBuilder"));
        setField(term70, term70.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.execute.ExecuteCommandBuilders$ExecuteAtCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.base.ICommand");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "run", argTypes, term70, args);
    }

};


