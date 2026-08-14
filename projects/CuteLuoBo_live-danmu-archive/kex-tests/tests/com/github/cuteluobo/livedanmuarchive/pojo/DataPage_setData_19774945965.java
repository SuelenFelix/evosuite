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
import java.util.LinkedList;
import java.lang.Object;

public class DataPage_setData_19774945965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37363;
     Object term37376;

    public DataPage_setData_19774945965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37364 = new ArrayList();
        Integer term37368 = new Integer(-244121226);
        Integer term37370 = new Integer(-203030934);
        Integer term37372 = new Integer(-1179120542);
        Integer term37374 = new Integer(-73683645);
        term37363 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37363, term37363.getClass(), "data", term37364);
        setField(term37363, term37363.getClass(), "current", term37368);
        setField(term37363, term37363.getClass(), "pageSize", term37370);
        setField(term37363, term37363.getClass(), "total", term37372);
        setField(term37363, term37363.getClass(), "maxPageNum", term37374);
        Object term37379 = newInstance(Class.forName("java.lang.Object"));
        Object term37381 = newInstance(Class.forName("java.lang.Object"));
        Object term37383 = newInstance(Class.forName("java.lang.Object"));
        term37376 = new LinkedList();
        ((LinkedList) term37376).add(term37379);
        ((LinkedList) term37376).add(term37381);
        ((LinkedList) term37376).add(term37383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term37376;
        callMethod(klass, "setData", argTypes, term37363, args);
    }

};


