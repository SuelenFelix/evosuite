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

public class DefaultValues_setSpriteColor_183182701622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3343;

    public DefaultValues_setSpriteColor_183182701622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3343 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term3343, term3343.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term3343, term3343.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term3343, term3343.getClass(), "bgColor", "0x000000");
        setField(term3343, term3343.getClass(), "spriteColor", "0xFFFFFF");
        setField(term3343, term3343.getClass(), "planeColor", "0x00FF00");
        setField(term3343, term3343.getClass(), "bothColor", "0x4D4D4D");
        setField(term3343, term3343.getClass(), "printSymbol", "#");
        setBooleanField(term3343, term3343.getClass(), "printToConsole", false);
        setBooleanField(term3343, term3343.getClass(), "disableUiUpdates", false);
        setBooleanField(term3343, term3343.getClass(), "roundPixels", false);
        setBooleanField(term3343, term3343.getClass(), "blur", false);
        setBooleanField(term3343, term3343.getClass(), "glow", true);
        setDoubleField(term3343, term3343.getClass(), "blurValue", 0.6588948704887806);
        setDoubleField(term3343, term3343.getClass(), "glowValue", 0.6397214730945112);
        setBooleanField(term3343, term3343.getClass(), "quirkShift", true);
        setBooleanField(term3343, term3343.getClass(), "quirkJump", true);
        setBooleanField(term3343, term3343.getClass(), "quirkIndex", false);
        setBooleanField(term3343, term3343.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setSpriteColor", argTypes, term3343, args);
    }

};


