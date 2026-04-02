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

public class DefaultValues_setRebindLayout_207015362419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2809;

    public DefaultValues_setRebindLayout_207015362419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2809 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term2809, term2809.getClass(), "rebindLayout", "1234QWERASDFZXCV");
        setField(term2809, term2809.getClass(), "mouseKbLayout", "123C456D789EA0BF");
        setField(term2809, term2809.getClass(), "bgColor", "0x000000");
        setField(term2809, term2809.getClass(), "spriteColor", "0xFFFFFF");
        setField(term2809, term2809.getClass(), "planeColor", "0x00FF00");
        setField(term2809, term2809.getClass(), "bothColor", "0x4D4D4D");
        setField(term2809, term2809.getClass(), "printSymbol", "#");
        setBooleanField(term2809, term2809.getClass(), "printToConsole", false);
        setBooleanField(term2809, term2809.getClass(), "disableUiUpdates", false);
        setBooleanField(term2809, term2809.getClass(), "roundPixels", true);
        setBooleanField(term2809, term2809.getClass(), "blur", true);
        setBooleanField(term2809, term2809.getClass(), "glow", false);
        setDoubleField(term2809, term2809.getClass(), "blurValue", 0.3587267442738795);
        setDoubleField(term2809, term2809.getClass(), "glowValue", 0.07802449704920456);
        setBooleanField(term2809, term2809.getClass(), "quirkShift", true);
        setBooleanField(term2809, term2809.getClass(), "quirkJump", true);
        setBooleanField(term2809, term2809.getClass(), "quirkIndex", false);
        setBooleanField(term2809, term2809.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "setRebindLayout", argTypes, term2809, args);
    }

};


