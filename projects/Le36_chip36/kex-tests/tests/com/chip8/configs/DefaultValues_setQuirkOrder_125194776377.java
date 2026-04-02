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

public class DefaultValues_setQuirkOrder_125194776377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6859;
     Object term6871;

    public DefaultValues_setQuirkOrder_125194776377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6859 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6859, term6859.getClass(), "rebindLayout", null);
        setField(term6859, term6859.getClass(), "mouseKbLayout", null);
        setField(term6859, term6859.getClass(), "bgColor", null);
        setField(term6859, term6859.getClass(), "spriteColor", null);
        setField(term6859, term6859.getClass(), "planeColor", null);
        setField(term6859, term6859.getClass(), "bothColor", null);
        setField(term6859, term6859.getClass(), "printSymbol", null);
        setBooleanField(term6859, term6859.getClass(), "printToConsole", false);
        setBooleanField(term6859, term6859.getClass(), "disableUiUpdates", false);
        setBooleanField(term6859, term6859.getClass(), "roundPixels", false);
        setBooleanField(term6859, term6859.getClass(), "blur", false);
        setBooleanField(term6859, term6859.getClass(), "glow", false);
        setDoubleField(term6859, term6859.getClass(), "blurValue", 0.0);
        setDoubleField(term6859, term6859.getClass(), "glowValue", 0.0);
        setBooleanField(term6859, term6859.getClass(), "quirkShift", false);
        setBooleanField(term6859, term6859.getClass(), "quirkJump", false);
        setBooleanField(term6859, term6859.getClass(), "quirkIndex", false);
        setBooleanField(term6859, term6859.getClass(), "quirkOrder", false);
        term6871 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6871;
        callMethod(klass, "setQuirkOrder", argTypes, term6859, args);
    }

};


