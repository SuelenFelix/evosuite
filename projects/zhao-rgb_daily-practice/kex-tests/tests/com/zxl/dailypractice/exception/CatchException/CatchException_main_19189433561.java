package com.zxl.dailypractice.exception.CatchException;

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
import static com.zxl.dailypractice.exception.CatchException.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CatchException_main_19189433561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public CatchException_main_19189433561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = (Object[]) newArray("java.lang.String", 4);
        setElement(term295, 0, "LQFpaHEwXR");
        setElement(term295, 1, "oVcInYnLWB");
        setElement(term295, 2, "aJlieCFVtF");
        setElement(term295, 3, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.exception.CatchException.CatchException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term295;
        callMethod(klass, "main", argTypes, null, args);
    }

};


