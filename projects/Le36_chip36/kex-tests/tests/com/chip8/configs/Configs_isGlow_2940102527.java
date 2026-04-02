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

public class Configs_isGlow_2940102527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7551;

    public Configs_isGlow_2940102527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7551 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7551, term7551.getClass(), "printToConsole", false);
        setBooleanField(term7551, term7551.getClass(), "disableUiUpdates", false);
        setField(term7551, term7551.getClass(), "printSymbol", "#");
        setBooleanField(term7551, term7551.getClass(), "spriteExtracting", true);
        setBooleanField(term7551, term7551.getClass(), "roundPixels", false);
        setBooleanField(term7551, term7551.getClass(), "blur", true);
        setBooleanField(term7551, term7551.getClass(), "glow", true);
        setDoubleField(term7551, term7551.getClass(), "blurValue", 0.16988691727397487);
        setDoubleField(term7551, term7551.getClass(), "glowValue", 0.39286935532362843);
        setField(term7551, term7551.getClass(), "bgColor", "dWRymuLBtr");
        setField(term7551, term7551.getClass(), "spriteColor", "AijpHYOFuy");
        setField(term7551, term7551.getClass(), "planeColor", "SbAoxhfrkn");
        setField(term7551, term7551.getClass(), "bothColor", "kuTXqwMtDB");
        setBooleanField(term7551, term7551.getClass(), "quirkShift", false);
        setBooleanField(term7551, term7551.getClass(), "quirkJump", false);
        setBooleanField(term7551, term7551.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7551, term7551.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGlow", argTypes, term7551, args);
    }

};


