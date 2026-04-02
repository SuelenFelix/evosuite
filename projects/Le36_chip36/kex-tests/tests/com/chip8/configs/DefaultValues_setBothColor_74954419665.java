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

public class DefaultValues_setBothColor_74954419665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6695;

    public DefaultValues_setBothColor_74954419665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6695 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6695, term6695.getClass(), "rebindLayout", null);
        setField(term6695, term6695.getClass(), "mouseKbLayout", null);
        setField(term6695, term6695.getClass(), "bgColor", null);
        setField(term6695, term6695.getClass(), "spriteColor", null);
        setField(term6695, term6695.getClass(), "planeColor", null);
        setField(term6695, term6695.getClass(), "bothColor", null);
        setField(term6695, term6695.getClass(), "printSymbol", null);
        setBooleanField(term6695, term6695.getClass(), "printToConsole", false);
        setBooleanField(term6695, term6695.getClass(), "disableUiUpdates", false);
        setBooleanField(term6695, term6695.getClass(), "roundPixels", false);
        setBooleanField(term6695, term6695.getClass(), "blur", false);
        setBooleanField(term6695, term6695.getClass(), "glow", false);
        setDoubleField(term6695, term6695.getClass(), "blurValue", 0.0);
        setDoubleField(term6695, term6695.getClass(), "glowValue", 0.0);
        setBooleanField(term6695, term6695.getClass(), "quirkShift", false);
        setBooleanField(term6695, term6695.getClass(), "quirkJump", false);
        setBooleanField(term6695, term6695.getClass(), "quirkIndex", false);
        setBooleanField(term6695, term6695.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBothColor", argTypes, term6695, args);
    }

};


