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

public class ExperienceCommand_getExperience_4252055165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29003;

    public ExperienceCommand_getExperience_4252055165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29003 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand"));
        Object term29016 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Experience"));
        Object term29030 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term29003, term29003.getClass(), "experienceMode", "RKcKwlEYZb");
        setIntField(term29016, term29016.getClass(), "amount", -1179120542);
        setField(term29016, term29016.getClass(), "type", "acPRDlpsid");
        setField(term29003, term29003.getClass(), "experience", term29016);
        setField(term29030, term29030.getClass(), "targetString", "YyojIzvxLZ");
        setField(term29003, term29003.getClass(), "target", term29030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.ExperienceCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExperience", argTypes, term29003, args);
    }

};


