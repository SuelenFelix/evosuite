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

public class DefaultValues_isPrintToConsole_158788306849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6503;

    public DefaultValues_isPrintToConsole_158788306849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6503 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6503, term6503.getClass(), "rebindLayout", null);
        setField(term6503, term6503.getClass(), "mouseKbLayout", null);
        setField(term6503, term6503.getClass(), "bgColor", null);
        setField(term6503, term6503.getClass(), "spriteColor", null);
        setField(term6503, term6503.getClass(), "planeColor", null);
        setField(term6503, term6503.getClass(), "bothColor", null);
        setField(term6503, term6503.getClass(), "printSymbol", null);
        setBooleanField(term6503, term6503.getClass(), "printToConsole", false);
        setBooleanField(term6503, term6503.getClass(), "disableUiUpdates", false);
        setBooleanField(term6503, term6503.getClass(), "roundPixels", false);
        setBooleanField(term6503, term6503.getClass(), "blur", false);
        setBooleanField(term6503, term6503.getClass(), "glow", false);
        setDoubleField(term6503, term6503.getClass(), "blurValue", 0.0);
        setDoubleField(term6503, term6503.getClass(), "glowValue", 0.0);
        setBooleanField(term6503, term6503.getClass(), "quirkShift", false);
        setBooleanField(term6503, term6503.getClass(), "quirkJump", false);
        setBooleanField(term6503, term6503.getClass(), "quirkIndex", false);
        setBooleanField(term6503, term6503.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintToConsole", argTypes, term6503, args);
    }

};


