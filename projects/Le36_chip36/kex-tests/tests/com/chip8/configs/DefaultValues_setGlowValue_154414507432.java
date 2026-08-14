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
import java.lang.Double;

public class DefaultValues_setGlowValue_154414507432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5003;
     Object term5094;

    public DefaultValues_setGlowValue_154414507432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5003 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term5003, term5003.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term5003, term5003.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term5003, term5003.getClass(), "bgColor", "0x000000");
        setField(term5003, term5003.getClass(), "spriteColor", "0xFFFFFF");
        setField(term5003, term5003.getClass(), "planeColor", "0x00FF00");
        setField(term5003, term5003.getClass(), "bothColor", "0x4D4D4D");
        setField(term5003, term5003.getClass(), "printSymbol", "#");
        setBooleanField(term5003, term5003.getClass(), "printToConsole", true);
        setBooleanField(term5003, term5003.getClass(), "disableUiUpdates", true);
        setBooleanField(term5003, term5003.getClass(), "roundPixels", true);
        setBooleanField(term5003, term5003.getClass(), "blur", true);
        setBooleanField(term5003, term5003.getClass(), "glow", true);
        setDoubleField(term5003, term5003.getClass(), "blurValue", 0.9126850255993704);
        setDoubleField(term5003, term5003.getClass(), "glowValue", 0.11179067076100713);
        setBooleanField(term5003, term5003.getClass(), "quirkShift", true);
        setBooleanField(term5003, term5003.getClass(), "quirkJump", true);
        setBooleanField(term5003, term5003.getClass(), "quirkIndex", false);
        setBooleanField(term5003, term5003.getClass(), "quirkOrder", false);
        term5094 = new Double(0.5306473989087822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5094;
        callMethod(klass, "setGlowValue", argTypes, term5003, args);
    }

};


