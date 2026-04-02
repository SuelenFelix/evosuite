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

public class Configs_isQuirkJump_83305552115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8391;

    public Configs_isQuirkJump_83305552115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8391 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8391, term8391.getClass(), "printToConsole", true);
        setBooleanField(term8391, term8391.getClass(), "disableUiUpdates", true);
        setField(term8391, term8391.getClass(), "printSymbol", "#");
        setBooleanField(term8391, term8391.getClass(), "spriteExtracting", false);
        setBooleanField(term8391, term8391.getClass(), "roundPixels", false);
        setBooleanField(term8391, term8391.getClass(), "blur", true);
        setBooleanField(term8391, term8391.getClass(), "glow", false);
        setDoubleField(term8391, term8391.getClass(), "blurValue", 0.0865998004187658);
        setDoubleField(term8391, term8391.getClass(), "glowValue", 0.9628647861255637);
        setField(term8391, term8391.getClass(), "bgColor", "eqJfYWRaEL");
        setField(term8391, term8391.getClass(), "spriteColor", "fhkbdRViHi");
        setField(term8391, term8391.getClass(), "planeColor", "uWHnvSvaPl");
        setField(term8391, term8391.getClass(), "bothColor", "kBdSllIBVz");
        setBooleanField(term8391, term8391.getClass(), "quirkShift", true);
        setBooleanField(term8391, term8391.getClass(), "quirkJump", false);
        setBooleanField(term8391, term8391.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term8391, term8391.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkJump", argTypes, term8391, args);
    }

};


