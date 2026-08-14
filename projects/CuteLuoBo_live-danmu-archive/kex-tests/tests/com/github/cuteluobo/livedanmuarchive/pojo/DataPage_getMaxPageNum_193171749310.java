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

public class DataPage_getMaxPageNum_193171749310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37441;

    public DataPage_getMaxPageNum_193171749310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37442 = new ArrayList();
        Integer term37446 = new Integer(454281060);
        Integer term37448 = new Integer(-1786399638);
        Integer term37450 = new Integer(2055867847);
        Integer term37452 = new Integer(-1048298087);
        term37441 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37441, term37441.getClass(), "data", term37442);
        setField(term37441, term37441.getClass(), "current", term37446);
        setField(term37441, term37441.getClass(), "pageSize", term37448);
        setField(term37441, term37441.getClass(), "total", term37450);
        setField(term37441, term37441.getClass(), "maxPageNum", term37452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxPageNum", argTypes, term37441, args);
    }

};


