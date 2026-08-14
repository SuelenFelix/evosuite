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

public class DefaultValues_isGlow_161629801853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6551;

    public DefaultValues_isGlow_161629801853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6551 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6551, term6551.getClass(), "rebindLayout", null);
        setField(term6551, term6551.getClass(), "mouseKbLayout", null);
        setField(term6551, term6551.getClass(), "bgColor", null);
        setField(term6551, term6551.getClass(), "spriteColor", null);
        setField(term6551, term6551.getClass(), "planeColor", null);
        setField(term6551, term6551.getClass(), "bothColor", null);
        setField(term6551, term6551.getClass(), "printSymbol", null);
        setBooleanField(term6551, term6551.getClass(), "printToConsole", false);
        setBooleanField(term6551, term6551.getClass(), "disableUiUpdates", false);
        setBooleanField(term6551, term6551.getClass(), "roundPixels", false);
        setBooleanField(term6551, term6551.getClass(), "blur", false);
        setBooleanField(term6551, term6551.getClass(), "glow", false);
        setDoubleField(term6551, term6551.getClass(), "blurValue", 0.0);
        setDoubleField(term6551, term6551.getClass(), "glowValue", 0.0);
        setBooleanField(term6551, term6551.getClass(), "quirkShift", false);
        setBooleanField(term6551, term6551.getClass(), "quirkJump", false);
        setBooleanField(term6551, term6551.getClass(), "quirkIndex", false);
        setBooleanField(term6551, term6551.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGlow", argTypes, term6551, args);
    }

};


