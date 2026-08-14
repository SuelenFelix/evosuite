package com.chip8.configs;

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
import static com.chip8.configs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultValues_canEqual_65427453079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6885;

    public DefaultValues_canEqual_65427453079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6885 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6885, term6885.getClass(), "rebindLayout", null);
        setField(term6885, term6885.getClass(), "mouseKbLayout", null);
        setField(term6885, term6885.getClass(), "bgColor", null);
        setField(term6885, term6885.getClass(), "spriteColor", null);
        setField(term6885, term6885.getClass(), "planeColor", null);
        setField(term6885, term6885.getClass(), "bothColor", null);
        setField(term6885, term6885.getClass(), "printSymbol", null);
        setBooleanField(term6885, term6885.getClass(), "printToConsole", false);
        setBooleanField(term6885, term6885.getClass(), "disableUiUpdates", false);
        setBooleanField(term6885, term6885.getClass(), "roundPixels", false);
        setBooleanField(term6885, term6885.getClass(), "blur", false);
        setBooleanField(term6885, term6885.getClass(), "glow", false);
        setDoubleField(term6885, term6885.getClass(), "blurValue", 0.0);
        setDoubleField(term6885, term6885.getClass(), "glowValue", 0.0);
        setBooleanField(term6885, term6885.getClass(), "quirkShift", false);
        setBooleanField(term6885, term6885.getClass(), "quirkJump", false);
        setBooleanField(term6885, term6885.getClass(), "quirkIndex", false);
        setBooleanField(term6885, term6885.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term6885, args);
    }

};


