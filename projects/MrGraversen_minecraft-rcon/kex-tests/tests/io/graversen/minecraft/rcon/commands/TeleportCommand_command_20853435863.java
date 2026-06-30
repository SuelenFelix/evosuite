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

public class TeleportCommand_command_20853435863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7395;

    public TeleportCommand_command_20853435863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7395 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.TeleportCommand"));
        Object term7408 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7395, term7395.getClass(), "destination", "VVNNlAePXF");
        setField(term7408, term7408.getClass(), "targetString", "jnwVnmKAFv");
        setField(term7395, term7395.getClass(), "target", term7408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.TeleportCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term7395, args);
    }

};


