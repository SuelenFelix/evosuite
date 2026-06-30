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

public class ExperienceCommand_add_19698147911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28816;
     Object term28829;

    public ExperienceCommand_add_19698147911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28816 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term28816, term28816.getClass(), "targetString", "thCjwQjRBL");
        term28829 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        setIntField(term28829, term28829.getClass(), "amount", -1275173084);
        setField(term28829, term28829.getClass(), "type", "ojLrjltndD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Experience");
        Object[] args = new Object[2];
        args[0] = term28816;
        args[1] = term28829;
        callMethod(klass, "add", argTypes, null, args);
    }

};


