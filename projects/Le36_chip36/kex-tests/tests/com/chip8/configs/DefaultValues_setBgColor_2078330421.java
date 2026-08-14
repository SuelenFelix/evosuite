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

public class DefaultValues_setBgColor_2078330421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3165;

    public DefaultValues_setBgColor_2078330421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3165 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term3165, term3165.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term3165, term3165.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term3165, term3165.getClass(), "bgColor", "0x000000");
        setField(term3165, term3165.getClass(), "spriteColor", "0xFFFFFF");
        setField(term3165, term3165.getClass(), "planeColor", "0x00FF00");
        setField(term3165, term3165.getClass(), "bothColor", "0x4D4D4D");
        setField(term3165, term3165.getClass(), "printSymbol", "#");
        setBooleanField(term3165, term3165.getClass(), "printToConsole", false);
        setBooleanField(term3165, term3165.getClass(), "disableUiUpdates", true);
        setBooleanField(term3165, term3165.getClass(), "roundPixels", false);
        setBooleanField(term3165, term3165.getClass(), "blur", false);
        setBooleanField(term3165, term3165.getClass(), "glow", true);
        setDoubleField(term3165, term3165.getClass(), "blurValue", 0.22651340641904605);
        setDoubleField(term3165, term3165.getClass(), "glowValue", 0.8878841294187743);
        setBooleanField(term3165, term3165.getClass(), "quirkShift", true);
        setBooleanField(term3165, term3165.getClass(), "quirkJump", true);
        setBooleanField(term3165, term3165.getClass(), "quirkIndex", true);
        setBooleanField(term3165, term3165.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setBgColor", argTypes, term3165, args);
    }

};


