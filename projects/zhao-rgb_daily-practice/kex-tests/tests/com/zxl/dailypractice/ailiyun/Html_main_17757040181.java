package com.zxl.dailypractice.ailiyun;

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
import static com.zxl.dailypractice.ailiyun.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Html_main_17757040181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;

    public Html_main_17757040181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327 = (Object[]) newArray("java.lang.String", 4);
        setElement(term327, 0, "oVcInYnLWB");
        setElement(term327, 1, "aJlieCFVtF");
        setElement(term327, 2, "ZiaGIbnzTs");
        setElement(term327, 3, "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Html");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term327;
        callMethod(klass, "main", argTypes, null, args);
    }

};


