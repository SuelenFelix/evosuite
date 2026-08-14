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

public class DataPage_convent_131018057713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37469;

    public DataPage_convent_131018057713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37469 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37469, term37469.getClass(), "data", null);
        setField(term37469, term37469.getClass(), "current", null);
        setField(term37469, term37469.getClass(), "pageSize", null);
        setField(term37469, term37469.getClass(), "total", null);
        setField(term37469, term37469.getClass(), "maxPageNum", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "convent", argTypes, term37469, args);
    }

};


