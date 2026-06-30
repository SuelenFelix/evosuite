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
import java.lang.Object;

public class MinecraftRcon_sendAsync_1854552452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39354;
     Object term39355;

    public MinecraftRcon_sendAsync_1854552452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39354 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        setField(term39354, term39354.getClass(), "rconClient", null);
        term39355 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.base.ICommand", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftRcon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("io.graversen.minecraft.rcon.commands.base.ICommand"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39355;
        callMethod(klass, "sendAsync", argTypes, term39354, args);
    }

};


