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

public class ExperienceCommand_set_19864833362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28863;
     Object term28876;

    public ExperienceCommand_set_19864833362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28863 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term28863, term28863.getClass(), "targetString", "VJtFSexKat");
        term28876 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        setIntField(term28876, term28876.getClass(), "amount", -244121226);
        setField(term28876, term28876.getClass(), "type", "xPVddlPSQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Experience");
        Object[] args = new Object[2];
        args[0] = term28863;
        args[1] = term28876;
        callMethod(klass, "set", argTypes, null, args);
    }

};


