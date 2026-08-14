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

public class Configs_hashCode_47753519276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11539;

    public Configs_hashCode_47753519276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11539 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11539, term11539.getClass(), "printToConsole", false);
        setBooleanField(term11539, term11539.getClass(), "disableUiUpdates", false);
        setField(term11539, term11539.getClass(), "printSymbol", null);
        setBooleanField(term11539, term11539.getClass(), "spriteExtracting", false);
        setBooleanField(term11539, term11539.getClass(), "roundPixels", false);
        setBooleanField(term11539, term11539.getClass(), "blur", false);
        setBooleanField(term11539, term11539.getClass(), "glow", false);
        setDoubleField(term11539, term11539.getClass(), "blurValue", 0.0);
        setDoubleField(term11539, term11539.getClass(), "glowValue", 0.0);
        setField(term11539, term11539.getClass(), "bgColor", null);
        setField(term11539, term11539.getClass(), "spriteColor", null);
        setField(term11539, term11539.getClass(), "planeColor", null);
        setField(term11539, term11539.getClass(), "bothColor", null);
        setBooleanField(term11539, term11539.getClass(), "quirkShift", false);
        setBooleanField(term11539, term11539.getClass(), "quirkJump", false);
        setBooleanField(term11539, term11539.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11539, term11539.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11539, args);
    }

};


