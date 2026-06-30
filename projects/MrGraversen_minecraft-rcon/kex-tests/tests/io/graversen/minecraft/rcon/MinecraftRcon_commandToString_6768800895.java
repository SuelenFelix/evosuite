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

public class MinecraftRcon_commandToString_6768800895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39358;

    public MinecraftRcon_commandToString_6768800895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39358 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftRcon"));
        setField(term39358, term39358.getClass(), "rconClient", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftRcon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.base.ICommand");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "commandToString", argTypes, term39358, args);
    }

};


