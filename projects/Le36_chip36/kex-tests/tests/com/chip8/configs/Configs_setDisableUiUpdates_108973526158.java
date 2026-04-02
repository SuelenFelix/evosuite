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

public class Configs_setDisableUiUpdates_108973526158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11283;
     Object term11296;

    public Configs_setDisableUiUpdates_108973526158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11283 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11283, term11283.getClass(), "printToConsole", false);
        setBooleanField(term11283, term11283.getClass(), "disableUiUpdates", false);
        setField(term11283, term11283.getClass(), "printSymbol", null);
        setBooleanField(term11283, term11283.getClass(), "spriteExtracting", false);
        setBooleanField(term11283, term11283.getClass(), "roundPixels", false);
        setBooleanField(term11283, term11283.getClass(), "blur", false);
        setBooleanField(term11283, term11283.getClass(), "glow", false);
        setDoubleField(term11283, term11283.getClass(), "blurValue", 0.0);
        setDoubleField(term11283, term11283.getClass(), "glowValue", 0.0);
        setField(term11283, term11283.getClass(), "bgColor", null);
        setField(term11283, term11283.getClass(), "spriteColor", null);
        setField(term11283, term11283.getClass(), "planeColor", null);
        setField(term11283, term11283.getClass(), "bothColor", null);
        setBooleanField(term11283, term11283.getClass(), "quirkShift", false);
        setBooleanField(term11283, term11283.getClass(), "quirkJump", false);
        setBooleanField(term11283, term11283.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11283, term11283.getClass(), "quirkOrder", false);
        term11296 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11296;
        callMethod(klass, "setDisableUiUpdates", argTypes, term11283, args);
    }

};


