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

public class DefaultValues_isRoundPixels_204702057210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405;

    public DefaultValues_isRoundPixels_204702057210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1405 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term1405, term1405.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term1405, term1405.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term1405, term1405.getClass(), "bgColor", "0x000000");
        setField(term1405, term1405.getClass(), "spriteColor", "0xFFFFFF");
        setField(term1405, term1405.getClass(), "planeColor", "0x00FF00");
        setField(term1405, term1405.getClass(), "bothColor", "0x4D4D4D");
        setField(term1405, term1405.getClass(), "printSymbol", "#");
        setBooleanField(term1405, term1405.getClass(), "printToConsole", false);
        setBooleanField(term1405, term1405.getClass(), "disableUiUpdates", true);
        setBooleanField(term1405, term1405.getClass(), "roundPixels", false);
        setBooleanField(term1405, term1405.getClass(), "blur", true);
        setBooleanField(term1405, term1405.getClass(), "glow", false);
        setDoubleField(term1405, term1405.getClass(), "blurValue", 0.6436713023569729);
        setDoubleField(term1405, term1405.getClass(), "glowValue", 0.7332741045694002);
        setBooleanField(term1405, term1405.getClass(), "quirkShift", true);
        setBooleanField(term1405, term1405.getClass(), "quirkJump", false);
        setBooleanField(term1405, term1405.getClass(), "quirkIndex", false);
        setBooleanField(term1405, term1405.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRoundPixels", argTypes, term1405, args);
    }

};


