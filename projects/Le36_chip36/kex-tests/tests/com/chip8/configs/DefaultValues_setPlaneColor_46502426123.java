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

public class DefaultValues_setPlaneColor_46502426123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3521;

    public DefaultValues_setPlaneColor_46502426123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3521 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term3521, term3521.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term3521, term3521.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term3521, term3521.getClass(), "bgColor", "0x000000");
        setField(term3521, term3521.getClass(), "spriteColor", "0xFFFFFF");
        setField(term3521, term3521.getClass(), "planeColor", "0x00FF00");
        setField(term3521, term3521.getClass(), "bothColor", "0x4D4D4D");
        setField(term3521, term3521.getClass(), "printSymbol", "#");
        setBooleanField(term3521, term3521.getClass(), "printToConsole", false);
        setBooleanField(term3521, term3521.getClass(), "disableUiUpdates", true);
        setBooleanField(term3521, term3521.getClass(), "roundPixels", true);
        setBooleanField(term3521, term3521.getClass(), "blur", false);
        setBooleanField(term3521, term3521.getClass(), "glow", true);
        setDoubleField(term3521, term3521.getClass(), "blurValue", 0.25937345430928016);
        setDoubleField(term3521, term3521.getClass(), "glowValue", 0.5873228247510078);
        setBooleanField(term3521, term3521.getClass(), "quirkShift", true);
        setBooleanField(term3521, term3521.getClass(), "quirkJump", true);
        setBooleanField(term3521, term3521.getClass(), "quirkIndex", true);
        setBooleanField(term3521, term3521.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setPlaneColor", argTypes, term3521, args);
    }

};


