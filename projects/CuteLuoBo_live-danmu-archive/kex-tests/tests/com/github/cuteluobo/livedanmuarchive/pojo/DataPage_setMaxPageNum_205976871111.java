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

public class DataPage_setMaxPageNum_205976871111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37454;
     Object term37467;

    public DataPage_setMaxPageNum_205976871111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37455 = new ArrayList();
        Integer term37459 = new Integer(292681826);
        Integer term37461 = new Integer(458147407);
        Integer term37463 = new Integer(-184153539);
        Integer term37465 = new Integer(493620644);
        term37454 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37454, term37454.getClass(), "data", term37455);
        setField(term37454, term37454.getClass(), "current", term37459);
        setField(term37454, term37454.getClass(), "pageSize", term37461);
        setField(term37454, term37454.getClass(), "total", term37463);
        setField(term37454, term37454.getClass(), "maxPageNum", term37465);
        term37467 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term37467;
        callMethod(klass, "setMaxPageNum", argTypes, term37454, args);
    }

};


