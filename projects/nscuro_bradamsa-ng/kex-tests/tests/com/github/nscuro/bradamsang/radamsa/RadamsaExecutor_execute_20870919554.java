package com.github.nscuro.bradamsang.radamsa;

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
import static com.github.nscuro.bradamsang.radamsa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RadamsaExecutor_execute_20870919554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public RadamsaExecutor_execute_20870919554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaExecutor"));
        setField(term173, term173.getClass(), "commandExecutor", null);
        setField(term173, term173.getClass(), "executablePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaExecutor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "execute", argTypes, term173, args);
    }

};


