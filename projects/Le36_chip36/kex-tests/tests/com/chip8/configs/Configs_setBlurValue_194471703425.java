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

public class Configs_setBlurValue_194471703425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9475;
     Object term9539;

    public Configs_setBlurValue_194471703425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9475 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9475, term9475.getClass(), "printToConsole", true);
        setBooleanField(term9475, term9475.getClass(), "disableUiUpdates", true);
        setField(term9475, term9475.getClass(), "printSymbol", "#");
        setBooleanField(term9475, term9475.getClass(), "spriteExtracting", false);
        setBooleanField(term9475, term9475.getClass(), "roundPixels", true);
        setBooleanField(term9475, term9475.getClass(), "blur", false);
        setBooleanField(term9475, term9475.getClass(), "glow", true);
        setDoubleField(term9475, term9475.getClass(), "blurValue", 0.8777038609128434);
        setDoubleField(term9475, term9475.getClass(), "glowValue", 0.008025683154629148);
        setField(term9475, term9475.getClass(), "bgColor", "QXzGXbEXMu");
        setField(term9475, term9475.getClass(), "spriteColor", "qxSDVejjiY");
        setField(term9475, term9475.getClass(), "planeColor", "xBsXSDjXYK");
        setField(term9475, term9475.getClass(), "bothColor", "sEnIVFtZuQ");
        setBooleanField(term9475, term9475.getClass(), "quirkShift", true);
        setBooleanField(term9475, term9475.getClass(), "quirkJump", true);
        setBooleanField(term9475, term9475.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9475, term9475.getClass(), "quirkOrder", true);
        term9539 = new Double(0.40598298281353484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9539;
        callMethod(klass, "setBlurValue", argTypes, term9475, args);
    }

};


