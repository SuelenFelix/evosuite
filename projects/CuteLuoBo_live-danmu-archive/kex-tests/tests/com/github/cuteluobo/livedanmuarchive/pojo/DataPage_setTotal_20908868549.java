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

public class DataPage_setTotal_20908868549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37426;
     Object term37439;

    public DataPage_setTotal_20908868549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37427 = new ArrayList();
        Integer term37431 = new Integer(-1016503459);
        Integer term37433 = new Integer(-1968847291);
        Integer term37435 = new Integer(579005622);
        Integer term37437 = new Integer(-14890619);
        term37426 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37426, term37426.getClass(), "data", term37427);
        setField(term37426, term37426.getClass(), "current", term37431);
        setField(term37426, term37426.getClass(), "pageSize", term37433);
        setField(term37426, term37426.getClass(), "total", term37435);
        setField(term37426, term37426.getClass(), "maxPageNum", term37437);
        term37439 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term37439;
        callMethod(klass, "setTotal", argTypes, term37426, args);
    }

};


