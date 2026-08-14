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

public class ConfigsSaver_save_19060959126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11816;
     Object term11817;
     Object term11819;
     Object term11821;
     Object term11823;
     Object term11825;
     Object term11827;
     Object term11829;

    public ConfigsSaver_save_19060959126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11816 = newInstance(Class.forName("com.chip8.configs.ConfigsSaver"));
        term11817 = new Boolean(false);
        term11819 = new Boolean(false);
        term11821 = new Boolean(false);
        term11823 = new Boolean(false);
        term11825 = new Boolean(false);
        term11827 = new Double(0.0);
        term11829 = new Double(0.0);
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
        args[0] = term11817;
        args[1] = null;
        args[2] = term11819;
        args[3] = term11821;
        args[4] = term11823;
        args[5] = term11825;
        args[6] = term11827;
        args[7] = term11829;
        callMethod(klass, "save", argTypes, term11816, args);
    }

};


