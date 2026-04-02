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

public class Configs_getBgColor_111961055010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7866;

    public Configs_getBgColor_111961055010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7866 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7866, term7866.getClass(), "printToConsole", false);
        setBooleanField(term7866, term7866.getClass(), "disableUiUpdates", false);
        setField(term7866, term7866.getClass(), "printSymbol", "#");
        setBooleanField(term7866, term7866.getClass(), "spriteExtracting", false);
        setBooleanField(term7866, term7866.getClass(), "roundPixels", true);
        setBooleanField(term7866, term7866.getClass(), "blur", false);
        setBooleanField(term7866, term7866.getClass(), "glow", true);
        setDoubleField(term7866, term7866.getClass(), "blurValue", 0.7171972879282721);
        setDoubleField(term7866, term7866.getClass(), "glowValue", 0.9006361024877096);
        setField(term7866, term7866.getClass(), "bgColor", "hxCBltsObl");
        setField(term7866, term7866.getClass(), "spriteColor", "BndsHwAFMv");
        setField(term7866, term7866.getClass(), "planeColor", "GzFkzHGYFt");
        setField(term7866, term7866.getClass(), "bothColor", "tShwQLRGNe");
        setBooleanField(term7866, term7866.getClass(), "quirkShift", false);
        setBooleanField(term7866, term7866.getClass(), "quirkJump", false);
        setBooleanField(term7866, term7866.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7866, term7866.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBgColor", argTypes, term7866, args);
    }

};


