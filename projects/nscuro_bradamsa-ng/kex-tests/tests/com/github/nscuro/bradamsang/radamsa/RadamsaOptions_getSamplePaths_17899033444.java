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

public class RadamsaOptions_getSamplePaths_17899033444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public RadamsaOptions_getSamplePaths_17899033444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term271 = new ArrayList();
        ((ArrayList) term271).add("RMFIsYGgne");
        ((ArrayList) term271).add("NRdvgJlhkX");
        ((ArrayList) term271).add("uuaPigETmJ");
        ((ArrayList) term271).add("MxlszYVzRf");
        ((ArrayList) term271).add("LQFpaHEwXR");
        ((ArrayList) term271).add("oVcInYnLWB");
        ((ArrayList) term271).add("aJlieCFVtF");
        term263 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions"));
        byte[] term264 = (byte[]) newByteArray(6);
        setByteElement(term264, 0, (byte) 87);
        setByteElement(term264, 1, (byte) 121);
        setByteElement(term264, 2, (byte) -99);
        setByteElement(term264, 3, (byte) -2);
        setByteElement(term264, 4, (byte) -16);
        setByteElement(term264, 5, (byte) -112);
        setField(term263, term263.getClass(), "sample", term264);
        setField(term263, term263.getClass(), "samplePaths", term271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSamplePaths", argTypes, term263, args);
    }

};


