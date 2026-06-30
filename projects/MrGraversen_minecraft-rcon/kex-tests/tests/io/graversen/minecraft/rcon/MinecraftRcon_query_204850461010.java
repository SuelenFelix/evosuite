package io.graversen.minecraft.rcon;

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
import static io.graversen.minecraft.rcon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MinecraftRcon_query_204850461010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39362;

    public MinecraftRcon_query_204850461010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39362 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        setField(term39362, term39362.getClass(), "rconClient", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftRcon");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.base.ICommand");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.query.IRconResponseMapper");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "query", argTypes, term39362, args);
    }

};


