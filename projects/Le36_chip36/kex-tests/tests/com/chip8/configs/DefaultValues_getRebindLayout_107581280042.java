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

public class DefaultValues_getRebindLayout_107581280042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6419;

    public DefaultValues_getRebindLayout_107581280042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6419 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6419, term6419.getClass(), "rebindLayout", null);
        setField(term6419, term6419.getClass(), "mouseKbLayout", null);
        setField(term6419, term6419.getClass(), "bgColor", null);
        setField(term6419, term6419.getClass(), "spriteColor", null);
        setField(term6419, term6419.getClass(), "planeColor", null);
        setField(term6419, term6419.getClass(), "bothColor", null);
        setField(term6419, term6419.getClass(), "printSymbol", null);
        setBooleanField(term6419, term6419.getClass(), "printToConsole", false);
        setBooleanField(term6419, term6419.getClass(), "disableUiUpdates", false);
        setBooleanField(term6419, term6419.getClass(), "roundPixels", false);
        setBooleanField(term6419, term6419.getClass(), "blur", false);
        setBooleanField(term6419, term6419.getClass(), "glow", false);
        setDoubleField(term6419, term6419.getClass(), "blurValue", 0.0);
        setDoubleField(term6419, term6419.getClass(), "glowValue", 0.0);
        setBooleanField(term6419, term6419.getClass(), "quirkShift", false);
        setBooleanField(term6419, term6419.getClass(), "quirkJump", false);
        setBooleanField(term6419, term6419.getClass(), "quirkIndex", false);
        setBooleanField(term6419, term6419.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebindLayout", argTypes, term6419, args);
    }

};


