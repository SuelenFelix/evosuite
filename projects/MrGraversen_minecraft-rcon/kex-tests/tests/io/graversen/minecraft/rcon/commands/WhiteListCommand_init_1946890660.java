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

public class WhiteListCommand_init_1946890660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7582;
     Object enum12;

    public WhiteListCommand_init_1946890660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7582 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7582, term7582.getClass(), "targetString", "JeZFtaqkzW");
        Class<? extends Object> term7662 = Class.forName((String) "io.graversen.minecraft.rcon.util.WhiteListModes");
        Field term7661 = ((Class) term7662).getDeclaredField((String) "LIST");
        ((Field) term7661).setAccessible(true);
        enum12 = ((Field) term7661).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WhiteListCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.WhiteListModes");
        Object[] args = new Object[2];
        args[0] = term7582;
        args[1] = enum12;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


