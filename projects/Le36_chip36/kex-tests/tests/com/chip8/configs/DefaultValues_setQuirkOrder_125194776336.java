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

public class DefaultValues_setQuirkOrder_125194776336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5635;
     Object term5726;

    public DefaultValues_setQuirkOrder_125194776336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5635 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5635, term5635.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5635, term5635.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5635, term5635.getClass(), "bgColor", "0x000000");
        setField(term5635, term5635.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5635, term5635.getClass(), "planeColor", "0x00FF00");
        setField(term5635, term5635.getClass(), "bothColor", "0x4D4D4D");
        setField(term5635, term5635.getClass(), "printSymbol", "#");
        setBooleanField(term5635, term5635.getClass(), "printToConsole", false);
        setBooleanField(term5635, term5635.getClass(), "disableUiUpdates", false);
        setBooleanField(term5635, term5635.getClass(), "roundPixels", true);
        setBooleanField(term5635, term5635.getClass(), "blur", true);
        setBooleanField(term5635, term5635.getClass(), "glow", false);
        setDoubleField(term5635, term5635.getClass(), "blurValue", 0.0022646783892913414);
        setDoubleField(term5635, term5635.getClass(), "glowValue", 0.36226058076369927);
        setBooleanField(term5635, term5635.getClass(), "quirkShift", true);
        setBooleanField(term5635, term5635.getClass(), "quirkJump", true);
        setBooleanField(term5635, term5635.getClass(), "quirkIndex", false);
        setBooleanField(term5635, term5635.getClass(), "quirkOrder", true);
        term5726 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5726;
        callMethod(klass, "setQuirkOrder", argTypes, term5635, args);
    }

};


