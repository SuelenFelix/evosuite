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

public class ExperienceCommand_getExperienceMode_4983629514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28933;

    public ExperienceCommand_getExperienceMode_4983629514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28933 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand"));
        Object term28946 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        Object term28960 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term28933, term28933.getClass(), "experienceMode", "kEehLMZcOU");
        setIntField(term28946, term28946.getClass(), "amount", -203030934);
        setField(term28946, term28946.getClass(), "type", "RhLliqMiOF");
        setField(term28933, term28933.getClass(), "experience", term28946);
        setField(term28960, term28960.getClass(), "targetString", "jlhonEGrJH");
        setField(term28933, term28933.getClass(), "target", term28960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExperienceMode", argTypes, term28933, args);
    }

};


