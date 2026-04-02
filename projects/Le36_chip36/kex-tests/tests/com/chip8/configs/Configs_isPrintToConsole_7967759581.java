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

public class Configs_isPrintToConsole_7967759581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6921;

    public Configs_isPrintToConsole_7967759581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6921 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term6921, term6921.getClass(), "printToConsole", false);
        setBooleanField(term6921, term6921.getClass(), "disableUiUpdates", true);
        setField(term6921, term6921.getClass(), "printSymbol", "#");
        setBooleanField(term6921, term6921.getClass(), "spriteExtracting", false);
        setBooleanField(term6921, term6921.getClass(), "roundPixels", false);
        setBooleanField(term6921, term6921.getClass(), "blur", true);
        setBooleanField(term6921, term6921.getClass(), "glow", false);
        setDoubleField(term6921, term6921.getClass(), "blurValue", 0.8924855581421237);
        setDoubleField(term6921, term6921.getClass(), "glowValue", 0.32237559209193944);
        setField(term6921, term6921.getClass(), "bgColor", "MjGYSRKTNF");
        setField(term6921, term6921.getClass(), "spriteColor", "hRNSzYYIrc");
        setField(term6921, term6921.getClass(), "planeColor", "RMFIsYGgne");
        setField(term6921, term6921.getClass(), "bothColor", "NRdvgJlhkX");
        setBooleanField(term6921, term6921.getClass(), "quirkShift", false);
        setBooleanField(term6921, term6921.getClass(), "quirkJump", true);
        setBooleanField(term6921, term6921.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term6921, term6921.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintToConsole", argTypes, term6921, args);
    }

};


