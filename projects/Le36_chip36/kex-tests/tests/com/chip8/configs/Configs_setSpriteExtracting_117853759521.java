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
import java.lang.Boolean;

public class Configs_setSpriteExtracting_117853759521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9047;
     Object term9111;

    public Configs_setSpriteExtracting_117853759521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9047 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9047, term9047.getClass(), "printToConsole", true);
        setBooleanField(term9047, term9047.getClass(), "disableUiUpdates", true);
        setField(term9047, term9047.getClass(), "printSymbol", "#");
        setBooleanField(term9047, term9047.getClass(), "spriteExtracting", false);
        setBooleanField(term9047, term9047.getClass(), "roundPixels", false);
        setBooleanField(term9047, term9047.getClass(), "blur", false);
        setBooleanField(term9047, term9047.getClass(), "glow", true);
        setDoubleField(term9047, term9047.getClass(), "blurValue", 0.9511861072660375);
        setDoubleField(term9047, term9047.getClass(), "glowValue", 0.05880719443135807);
        setField(term9047, term9047.getClass(), "bgColor", "PkWMRdJcBb");
        setField(term9047, term9047.getClass(), "spriteColor", "jSpAteRute");
        setField(term9047, term9047.getClass(), "planeColor", "swZVeJAxjt");
        setField(term9047, term9047.getClass(), "bothColor", "xOcJIiQQDu");
        setBooleanField(term9047, term9047.getClass(), "quirkShift", false);
        setBooleanField(term9047, term9047.getClass(), "quirkJump", true);
        setBooleanField(term9047, term9047.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9047, term9047.getClass(), "quirkOrder", true);
        term9111 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9111;
        callMethod(klass, "setSpriteExtracting", argTypes, term9047, args);
    }

};


