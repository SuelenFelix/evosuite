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

public class Configs_setRoundPixels_68234818022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9154;
     Object term9218;

    public Configs_setRoundPixels_68234818022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9154 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9154, term9154.getClass(), "printToConsole", false);
        setBooleanField(term9154, term9154.getClass(), "disableUiUpdates", true);
        setField(term9154, term9154.getClass(), "printSymbol", "#");
        setBooleanField(term9154, term9154.getClass(), "spriteExtracting", false);
        setBooleanField(term9154, term9154.getClass(), "roundPixels", true);
        setBooleanField(term9154, term9154.getClass(), "blur", false);
        setBooleanField(term9154, term9154.getClass(), "glow", false);
        setDoubleField(term9154, term9154.getClass(), "blurValue", 0.34010089048558567);
        setDoubleField(term9154, term9154.getClass(), "glowValue", 0.19625398866403143);
        setField(term9154, term9154.getClass(), "bgColor", "GVizqqzXpy");
        setField(term9154, term9154.getClass(), "spriteColor", "JqXGgAhZPl");
        setField(term9154, term9154.getClass(), "planeColor", "jiKYgYHqIS");
        setField(term9154, term9154.getClass(), "bothColor", "DfISiziTgG");
        setBooleanField(term9154, term9154.getClass(), "quirkShift", true);
        setBooleanField(term9154, term9154.getClass(), "quirkJump", false);
        setBooleanField(term9154, term9154.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term9154, term9154.getClass(), "quirkOrder", false);
        term9218 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9218;
        callMethod(klass, "setRoundPixels", argTypes, term9154, args);
    }

};


