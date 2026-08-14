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

public class DefaultValues_setRoundPixels_122796009069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6747;
     Object term6759;

    public DefaultValues_setRoundPixels_122796009069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6747 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6747, term6747.getClass(), "rebindLayout", null);
        setField(term6747, term6747.getClass(), "mouseKbLayout", null);
        setField(term6747, term6747.getClass(), "bgColor", null);
        setField(term6747, term6747.getClass(), "spriteColor", null);
        setField(term6747, term6747.getClass(), "planeColor", null);
        setField(term6747, term6747.getClass(), "bothColor", null);
        setField(term6747, term6747.getClass(), "printSymbol", null);
        setBooleanField(term6747, term6747.getClass(), "printToConsole", false);
        setBooleanField(term6747, term6747.getClass(), "disableUiUpdates", false);
        setBooleanField(term6747, term6747.getClass(), "roundPixels", false);
        setBooleanField(term6747, term6747.getClass(), "blur", false);
        setBooleanField(term6747, term6747.getClass(), "glow", false);
        setDoubleField(term6747, term6747.getClass(), "blurValue", 0.0);
        setDoubleField(term6747, term6747.getClass(), "glowValue", 0.0);
        setBooleanField(term6747, term6747.getClass(), "quirkShift", false);
        setBooleanField(term6747, term6747.getClass(), "quirkJump", false);
        setBooleanField(term6747, term6747.getClass(), "quirkIndex", false);
        setBooleanField(term6747, term6747.getClass(), "quirkOrder", false);
        term6759 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6759;
        callMethod(klass, "setRoundPixels", argTypes, term6747, args);
    }

};


