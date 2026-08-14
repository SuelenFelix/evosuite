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
import java.lang.Double;

public class DefaultValues_setBlurValue_43994199272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6789;
     Object term6801;

    public DefaultValues_setBlurValue_43994199272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6789 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6789, term6789.getClass(), "rebindLayout", null);
        setField(term6789, term6789.getClass(), "mouseKbLayout", null);
        setField(term6789, term6789.getClass(), "bgColor", null);
        setField(term6789, term6789.getClass(), "spriteColor", null);
        setField(term6789, term6789.getClass(), "planeColor", null);
        setField(term6789, term6789.getClass(), "bothColor", null);
        setField(term6789, term6789.getClass(), "printSymbol", null);
        setBooleanField(term6789, term6789.getClass(), "printToConsole", false);
        setBooleanField(term6789, term6789.getClass(), "disableUiUpdates", false);
        setBooleanField(term6789, term6789.getClass(), "roundPixels", false);
        setBooleanField(term6789, term6789.getClass(), "blur", false);
        setBooleanField(term6789, term6789.getClass(), "glow", false);
        setDoubleField(term6789, term6789.getClass(), "blurValue", 0.0);
        setDoubleField(term6789, term6789.getClass(), "glowValue", 0.0);
        setBooleanField(term6789, term6789.getClass(), "quirkShift", false);
        setBooleanField(term6789, term6789.getClass(), "quirkJump", false);
        setBooleanField(term6789, term6789.getClass(), "quirkIndex", false);
        setBooleanField(term6789, term6789.getClass(), "quirkOrder", false);
        term6801 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6801;
        callMethod(klass, "setBlurValue", argTypes, term6789, args);
    }

};


