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

public class DataPage_getCurrent_19398233336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37385;

    public DataPage_getCurrent_19398233336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37386 = new ArrayList();
        Integer term37390 = new Integer(-226514366);
        Integer term37392 = new Integer(1193880199);
        Integer term37394 = new Integer(-1087774327);
        Integer term37396 = new Integer(-1530420153);
        term37385 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37385, term37385.getClass(), "data", term37386);
        setField(term37385, term37385.getClass(), "current", term37390);
        setField(term37385, term37385.getClass(), "pageSize", term37392);
        setField(term37385, term37385.getClass(), "total", term37394);
        setField(term37385, term37385.getClass(), "maxPageNum", term37396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrent", argTypes, term37385, args);
    }

};


