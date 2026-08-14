package com.github.cuteluobo.livedanmuarchive.pojo.danmusender;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.danmusender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BiliProcessedPartVideoData_init_202770632517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772;
     Object term774;
     Object term776;
     Object term778;

    public BiliProcessedPartVideoData_init_202770632517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772 = new Long(0L);
        term774 = new Long(0L);
        term776 = new Long(0L);
        term778 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = term772;
        args[1] = term774;
        args[2] = null;
        args[3] = term776;
        args[4] = term778;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


