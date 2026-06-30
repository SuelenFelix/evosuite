package io.graversen.minecraft.rcon.commands.tellraw;

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
import static io.graversen.minecraft.rcon.commands.tellraw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TellRawCommand_init_144901295412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7251;
     Object term7253;
     Object term7255;
     Object term7257;
     Object term7259;

    public TellRawCommand_init_144901295412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7251 = new Boolean(false);
        term7253 = new Boolean(false);
        term7255 = new Boolean(false);
        term7257 = new Boolean(false);
        term7259 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent");
        argTypes[9] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent");
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = null;
        args[2] = term7251;
        args[3] = term7253;
        args[4] = term7255;
        args[5] = term7257;
        args[6] = term7259;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


