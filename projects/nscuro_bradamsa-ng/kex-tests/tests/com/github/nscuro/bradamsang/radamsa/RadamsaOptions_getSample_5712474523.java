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

public class RadamsaOptions_getSample_5712474523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public RadamsaOptions_getSample_5712474523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term209 = new ArrayList();
        ((ArrayList) term209).add("MjGYSRKTNF");
        ((ArrayList) term209).add("hRNSzYYIrc");
        term201 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions"));
        byte[] term202 = (byte[]) newByteArray(6);
        setByteElement(term202, 0, (byte) 74);
        setByteElement(term202, 1, (byte) -71);
        setByteElement(term202, 2, (byte) 49);
        setByteElement(term202, 3, (byte) -54);
        setByteElement(term202, 4, (byte) 67);
        setByteElement(term202, 5, (byte) 78);
        setField(term201, term201.getClass(), "sample", term202);
        setField(term201, term201.getClass(), "samplePaths", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSample", argTypes, term201, args);
    }

};


