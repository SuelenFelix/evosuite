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

public class IntruderAttackOptions_getPayloadCount_3009430119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;

    public IntruderAttackOptions_getPayloadCount_3009430119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640 = newInstance(Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions"));
        setIntField(term640, term640.getClass(), "payloadCount", 0);
        setField(term640, term640.getClass(), "samplePaths", null);
        setBooleanField(term640, term640.getClass(), "wslModeEnabled", false);
        setField(term640, term640.getClass(), "wslDistributionName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayloadCount", argTypes, term640, args);
    }

};


