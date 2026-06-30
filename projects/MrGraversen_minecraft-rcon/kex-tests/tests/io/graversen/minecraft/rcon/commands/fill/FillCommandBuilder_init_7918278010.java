package io.graversen.minecraft.rcon.commands.fill;

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
import static io.graversen.minecraft.rcon.commands.fill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FillCommandBuilder_init_7918278010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term41;

    public FillCommandBuilder_init_7918278010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term15 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term2, term2.getClass(), "coordinate", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "x", term2);
        setField(term15, term15.getClass(), "coordinate", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "y", term15);
        setField(term28, term28.getClass(), "coordinate", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "z", term28);
        term41 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term42 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term55 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term68 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term42, term42.getClass(), "coordinate", "xxtlPwDYFs");
        setField(term41, term41.getClass(), "x", term42);
        setField(term55, term55.getClass(), "coordinate", "jJCZpVmanW");
        setField(term41, term41.getClass(), "y", term55);
        setField(term68, term68.getClass(), "coordinate", "EGtDIRbSSb");
        setField(term41, term41.getClass(), "z", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term41;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


