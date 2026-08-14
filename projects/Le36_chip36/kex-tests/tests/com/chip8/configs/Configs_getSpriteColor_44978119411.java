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

public class Configs_getSpriteColor_44978119411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7971;

    public Configs_getSpriteColor_44978119411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7971 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7971, term7971.getClass(), "printToConsole", false);
        setBooleanField(term7971, term7971.getClass(), "disableUiUpdates", true);
        setField(term7971, term7971.getClass(), "printSymbol", "#");
        setBooleanField(term7971, term7971.getClass(), "spriteExtracting", false);
        setBooleanField(term7971, term7971.getClass(), "roundPixels", true);
        setBooleanField(term7971, term7971.getClass(), "blur", false);
        setBooleanField(term7971, term7971.getClass(), "glow", false);
        setDoubleField(term7971, term7971.getClass(), "blurValue", 0.5644914462415626);
        setDoubleField(term7971, term7971.getClass(), "glowValue", 0.509895859167191);
        setField(term7971, term7971.getClass(), "bgColor", "LvtrsXUliU");
        setField(term7971, term7971.getClass(), "spriteColor", "xLbjWUgOIL");
        setField(term7971, term7971.getClass(), "planeColor", "jDtqGUpnZN");
        setField(term7971, term7971.getClass(), "bothColor", "nGKItKLYNC");
        setBooleanField(term7971, term7971.getClass(), "quirkShift", true);
        setBooleanField(term7971, term7971.getClass(), "quirkJump", true);
        setBooleanField(term7971, term7971.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7971, term7971.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpriteColor", argTypes, term7971, args);
    }

};


