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

public class Configs_getPlaneColor_443711951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11190;

    public Configs_getPlaneColor_443711951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11190 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11190, term11190.getClass(), "printToConsole", false);
        setBooleanField(term11190, term11190.getClass(), "disableUiUpdates", false);
        setField(term11190, term11190.getClass(), "printSymbol", null);
        setBooleanField(term11190, term11190.getClass(), "spriteExtracting", false);
        setBooleanField(term11190, term11190.getClass(), "roundPixels", false);
        setBooleanField(term11190, term11190.getClass(), "blur", false);
        setBooleanField(term11190, term11190.getClass(), "glow", false);
        setDoubleField(term11190, term11190.getClass(), "blurValue", 0.0);
        setDoubleField(term11190, term11190.getClass(), "glowValue", 0.0);
        setField(term11190, term11190.getClass(), "bgColor", null);
        setField(term11190, term11190.getClass(), "spriteColor", null);
        setField(term11190, term11190.getClass(), "planeColor", null);
        setField(term11190, term11190.getClass(), "bothColor", null);
        setBooleanField(term11190, term11190.getClass(), "quirkShift", false);
        setBooleanField(term11190, term11190.getClass(), "quirkJump", false);
        setBooleanField(term11190, term11190.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11190, term11190.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaneColor", argTypes, term11190, args);
    }

};


