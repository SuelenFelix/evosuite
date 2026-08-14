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

public class DefaultValues_setPrintSymbol_91988454325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3877;

    public DefaultValues_setPrintSymbol_91988454325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3877 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term3877, term3877.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term3877, term3877.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term3877, term3877.getClass(), "bgColor", "0x000000");
        setField(term3877, term3877.getClass(), "spriteColor", "0xFFFFFF");
        setField(term3877, term3877.getClass(), "planeColor", "0x00FF00");
        setField(term3877, term3877.getClass(), "bothColor", "0x4D4D4D");
        setField(term3877, term3877.getClass(), "printSymbol", "#");
        setBooleanField(term3877, term3877.getClass(), "printToConsole", true);
        setBooleanField(term3877, term3877.getClass(), "disableUiUpdates", true);
        setBooleanField(term3877, term3877.getClass(), "roundPixels", false);
        setBooleanField(term3877, term3877.getClass(), "blur", false);
        setBooleanField(term3877, term3877.getClass(), "glow", false);
        setDoubleField(term3877, term3877.getClass(), "blurValue", 0.7591353014991907);
        setDoubleField(term3877, term3877.getClass(), "glowValue", 0.791695029600875);
        setBooleanField(term3877, term3877.getClass(), "quirkShift", false);
        setBooleanField(term3877, term3877.getClass(), "quirkJump", true);
        setBooleanField(term3877, term3877.getClass(), "quirkIndex", true);
        setBooleanField(term3877, term3877.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setPrintSymbol", argTypes, term3877, args);
    }

};


