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

public class DefaultValues_getBgColor_7906977203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;

    public DefaultValues_getBgColor_7906977203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term313, term313.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term313, term313.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term313, term313.getClass(), "bgColor", "0x000000");
        setField(term313, term313.getClass(), "spriteColor", "0xFFFFFF");
        setField(term313, term313.getClass(), "planeColor", "0x00FF00");
        setField(term313, term313.getClass(), "bothColor", "0x4D4D4D");
        setField(term313, term313.getClass(), "printSymbol", "#");
        setBooleanField(term313, term313.getClass(), "printToConsole", false);
        setBooleanField(term313, term313.getClass(), "disableUiUpdates", false);
        setBooleanField(term313, term313.getClass(), "roundPixels", true);
        setBooleanField(term313, term313.getClass(), "blur", true);
        setBooleanField(term313, term313.getClass(), "glow", true);
        setDoubleField(term313, term313.getClass(), "blurValue", 0.28570734989730284);
        setDoubleField(term313, term313.getClass(), "glowValue", 0.40176586625454525);
        setBooleanField(term313, term313.getClass(), "quirkShift", true);
        setBooleanField(term313, term313.getClass(), "quirkJump", true);
        setBooleanField(term313, term313.getClass(), "quirkIndex", false);
        setBooleanField(term313, term313.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBgColor", argTypes, term313, args);
    }

};


