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

public class DefaultValues_getBothColor_91230163647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6479;

    public DefaultValues_getBothColor_91230163647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6479 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6479, term6479.getClass(), "rebindLayout", null);
        setField(term6479, term6479.getClass(), "mouseKbLayout", null);
        setField(term6479, term6479.getClass(), "bgColor", null);
        setField(term6479, term6479.getClass(), "spriteColor", null);
        setField(term6479, term6479.getClass(), "planeColor", null);
        setField(term6479, term6479.getClass(), "bothColor", null);
        setField(term6479, term6479.getClass(), "printSymbol", null);
        setBooleanField(term6479, term6479.getClass(), "printToConsole", false);
        setBooleanField(term6479, term6479.getClass(), "disableUiUpdates", false);
        setBooleanField(term6479, term6479.getClass(), "roundPixels", false);
        setBooleanField(term6479, term6479.getClass(), "blur", false);
        setBooleanField(term6479, term6479.getClass(), "glow", false);
        setDoubleField(term6479, term6479.getClass(), "blurValue", 0.0);
        setDoubleField(term6479, term6479.getClass(), "glowValue", 0.0);
        setBooleanField(term6479, term6479.getClass(), "quirkShift", false);
        setBooleanField(term6479, term6479.getClass(), "quirkJump", false);
        setBooleanField(term6479, term6479.getClass(), "quirkIndex", false);
        setBooleanField(term6479, term6479.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBothColor", argTypes, term6479, args);
    }

};


