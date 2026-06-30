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

public class FillCommandBuilder_validate_205528612118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4474;

    public FillCommandBuilder_validate_205528612118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4474 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        setField(term4474, term4474.getClass(), "position1", null);
        setField(term4474, term4474.getClass(), "position2", null);
        setField(term4474, term4474.getClass(), "block", null);
        setField(term4474, term4474.getClass(), "replaceBlock", null);
        setField(term4474, term4474.getClass(), "fillMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term4474, args);
    }

};


