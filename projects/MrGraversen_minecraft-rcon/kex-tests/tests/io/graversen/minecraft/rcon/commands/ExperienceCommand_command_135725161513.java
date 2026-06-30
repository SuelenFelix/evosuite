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

public class ExperienceCommand_command_135725161513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29148;

    public ExperienceCommand_command_135725161513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29148 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand"));
        setField(term29148, term29148.getClass(), "experienceMode", null);
        setField(term29148, term29148.getClass(), "experience", null);
        setField(term29148, term29148.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term29148, args);
    }

};


