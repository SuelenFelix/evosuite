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

public class DefaultValues_setRoundPixels_122796009028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4371;
     Object term4462;

    public DefaultValues_setRoundPixels_122796009028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4371 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4371, term4371.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4371, term4371.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4371, term4371.getClass(), "bgColor", "0x000000");
        setField(term4371, term4371.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4371, term4371.getClass(), "planeColor", "0x00FF00");
        setField(term4371, term4371.getClass(), "bothColor", "0x4D4D4D");
        setField(term4371, term4371.getClass(), "printSymbol", "#");
        setBooleanField(term4371, term4371.getClass(), "printToConsole", false);
        setBooleanField(term4371, term4371.getClass(), "disableUiUpdates", false);
        setBooleanField(term4371, term4371.getClass(), "roundPixels", false);
        setBooleanField(term4371, term4371.getClass(), "blur", false);
        setBooleanField(term4371, term4371.getClass(), "glow", false);
        setDoubleField(term4371, term4371.getClass(), "blurValue", 0.8566567697571895);
        setDoubleField(term4371, term4371.getClass(), "glowValue", 0.9203805380592256);
        setBooleanField(term4371, term4371.getClass(), "quirkShift", false);
        setBooleanField(term4371, term4371.getClass(), "quirkJump", false);
        setBooleanField(term4371, term4371.getClass(), "quirkIndex", false);
        setBooleanField(term4371, term4371.getClass(), "quirkOrder", false);
        term4462 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4462;
        callMethod(klass, "setRoundPixels", argTypes, term4371, args);
    }

};


