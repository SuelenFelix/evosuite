package com.github.nscuro.bradamsang.intruder;

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
import static com.github.nscuro.bradamsang.intruder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class IntruderAttackOptions_toString_5839227176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;

    public IntruderAttackOptions_toString_5839227176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term606 = new ArrayList();
        term604 = newInstance(Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions"));
        setIntField(term604, term604.getClass(), "payloadCount", -616727354);
        setField(term604, term604.getClass(), "samplePaths", term606);
        setBooleanField(term604, term604.getClass(), "wslModeEnabled", true);
        setField(term604, term604.getClass(), "wslDistributionName", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term604, args);
    }

};


