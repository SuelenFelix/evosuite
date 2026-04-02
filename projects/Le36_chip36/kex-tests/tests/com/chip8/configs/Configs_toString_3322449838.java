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

public class Configs_toString_3322449838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10942;

    public Configs_toString_3322449838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10942 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10942, term10942.getClass(), "printToConsole", true);
        setBooleanField(term10942, term10942.getClass(), "disableUiUpdates", true);
        setField(term10942, term10942.getClass(), "printSymbol", "#");
        setBooleanField(term10942, term10942.getClass(), "spriteExtracting", true);
        setBooleanField(term10942, term10942.getClass(), "roundPixels", true);
        setBooleanField(term10942, term10942.getClass(), "blur", false);
        setBooleanField(term10942, term10942.getClass(), "glow", true);
        setDoubleField(term10942, term10942.getClass(), "blurValue", 0.9165240441138934);
        setDoubleField(term10942, term10942.getClass(), "glowValue", 0.22227423914231126);
        setField(term10942, term10942.getClass(), "bgColor", "VeDtgDzGAN");
        setField(term10942, term10942.getClass(), "spriteColor", "aWYOWZFyaX");
        setField(term10942, term10942.getClass(), "planeColor", "BRIVNtfUWU");
        setField(term10942, term10942.getClass(), "bothColor", "DbiCVtPPCT");
        setBooleanField(term10942, term10942.getClass(), "quirkShift", false);
        setBooleanField(term10942, term10942.getClass(), "quirkJump", true);
        setBooleanField(term10942, term10942.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10942, term10942.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10942, args);
    }

};


