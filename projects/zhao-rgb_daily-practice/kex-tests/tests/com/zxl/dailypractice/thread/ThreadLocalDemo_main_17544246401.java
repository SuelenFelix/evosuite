package com.zxl.dailypractice.thread;

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
import static com.zxl.dailypractice.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ThreadLocalDemo_main_17544246401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public ThreadLocalDemo_main_17544246401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273 = (Object[]) newArray("java.lang.String", 4);
        setElement(term273, 0, "MxlszYVzRf");
        setElement(term273, 1, "LQFpaHEwXR");
        setElement(term273, 2, "oVcInYnLWB");
        setElement(term273, 3, "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.thread.ThreadLocalDemo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term273;
        callMethod(klass, "main", argTypes, null, args);
    }

};


