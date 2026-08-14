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

public class DataPage_getTotal_11928853608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37413;

    public DataPage_getTotal_11928853608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37414 = new ArrayList();
        Integer term37418 = new Integer(-602026508);
        Integer term37420 = new Integer(-157887805);
        Integer term37422 = new Integer(1876565163);
        Integer term37424 = new Integer(-817164822);
        term37413 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37413, term37413.getClass(), "data", term37414);
        setField(term37413, term37413.getClass(), "current", term37418);
        setField(term37413, term37413.getClass(), "pageSize", term37420);
        setField(term37413, term37413.getClass(), "total", term37422);
        setField(term37413, term37413.getClass(), "maxPageNum", term37424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotal", argTypes, term37413, args);
    }

};


