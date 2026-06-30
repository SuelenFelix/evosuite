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

public class FillCommand_getFillMode_18075545288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6841;

    public FillCommand_getFillMode_18075545288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6841 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand"));
        setField(term6841, term6841.getClass(), "block", null);
        setField(term6841, term6841.getClass(), "replaceBlock", null);
        setField(term6841, term6841.getClass(), "fillMode", null);
        setField(term6841, term6841.getClass(), "position1", null);
        setField(term6841, term6841.getClass(), "position2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillMode", argTypes, term6841, args);
    }

};


