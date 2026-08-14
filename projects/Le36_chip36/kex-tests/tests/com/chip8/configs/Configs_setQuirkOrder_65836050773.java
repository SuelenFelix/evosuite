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

public class Configs_setQuirkOrder_65836050773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11498;
     Object term11511;

    public Configs_setQuirkOrder_65836050773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11498 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11498, term11498.getClass(), "printToConsole", false);
        setBooleanField(term11498, term11498.getClass(), "disableUiUpdates", false);
        setField(term11498, term11498.getClass(), "printSymbol", null);
        setBooleanField(term11498, term11498.getClass(), "spriteExtracting", false);
        setBooleanField(term11498, term11498.getClass(), "roundPixels", false);
        setBooleanField(term11498, term11498.getClass(), "blur", false);
        setBooleanField(term11498, term11498.getClass(), "glow", false);
        setDoubleField(term11498, term11498.getClass(), "blurValue", 0.0);
        setDoubleField(term11498, term11498.getClass(), "glowValue", 0.0);
        setField(term11498, term11498.getClass(), "bgColor", null);
        setField(term11498, term11498.getClass(), "spriteColor", null);
        setField(term11498, term11498.getClass(), "planeColor", null);
        setField(term11498, term11498.getClass(), "bothColor", null);
        setBooleanField(term11498, term11498.getClass(), "quirkShift", false);
        setBooleanField(term11498, term11498.getClass(), "quirkJump", false);
        setBooleanField(term11498, term11498.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11498, term11498.getClass(), "quirkOrder", false);
        term11511 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11511;
        callMethod(klass, "setQuirkOrder", argTypes, term11498, args);
    }

};


