package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class DataPage_getData_21265573664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37350;

    public DataPage_getData_21265573664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37351 = new ArrayList();
        Integer term37355 = new Integer(1135664017);
        Integer term37357 = new Integer(590364439);
        Integer term37359 = new Integer(865208305);
        Integer term37361 = new Integer(-1275173084);
        term37350 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37350, term37350.getClass(), "data", term37351);
        setField(term37350, term37350.getClass(), "current", term37355);
        setField(term37350, term37350.getClass(), "pageSize", term37357);
        setField(term37350, term37350.getClass(), "total", term37359);
        setField(term37350, term37350.getClass(), "maxPageNum", term37361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term37350, args);
    }

};


