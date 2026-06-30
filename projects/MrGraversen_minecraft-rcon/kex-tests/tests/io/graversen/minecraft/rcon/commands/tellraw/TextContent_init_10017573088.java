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

public class TextContent_init_10017573088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;
     Object term824;
     Object term826;
     Object term828;
     Object term830;

    public TextContent_init_10017573088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822 = new Boolean(false);
        term824 = new Boolean(false);
        term826 = new Boolean(false);
        term828 = new Boolean(true);
        term830 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = "NzBMMhkhpT";
        args[1] = term822;
        args[2] = term824;
        args[3] = term826;
        args[4] = term828;
        args[5] = term830;
        args[6] = "qCpEbQDHdF";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


