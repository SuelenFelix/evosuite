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

public class Configs_isRoundPixels_1367123025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7341;

    public Configs_isRoundPixels_1367123025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7341 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7341, term7341.getClass(), "printToConsole", false);
        setBooleanField(term7341, term7341.getClass(), "disableUiUpdates", false);
        setField(term7341, term7341.getClass(), "printSymbol", "#");
        setBooleanField(term7341, term7341.getClass(), "spriteExtracting", false);
        setBooleanField(term7341, term7341.getClass(), "roundPixels", true);
        setBooleanField(term7341, term7341.getClass(), "blur", true);
        setBooleanField(term7341, term7341.getClass(), "glow", false);
        setDoubleField(term7341, term7341.getClass(), "blurValue", 0.3626177854778667);
        setDoubleField(term7341, term7341.getClass(), "glowValue", 0.3163771663728089);
        setField(term7341, term7341.getClass(), "bgColor", "eZFUvlxvGV");
        setField(term7341, term7341.getClass(), "spriteColor", "BYqFIqCKAV");
        setField(term7341, term7341.getClass(), "planeColor", "vrQLuWIDJX");
        setField(term7341, term7341.getClass(), "bothColor", "flxyYxBRtu");
        setBooleanField(term7341, term7341.getClass(), "quirkShift", true);
        setBooleanField(term7341, term7341.getClass(), "quirkJump", false);
        setBooleanField(term7341, term7341.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7341, term7341.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRoundPixels", argTypes, term7341, args);
    }

};


