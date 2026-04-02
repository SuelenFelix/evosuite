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

public class Configs_setPrintSymbol_99042372720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8920;

    public Configs_setPrintSymbol_99042372720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8920 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8920, term8920.getClass(), "printToConsole", false);
        setBooleanField(term8920, term8920.getClass(), "disableUiUpdates", false);
        setField(term8920, term8920.getClass(), "printSymbol", "#");
        setBooleanField(term8920, term8920.getClass(), "spriteExtracting", false);
        setBooleanField(term8920, term8920.getClass(), "roundPixels", false);
        setBooleanField(term8920, term8920.getClass(), "blur", true);
        setBooleanField(term8920, term8920.getClass(), "glow", true);
        setDoubleField(term8920, term8920.getClass(), "blurValue", 0.3074693824288357);
        setDoubleField(term8920, term8920.getClass(), "glowValue", 0.1245258965512791);
        setField(term8920, term8920.getClass(), "bgColor", "bWWfajKbEX");
        setField(term8920, term8920.getClass(), "spriteColor", "cAPeiZHKGJ");
        setField(term8920, term8920.getClass(), "planeColor", "LvJFtLBaxj");
        setField(term8920, term8920.getClass(), "bothColor", "PHvxnGHptP");
        setBooleanField(term8920, term8920.getClass(), "quirkShift", false);
        setBooleanField(term8920, term8920.getClass(), "quirkJump", false);
        setBooleanField(term8920, term8920.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term8920, term8920.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TimdotUuNC";
        callMethod(klass, "setPrintSymbol", argTypes, term8920, args);
    }

};


