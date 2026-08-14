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

public class DefaultValues_setPrintSymbol_91988454366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6707;

    public DefaultValues_setPrintSymbol_91988454366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6707 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6707, term6707.getClass(), "rebindLayout", null);
        setField(term6707, term6707.getClass(), "mouseKbLayout", null);
        setField(term6707, term6707.getClass(), "bgColor", null);
        setField(term6707, term6707.getClass(), "spriteColor", null);
        setField(term6707, term6707.getClass(), "planeColor", null);
        setField(term6707, term6707.getClass(), "bothColor", null);
        setField(term6707, term6707.getClass(), "printSymbol", null);
        setBooleanField(term6707, term6707.getClass(), "printToConsole", false);
        setBooleanField(term6707, term6707.getClass(), "disableUiUpdates", false);
        setBooleanField(term6707, term6707.getClass(), "roundPixels", false);
        setBooleanField(term6707, term6707.getClass(), "blur", false);
        setBooleanField(term6707, term6707.getClass(), "glow", false);
        setDoubleField(term6707, term6707.getClass(), "blurValue", 0.0);
        setDoubleField(term6707, term6707.getClass(), "glowValue", 0.0);
        setBooleanField(term6707, term6707.getClass(), "quirkShift", false);
        setBooleanField(term6707, term6707.getClass(), "quirkJump", false);
        setBooleanField(term6707, term6707.getClass(), "quirkIndex", false);
        setBooleanField(term6707, term6707.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrintSymbol", argTypes, term6707, args);
    }

};


