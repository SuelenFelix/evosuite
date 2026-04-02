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

public class DefaultValues_setBlur_201065090229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4529;
     Object term4620;

    public DefaultValues_setBlur_201065090229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4529 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4529, term4529.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4529, term4529.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4529, term4529.getClass(), "bgColor", "0x000000");
        setField(term4529, term4529.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4529, term4529.getClass(), "planeColor", "0x00FF00");
        setField(term4529, term4529.getClass(), "bothColor", "0x4D4D4D");
        setField(term4529, term4529.getClass(), "printSymbol", "#");
        setBooleanField(term4529, term4529.getClass(), "printToConsole", true);
        setBooleanField(term4529, term4529.getClass(), "disableUiUpdates", true);
        setBooleanField(term4529, term4529.getClass(), "roundPixels", false);
        setBooleanField(term4529, term4529.getClass(), "blur", true);
        setBooleanField(term4529, term4529.getClass(), "glow", false);
        setDoubleField(term4529, term4529.getClass(), "blurValue", 0.5804948995371725);
        setDoubleField(term4529, term4529.getClass(), "glowValue", 0.20737514139742264);
        setBooleanField(term4529, term4529.getClass(), "quirkShift", true);
        setBooleanField(term4529, term4529.getClass(), "quirkJump", false);
        setBooleanField(term4529, term4529.getClass(), "quirkIndex", false);
        setBooleanField(term4529, term4529.getClass(), "quirkOrder", false);
        term4620 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4620;
        callMethod(klass, "setBlur", argTypes, term4529, args);
    }

};


