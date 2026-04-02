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

public class Configs_setPrintToConsole_77795058857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11268;
     Object term11281;

    public Configs_setPrintToConsole_77795058857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11268 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11268, term11268.getClass(), "printToConsole", false);
        setBooleanField(term11268, term11268.getClass(), "disableUiUpdates", false);
        setField(term11268, term11268.getClass(), "printSymbol", null);
        setBooleanField(term11268, term11268.getClass(), "spriteExtracting", false);
        setBooleanField(term11268, term11268.getClass(), "roundPixels", false);
        setBooleanField(term11268, term11268.getClass(), "blur", false);
        setBooleanField(term11268, term11268.getClass(), "glow", false);
        setDoubleField(term11268, term11268.getClass(), "blurValue", 0.0);
        setDoubleField(term11268, term11268.getClass(), "glowValue", 0.0);
        setField(term11268, term11268.getClass(), "bgColor", null);
        setField(term11268, term11268.getClass(), "spriteColor", null);
        setField(term11268, term11268.getClass(), "planeColor", null);
        setField(term11268, term11268.getClass(), "bothColor", null);
        setBooleanField(term11268, term11268.getClass(), "quirkShift", false);
        setBooleanField(term11268, term11268.getClass(), "quirkJump", false);
        setBooleanField(term11268, term11268.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11268, term11268.getClass(), "quirkOrder", false);
        term11281 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11281;
        callMethod(klass, "setPrintToConsole", argTypes, term11268, args);
    }

};


