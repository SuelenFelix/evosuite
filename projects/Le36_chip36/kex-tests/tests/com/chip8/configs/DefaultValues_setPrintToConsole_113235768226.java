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

public class DefaultValues_setPrintToConsole_113235768226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4055;
     Object term4146;

    public DefaultValues_setPrintToConsole_113235768226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4055 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term4055, term4055.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term4055, term4055.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term4055, term4055.getClass(), "bgColor", "0x000000");
        setField(term4055, term4055.getClass(), "spriteColor", "0xFFFFFF");
        setField(term4055, term4055.getClass(), "planeColor", "0x00FF00");
        setField(term4055, term4055.getClass(), "bothColor", "0x4D4D4D");
        setField(term4055, term4055.getClass(), "printSymbol", "#");
        setBooleanField(term4055, term4055.getClass(), "printToConsole", true);
        setBooleanField(term4055, term4055.getClass(), "disableUiUpdates", false);
        setBooleanField(term4055, term4055.getClass(), "roundPixels", false);
        setBooleanField(term4055, term4055.getClass(), "blur", true);
        setBooleanField(term4055, term4055.getClass(), "glow", false);
        setDoubleField(term4055, term4055.getClass(), "blurValue", 0.6862221294683138);
        setDoubleField(term4055, term4055.getClass(), "glowValue", 0.15917839663695388);
        setBooleanField(term4055, term4055.getClass(), "quirkShift", true);
        setBooleanField(term4055, term4055.getClass(), "quirkJump", true);
        setBooleanField(term4055, term4055.getClass(), "quirkIndex", true);
        setBooleanField(term4055, term4055.getClass(), "quirkOrder", false);
        term4146 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4146;
        callMethod(klass, "setPrintToConsole", argTypes, term4055, args);
    }

};


