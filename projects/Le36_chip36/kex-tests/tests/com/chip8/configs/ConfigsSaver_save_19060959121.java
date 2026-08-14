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
import java.lang.Double;

public class ConfigsSaver_save_19060959121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11732;
     Object term11733;
     Object term11747;
     Object term11749;
     Object term11751;
     Object term11753;
     Object term11755;
     Object term11757;

    public ConfigsSaver_save_19060959121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11732 = newInstance(Class.forName("com.chip8.configs.ConfigsSaver"));
        term11733 = new Boolean(false);
        term11747 = new Boolean(false);
        term11749 = new Boolean(false);
        term11751 = new Boolean(true);
        term11753 = new Boolean(true);
        term11755 = new Double(0.06480976831423468);
        term11757 = new Double(0.8490790645379176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.ConfigsSaver");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = term11733;
        args[1] = "sQvGcVjdEx";
        args[2] = term11747;
        args[3] = term11749;
        args[4] = term11751;
        args[5] = term11753;
        args[6] = term11755;
        args[7] = term11757;
        callMethod(klass, "save", argTypes, term11732, args);
    }

};


