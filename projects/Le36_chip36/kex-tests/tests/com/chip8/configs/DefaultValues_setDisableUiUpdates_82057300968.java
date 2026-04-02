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

public class DefaultValues_setDisableUiUpdates_82057300968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6733;
     Object term6745;

    public DefaultValues_setDisableUiUpdates_82057300968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6733 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6733, term6733.getClass(), "rebindLayout", null);
        setField(term6733, term6733.getClass(), "mouseKbLayout", null);
        setField(term6733, term6733.getClass(), "bgColor", null);
        setField(term6733, term6733.getClass(), "spriteColor", null);
        setField(term6733, term6733.getClass(), "planeColor", null);
        setField(term6733, term6733.getClass(), "bothColor", null);
        setField(term6733, term6733.getClass(), "printSymbol", null);
        setBooleanField(term6733, term6733.getClass(), "printToConsole", false);
        setBooleanField(term6733, term6733.getClass(), "disableUiUpdates", false);
        setBooleanField(term6733, term6733.getClass(), "roundPixels", false);
        setBooleanField(term6733, term6733.getClass(), "blur", false);
        setBooleanField(term6733, term6733.getClass(), "glow", false);
        setDoubleField(term6733, term6733.getClass(), "blurValue", 0.0);
        setDoubleField(term6733, term6733.getClass(), "glowValue", 0.0);
        setBooleanField(term6733, term6733.getClass(), "quirkShift", false);
        setBooleanField(term6733, term6733.getClass(), "quirkJump", false);
        setBooleanField(term6733, term6733.getClass(), "quirkIndex", false);
        setBooleanField(term6733, term6733.getClass(), "quirkOrder", false);
        term6745 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6745;
        callMethod(klass, "setDisableUiUpdates", argTypes, term6733, args);
    }

};


