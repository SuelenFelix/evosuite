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

public class Configs_setBgColor_193109157466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11401;

    public Configs_setBgColor_193109157466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11401 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11401, term11401.getClass(), "printToConsole", false);
        setBooleanField(term11401, term11401.getClass(), "disableUiUpdates", false);
        setField(term11401, term11401.getClass(), "printSymbol", null);
        setBooleanField(term11401, term11401.getClass(), "spriteExtracting", false);
        setBooleanField(term11401, term11401.getClass(), "roundPixels", false);
        setBooleanField(term11401, term11401.getClass(), "blur", false);
        setBooleanField(term11401, term11401.getClass(), "glow", false);
        setDoubleField(term11401, term11401.getClass(), "blurValue", 0.0);
        setDoubleField(term11401, term11401.getClass(), "glowValue", 0.0);
        setField(term11401, term11401.getClass(), "bgColor", null);
        setField(term11401, term11401.getClass(), "spriteColor", null);
        setField(term11401, term11401.getClass(), "planeColor", null);
        setField(term11401, term11401.getClass(), "bothColor", null);
        setBooleanField(term11401, term11401.getClass(), "quirkShift", false);
        setBooleanField(term11401, term11401.getClass(), "quirkJump", false);
        setBooleanField(term11401, term11401.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11401, term11401.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBgColor", argTypes, term11401, args);
    }

};


