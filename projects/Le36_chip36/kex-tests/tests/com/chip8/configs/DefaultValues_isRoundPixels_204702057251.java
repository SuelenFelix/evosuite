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

public class DefaultValues_isRoundPixels_204702057251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6527;

    public DefaultValues_isRoundPixels_204702057251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6527 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6527, term6527.getClass(), "rebindLayout", null);
        setField(term6527, term6527.getClass(), "mouseKbLayout", null);
        setField(term6527, term6527.getClass(), "bgColor", null);
        setField(term6527, term6527.getClass(), "spriteColor", null);
        setField(term6527, term6527.getClass(), "planeColor", null);
        setField(term6527, term6527.getClass(), "bothColor", null);
        setField(term6527, term6527.getClass(), "printSymbol", null);
        setBooleanField(term6527, term6527.getClass(), "printToConsole", false);
        setBooleanField(term6527, term6527.getClass(), "disableUiUpdates", false);
        setBooleanField(term6527, term6527.getClass(), "roundPixels", false);
        setBooleanField(term6527, term6527.getClass(), "blur", false);
        setBooleanField(term6527, term6527.getClass(), "glow", false);
        setDoubleField(term6527, term6527.getClass(), "blurValue", 0.0);
        setDoubleField(term6527, term6527.getClass(), "glowValue", 0.0);
        setBooleanField(term6527, term6527.getClass(), "quirkShift", false);
        setBooleanField(term6527, term6527.getClass(), "quirkJump", false);
        setBooleanField(term6527, term6527.getClass(), "quirkIndex", false);
        setBooleanField(term6527, term6527.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRoundPixels", argTypes, term6527, args);
    }

};


