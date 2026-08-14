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

public class Configs_setPrintToConsole_77795058818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8706;
     Object term8770;

    public Configs_setPrintToConsole_77795058818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8706 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8706, term8706.getClass(), "printToConsole", true);
        setBooleanField(term8706, term8706.getClass(), "disableUiUpdates", true);
        setField(term8706, term8706.getClass(), "printSymbol", "#");
        setBooleanField(term8706, term8706.getClass(), "spriteExtracting", false);
        setBooleanField(term8706, term8706.getClass(), "roundPixels", true);
        setBooleanField(term8706, term8706.getClass(), "blur", false);
        setBooleanField(term8706, term8706.getClass(), "glow", true);
        setDoubleField(term8706, term8706.getClass(), "blurValue", 0.7618164754425794);
        setDoubleField(term8706, term8706.getClass(), "glowValue", 0.7385589312559342);
        setField(term8706, term8706.getClass(), "bgColor", "MAcUBcBckh");
        setField(term8706, term8706.getClass(), "spriteColor", "oVgzLbrsFr");
        setField(term8706, term8706.getClass(), "planeColor", "vQVyKLdtaz");
        setField(term8706, term8706.getClass(), "bothColor", "OWKQODBLzb");
        setBooleanField(term8706, term8706.getClass(), "quirkShift", true);
        setBooleanField(term8706, term8706.getClass(), "quirkJump", true);
        setBooleanField(term8706, term8706.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term8706, term8706.getClass(), "quirkOrder", true);
        term8770 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8770;
        callMethod(klass, "setPrintToConsole", argTypes, term8706, args);
    }

};


