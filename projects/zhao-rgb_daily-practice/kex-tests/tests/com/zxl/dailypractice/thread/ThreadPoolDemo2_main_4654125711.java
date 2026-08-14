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

public class ThreadPoolDemo2_main_4654125711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390;

    public ThreadPoolDemo2_main_4654125711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390 = (Object[]) newArray("java.lang.String", 6);
        setElement(term390, 0, "tbcdzjIfER");
        setElement(term390, 1, "HyxfbSQYBe");
        setElement(term390, 2, "pCTimMblYc");
        setElement(term390, 3, "hNxWaHcfhY");
        setElement(term390, 4, "RkybSrpybU");
        setElement(term390, 5, "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.thread.ThreadPoolDemo2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term390;
        callMethod(klass, "main", argTypes, null, args);
    }

};


