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

public class DefaultValues_isDisableUiUpdates_149057046750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6515;

    public DefaultValues_isDisableUiUpdates_149057046750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6515 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6515, term6515.getClass(), "rebindLayout", null);
        setField(term6515, term6515.getClass(), "mouseKbLayout", null);
        setField(term6515, term6515.getClass(), "bgColor", null);
        setField(term6515, term6515.getClass(), "spriteColor", null);
        setField(term6515, term6515.getClass(), "planeColor", null);
        setField(term6515, term6515.getClass(), "bothColor", null);
        setField(term6515, term6515.getClass(), "printSymbol", null);
        setBooleanField(term6515, term6515.getClass(), "printToConsole", false);
        setBooleanField(term6515, term6515.getClass(), "disableUiUpdates", false);
        setBooleanField(term6515, term6515.getClass(), "roundPixels", false);
        setBooleanField(term6515, term6515.getClass(), "blur", false);
        setBooleanField(term6515, term6515.getClass(), "glow", false);
        setDoubleField(term6515, term6515.getClass(), "blurValue", 0.0);
        setDoubleField(term6515, term6515.getClass(), "glowValue", 0.0);
        setBooleanField(term6515, term6515.getClass(), "quirkShift", false);
        setBooleanField(term6515, term6515.getClass(), "quirkJump", false);
        setBooleanField(term6515, term6515.getClass(), "quirkIndex", false);
        setBooleanField(term6515, term6515.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDisableUiUpdates", argTypes, term6515, args);
    }

};


