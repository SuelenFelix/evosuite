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

public class DataPage_getPageSize_20236755122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37322;

    public DataPage_getPageSize_20236755122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37323 = new ArrayList();
        Integer term37327 = new Integer(-1685132342);
        Integer term37329 = new Integer(-1456670397);
        Integer term37331 = new Integer(1622346318);
        Integer term37333 = new Integer(1048535127);
        term37322 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37322, term37322.getClass(), "data", term37323);
        setField(term37322, term37322.getClass(), "current", term37327);
        setField(term37322, term37322.getClass(), "pageSize", term37329);
        setField(term37322, term37322.getClass(), "total", term37331);
        setField(term37322, term37322.getClass(), "maxPageNum", term37333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term37322, args);
    }

};


