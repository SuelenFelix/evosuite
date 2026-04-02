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

public class Configs_getPrintSymbol_10934745433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7131;

    public Configs_getPrintSymbol_10934745433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7131 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7131, term7131.getClass(), "printToConsole", false);
        setBooleanField(term7131, term7131.getClass(), "disableUiUpdates", true);
        setField(term7131, term7131.getClass(), "printSymbol", "#");
        setBooleanField(term7131, term7131.getClass(), "spriteExtracting", true);
        setBooleanField(term7131, term7131.getClass(), "roundPixels", false);
        setBooleanField(term7131, term7131.getClass(), "blur", false);
        setBooleanField(term7131, term7131.getClass(), "glow", false);
        setDoubleField(term7131, term7131.getClass(), "blurValue", 0.24259014218848696);
        setDoubleField(term7131, term7131.getClass(), "glowValue", 0.1544348383112728);
        setField(term7131, term7131.getClass(), "bgColor", "aJlieCFVtF");
        setField(term7131, term7131.getClass(), "spriteColor", "ZiaGIbnzTs");
        setField(term7131, term7131.getClass(), "planeColor", "tbcdzjIfER");
        setField(term7131, term7131.getClass(), "bothColor", "HyxfbSQYBe");
        setBooleanField(term7131, term7131.getClass(), "quirkShift", false);
        setBooleanField(term7131, term7131.getClass(), "quirkJump", false);
        setBooleanField(term7131, term7131.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term7131, term7131.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintSymbol", argTypes, term7131, args);
    }

};


