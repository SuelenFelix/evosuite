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

public class ExperienceCommand_command_13572516156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29073;

    public ExperienceCommand_command_13572516156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29073 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand"));
        Object term29086 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        Object term29100 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term29073, term29073.getClass(), "experienceMode", "fxapaYlZea");
        setIntField(term29086, term29086.getClass(), "amount", -73683645);
        setField(term29086, term29086.getClass(), "type", "VJgREHwfRM");
        setField(term29073, term29073.getClass(), "experience", term29086);
        setField(term29100, term29100.getClass(), "targetString", "kXnpLIZTAr");
        setField(term29073, term29073.getClass(), "target", term29100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term29073, args);
    }

};


