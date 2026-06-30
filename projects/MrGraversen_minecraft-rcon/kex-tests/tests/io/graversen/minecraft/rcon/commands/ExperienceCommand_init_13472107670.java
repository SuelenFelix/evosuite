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

public class ExperienceCommand_init_13472107670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28747;
     Object term28772;

    public ExperienceCommand_init_13472107670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28747 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term28747, term28747.getClass(), "targetString", "GDMUlolTNs");
        term28772 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        setIntField(term28772, term28772.getClass(), "amount", 865208305);
        setField(term28772, term28772.getClass(), "type", "IKfozyyKEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("io.graversen.minecraft.rcon.util.Experience");
        Object[] args = new Object[3];
        args[0] = term28747;
        args[1] = "xpLvWisjzN";
        args[2] = term28772;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


