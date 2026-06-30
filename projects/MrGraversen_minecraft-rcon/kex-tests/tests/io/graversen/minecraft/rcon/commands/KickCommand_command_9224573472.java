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

public class KickCommand_command_9224573472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13541;

    public KickCommand_command_9224573472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13541 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.KickCommand"));
        Object term13554 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13541, term13541.getClass(), "reason", "RjNoEywJbC");
        setField(term13554, term13554.getClass(), "targetString", "RTTvrwwhou");
        setField(term13541, term13541.getClass(), "target", term13554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.KickCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term13541, args);
    }

};


