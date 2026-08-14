package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class DynamicVideoData_setOffsetId_1762502645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17254;
     Object term17260;

    public DynamicVideoData_setOffsetId_1762502645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17255 = new ArrayList();
        term17254 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.DynamicVideoData"));
        setField(term17254, term17254.getClass(), "videoList", term17255);
        setLongField(term17254, term17254.getClass(), "offsetId", 2287449183416662404L);
        term17260 = new Long(-1223573843683081410L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.DynamicVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17260;
        callMethod(klass, "setOffsetId", argTypes, term17254, args);
    }

};


