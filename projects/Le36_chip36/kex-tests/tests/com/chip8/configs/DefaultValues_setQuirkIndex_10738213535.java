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

public class DefaultValues_setQuirkIndex_10738213535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5477;
     Object term5568;

    public DefaultValues_setQuirkIndex_10738213535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5477 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5477, term5477.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5477, term5477.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5477, term5477.getClass(), "bgColor", "0x000000");
        setField(term5477, term5477.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5477, term5477.getClass(), "planeColor", "0x00FF00");
        setField(term5477, term5477.getClass(), "bothColor", "0x4D4D4D");
        setField(term5477, term5477.getClass(), "printSymbol", "#");
        setBooleanField(term5477, term5477.getClass(), "printToConsole", false);
        setBooleanField(term5477, term5477.getClass(), "disableUiUpdates", true);
        setBooleanField(term5477, term5477.getClass(), "roundPixels", false);
        setBooleanField(term5477, term5477.getClass(), "blur", true);
        setBooleanField(term5477, term5477.getClass(), "glow", false);
        setDoubleField(term5477, term5477.getClass(), "blurValue", 0.7154795600170818);
        setDoubleField(term5477, term5477.getClass(), "glowValue", 0.6355029654528058);
        setBooleanField(term5477, term5477.getClass(), "quirkShift", false);
        setBooleanField(term5477, term5477.getClass(), "quirkJump", true);
        setBooleanField(term5477, term5477.getClass(), "quirkIndex", false);
        setBooleanField(term5477, term5477.getClass(), "quirkOrder", true);
        term5568 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5568;
        callMethod(klass, "setQuirkIndex", argTypes, term5477, args);
    }

};


