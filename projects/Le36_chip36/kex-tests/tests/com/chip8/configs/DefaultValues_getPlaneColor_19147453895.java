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

public class DefaultValues_getPlaneColor_19147453895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public DefaultValues_getPlaneColor_19147453895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term625, term625.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term625, term625.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term625, term625.getClass(), "bgColor", "0x000000");
        setField(term625, term625.getClass(), "spriteColor", "0xFFFFFF");
        setField(term625, term625.getClass(), "planeColor", "0x00FF00");
        setField(term625, term625.getClass(), "bothColor", "0x4D4D4D");
        setField(term625, term625.getClass(), "printSymbol", "#");
        setBooleanField(term625, term625.getClass(), "printToConsole", true);
        setBooleanField(term625, term625.getClass(), "disableUiUpdates", true);
        setBooleanField(term625, term625.getClass(), "roundPixels", true);
        setBooleanField(term625, term625.getClass(), "blur", false);
        setBooleanField(term625, term625.getClass(), "glow", false);
        setDoubleField(term625, term625.getClass(), "blurValue", 0.6076495596892013);
        setDoubleField(term625, term625.getClass(), "glowValue", 0.37773193782763337);
        setBooleanField(term625, term625.getClass(), "quirkShift", false);
        setBooleanField(term625, term625.getClass(), "quirkJump", true);
        setBooleanField(term625, term625.getClass(), "quirkIndex", true);
        setBooleanField(term625, term625.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaneColor", argTypes, term625, args);
    }

};


