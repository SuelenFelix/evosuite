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

public class PlayerListCommand_command_15624777187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8973;

    public PlayerListCommand_command_15624777187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8973 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlayerListCommand"));
        setBooleanField(term8973, term8973.getClass(), "uuids", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlayerListCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term8973, args);
    }

};


