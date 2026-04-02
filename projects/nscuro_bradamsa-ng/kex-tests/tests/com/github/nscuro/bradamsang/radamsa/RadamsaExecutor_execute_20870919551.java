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
import java.util.ArrayList;

public class RadamsaExecutor_execute_20870919551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term36;

    public RadamsaExecutor_execute_20870919551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaExecutor"));
        setField(term23, term23.getClass(), "commandExecutor", null);
        setField(term23, term23.getClass(), "executablePath", "sjlJAEtRrb");
        ArrayList term43 = new ArrayList();
        ((ArrayList) term43).add("MuLcgQHgqz");
        ((ArrayList) term43).add("xxtlPwDYFs");
        ((ArrayList) term43).add("jJCZpVmanW");
        ((ArrayList) term43).add("EGtDIRbSSb");
        term36 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions"));
        byte[] term37 = (byte[]) newByteArray(5);
        setByteElement(term37, 0, (byte) 47);
        setByteElement(term37, 1, (byte) 48);
        setByteElement(term37, 2, (byte) 89);
        setByteElement(term37, 3, (byte) 75);
        setByteElement(term37, 4, (byte) 18);
        setField(term36, term36.getClass(), "sample", term37);
        setField(term36, term36.getClass(), "samplePaths", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaExecutor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Object[] args = new Object[1];
        args[0] = term36;
        callMethod(klass, "execute", argTypes, term23, args);
    }

};


