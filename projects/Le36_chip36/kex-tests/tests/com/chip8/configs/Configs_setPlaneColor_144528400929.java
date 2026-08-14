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

public class Configs_setPlaneColor_144528400929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9943;

    public Configs_setPlaneColor_144528400929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9943 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9943, term9943.getClass(), "printToConsole", true);
        setBooleanField(term9943, term9943.getClass(), "disableUiUpdates", true);
        setField(term9943, term9943.getClass(), "printSymbol", "#");
        setBooleanField(term9943, term9943.getClass(), "spriteExtracting", true);
        setBooleanField(term9943, term9943.getClass(), "roundPixels", true);
        setBooleanField(term9943, term9943.getClass(), "blur", false);
        setBooleanField(term9943, term9943.getClass(), "glow", false);
        setDoubleField(term9943, term9943.getClass(), "blurValue", 0.6142723998707854);
        setDoubleField(term9943, term9943.getClass(), "glowValue", 0.4355627280318103);
        setField(term9943, term9943.getClass(), "bgColor", "WzMEhMXkKx");
        setField(term9943, term9943.getClass(), "spriteColor", "XOiDvlDhdc");
        setField(term9943, term9943.getClass(), "planeColor", "AdxvLJhNLe");
        setField(term9943, term9943.getClass(), "bothColor", "lHfTrWKMPk");
        setBooleanField(term9943, term9943.getClass(), "quirkShift", false);
        setBooleanField(term9943, term9943.getClass(), "quirkJump", false);
        setBooleanField(term9943, term9943.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9943, term9943.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setPlaneColor", argTypes, term9943, args);
    }

};


