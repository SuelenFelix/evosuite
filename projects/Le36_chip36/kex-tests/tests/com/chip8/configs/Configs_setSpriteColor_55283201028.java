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

public class Configs_setSpriteColor_55283201028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9816;

    public Configs_setSpriteColor_55283201028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9816 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9816, term9816.getClass(), "printToConsole", false);
        setBooleanField(term9816, term9816.getClass(), "disableUiUpdates", false);
        setField(term9816, term9816.getClass(), "printSymbol", "#");
        setBooleanField(term9816, term9816.getClass(), "spriteExtracting", true);
        setBooleanField(term9816, term9816.getClass(), "roundPixels", false);
        setBooleanField(term9816, term9816.getClass(), "blur", true);
        setBooleanField(term9816, term9816.getClass(), "glow", false);
        setDoubleField(term9816, term9816.getClass(), "blurValue", 0.4772043271031934);
        setDoubleField(term9816, term9816.getClass(), "glowValue", 0.2446504549754045);
        setField(term9816, term9816.getClass(), "bgColor", "XylxrMBraH");
        setField(term9816, term9816.getClass(), "spriteColor", "pORebkoRdD");
        setField(term9816, term9816.getClass(), "planeColor", "mXGCWJDOqA");
        setField(term9816, term9816.getClass(), "bothColor", "dpNsDgfPso");
        setBooleanField(term9816, term9816.getClass(), "quirkShift", false);
        setBooleanField(term9816, term9816.getClass(), "quirkJump", false);
        setBooleanField(term9816, term9816.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term9816, term9816.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setSpriteColor", argTypes, term9816, args);
    }

};


