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

public class Configs_isSpriteExtracting_18485350534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7236;

    public Configs_isSpriteExtracting_18485350534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7236 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7236, term7236.getClass(), "printToConsole", false);
        setBooleanField(term7236, term7236.getClass(), "disableUiUpdates", true);
        setField(term7236, term7236.getClass(), "printSymbol", "#");
        setBooleanField(term7236, term7236.getClass(), "spriteExtracting", true);
        setBooleanField(term7236, term7236.getClass(), "roundPixels", true);
        setBooleanField(term7236, term7236.getClass(), "blur", true);
        setBooleanField(term7236, term7236.getClass(), "glow", false);
        setDoubleField(term7236, term7236.getClass(), "blurValue", 0.5187846213101265);
        setDoubleField(term7236, term7236.getClass(), "glowValue", 0.045893173090043815);
        setField(term7236, term7236.getClass(), "bgColor", "pCTimMblYc");
        setField(term7236, term7236.getClass(), "spriteColor", "hNxWaHcfhY");
        setField(term7236, term7236.getClass(), "planeColor", "RkybSrpybU");
        setField(term7236, term7236.getClass(), "bothColor", "xOEqzGAmDU");
        setBooleanField(term7236, term7236.getClass(), "quirkShift", false);
        setBooleanField(term7236, term7236.getClass(), "quirkJump", false);
        setBooleanField(term7236, term7236.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7236, term7236.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSpriteExtracting", argTypes, term7236, args);
    }

};


