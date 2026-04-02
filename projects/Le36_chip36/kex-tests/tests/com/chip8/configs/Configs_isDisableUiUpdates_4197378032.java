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

public class Configs_isDisableUiUpdates_4197378032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7026;

    public Configs_isDisableUiUpdates_4197378032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7026 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7026, term7026.getClass(), "printToConsole", false);
        setBooleanField(term7026, term7026.getClass(), "disableUiUpdates", true);
        setField(term7026, term7026.getClass(), "printSymbol", "#");
        setBooleanField(term7026, term7026.getClass(), "spriteExtracting", true);
        setBooleanField(term7026, term7026.getClass(), "roundPixels", true);
        setBooleanField(term7026, term7026.getClass(), "blur", false);
        setBooleanField(term7026, term7026.getClass(), "glow", false);
        setDoubleField(term7026, term7026.getClass(), "blurValue", 0.53094494792755);
        setDoubleField(term7026, term7026.getClass(), "glowValue", 0.146431486357265);
        setField(term7026, term7026.getClass(), "bgColor", "uuaPigETmJ");
        setField(term7026, term7026.getClass(), "spriteColor", "MxlszYVzRf");
        setField(term7026, term7026.getClass(), "planeColor", "LQFpaHEwXR");
        setField(term7026, term7026.getClass(), "bothColor", "oVcInYnLWB");
        setBooleanField(term7026, term7026.getClass(), "quirkShift", true);
        setBooleanField(term7026, term7026.getClass(), "quirkJump", false);
        setBooleanField(term7026, term7026.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term7026, term7026.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDisableUiUpdates", argTypes, term7026, args);
    }

};


