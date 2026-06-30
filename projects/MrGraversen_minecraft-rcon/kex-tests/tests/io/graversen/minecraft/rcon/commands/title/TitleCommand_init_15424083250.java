package io.graversen.minecraft.rcon.commands.title;

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
import static io.graversen.minecraft.rcon.commands.title.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TitleCommand_init_15424083250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2350;
     Object term2387;
     Object term2389;
     Object term2391;
     Object term2393;
     Object term2395;

    public TitleCommand_init_15424083250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2350 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2350, term2350.getClass(), "targetString", "nGKItKLYNC");
        term2387 = new Boolean(false);
        term2389 = new Boolean(false);
        term2391 = new Boolean(true);
        term2393 = new Boolean(true);
        term2395 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.String");
        Object[] args = new Object[9];
        args[0] = term2350;
        args[1] = "UiUYnPrcCi";
        args[2] = "UoYtihxVaS";
        args[3] = term2387;
        args[4] = term2389;
        args[5] = term2391;
        args[6] = term2393;
        args[7] = term2395;
        args[8] = "JDswTTCZHV";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


