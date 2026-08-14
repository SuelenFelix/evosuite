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
import java.lang.Boolean;

public class DefaultValues_setQuirkShift_22535299974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6817;
     Object term6829;

    public DefaultValues_setQuirkShift_22535299974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6817 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6817, term6817.getClass(), "rebindLayout", null);
        setField(term6817, term6817.getClass(), "mouseKbLayout", null);
        setField(term6817, term6817.getClass(), "bgColor", null);
        setField(term6817, term6817.getClass(), "spriteColor", null);
        setField(term6817, term6817.getClass(), "planeColor", null);
        setField(term6817, term6817.getClass(), "bothColor", null);
        setField(term6817, term6817.getClass(), "printSymbol", null);
        setBooleanField(term6817, term6817.getClass(), "printToConsole", false);
        setBooleanField(term6817, term6817.getClass(), "disableUiUpdates", false);
        setBooleanField(term6817, term6817.getClass(), "roundPixels", false);
        setBooleanField(term6817, term6817.getClass(), "blur", false);
        setBooleanField(term6817, term6817.getClass(), "glow", false);
        setDoubleField(term6817, term6817.getClass(), "blurValue", 0.0);
        setDoubleField(term6817, term6817.getClass(), "glowValue", 0.0);
        setBooleanField(term6817, term6817.getClass(), "quirkShift", false);
        setBooleanField(term6817, term6817.getClass(), "quirkJump", false);
        setBooleanField(term6817, term6817.getClass(), "quirkIndex", false);
        setBooleanField(term6817, term6817.getClass(), "quirkOrder", false);
        term6829 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6829;
        callMethod(klass, "setQuirkShift", argTypes, term6817, args);
    }

};


