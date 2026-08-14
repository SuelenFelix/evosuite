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

public class DefaultValues_setBgColor_2078330462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6659;

    public DefaultValues_setBgColor_2078330462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6659 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6659, term6659.getClass(), "rebindLayout", null);
        setField(term6659, term6659.getClass(), "mouseKbLayout", null);
        setField(term6659, term6659.getClass(), "bgColor", null);
        setField(term6659, term6659.getClass(), "spriteColor", null);
        setField(term6659, term6659.getClass(), "planeColor", null);
        setField(term6659, term6659.getClass(), "bothColor", null);
        setField(term6659, term6659.getClass(), "printSymbol", null);
        setBooleanField(term6659, term6659.getClass(), "printToConsole", false);
        setBooleanField(term6659, term6659.getClass(), "disableUiUpdates", false);
        setBooleanField(term6659, term6659.getClass(), "roundPixels", false);
        setBooleanField(term6659, term6659.getClass(), "blur", false);
        setBooleanField(term6659, term6659.getClass(), "glow", false);
        setDoubleField(term6659, term6659.getClass(), "blurValue", 0.0);
        setDoubleField(term6659, term6659.getClass(), "glowValue", 0.0);
        setBooleanField(term6659, term6659.getClass(), "quirkShift", false);
        setBooleanField(term6659, term6659.getClass(), "quirkJump", false);
        setBooleanField(term6659, term6659.getClass(), "quirkIndex", false);
        setBooleanField(term6659, term6659.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBgColor", argTypes, term6659, args);
    }

};


