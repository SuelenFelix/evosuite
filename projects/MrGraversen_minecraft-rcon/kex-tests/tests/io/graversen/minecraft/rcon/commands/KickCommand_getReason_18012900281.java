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

public class KickCommand_getReason_18012900281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13495;

    public KickCommand_getReason_18012900281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13495 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.KickCommand"));
        Object term13508 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13495, term13495.getClass(), "reason", "QNjNTLlUaV");
        setField(term13508, term13508.getClass(), "targetString", "hIYsRyOZxk");
        setField(term13495, term13495.getClass(), "target", term13508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.KickCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term13495, args);
    }

};


