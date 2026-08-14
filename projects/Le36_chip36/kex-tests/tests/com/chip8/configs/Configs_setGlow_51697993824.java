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

public class Configs_setGlow_51697993824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9368;
     Object term9432;

    public Configs_setGlow_51697993824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9368 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9368, term9368.getClass(), "printToConsole", false);
        setBooleanField(term9368, term9368.getClass(), "disableUiUpdates", false);
        setField(term9368, term9368.getClass(), "printSymbol", "#");
        setBooleanField(term9368, term9368.getClass(), "spriteExtracting", false);
        setBooleanField(term9368, term9368.getClass(), "roundPixels", true);
        setBooleanField(term9368, term9368.getClass(), "blur", true);
        setBooleanField(term9368, term9368.getClass(), "glow", true);
        setDoubleField(term9368, term9368.getClass(), "blurValue", 0.9022041121474429);
        setDoubleField(term9368, term9368.getClass(), "glowValue", 0.6512870939318848);
        setField(term9368, term9368.getClass(), "bgColor", "SPpkrGcPRr");
        setField(term9368, term9368.getClass(), "spriteColor", "sEccwbJKYE");
        setField(term9368, term9368.getClass(), "planeColor", "AWRooQKkdW");
        setField(term9368, term9368.getClass(), "bothColor", "vjxIhXHxGR");
        setBooleanField(term9368, term9368.getClass(), "quirkShift", true);
        setBooleanField(term9368, term9368.getClass(), "quirkJump", true);
        setBooleanField(term9368, term9368.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term9368, term9368.getClass(), "quirkOrder", true);
        term9432 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9432;
        callMethod(klass, "setGlow", argTypes, term9368, args);
    }

};


