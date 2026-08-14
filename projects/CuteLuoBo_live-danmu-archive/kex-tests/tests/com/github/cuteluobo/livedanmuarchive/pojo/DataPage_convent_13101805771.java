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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class DataPage_convent_13101805771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37291;
     Object term37313;

    public DataPage_convent_13101805771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37295 = newInstance(Class.forName("java.lang.Object"));
        Object term37297 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term37292 = new LinkedList();
        ((LinkedList) term37292).add(term37295);
        ((LinkedList) term37292).add(term37297);
        ((LinkedList) term37292).add((Object)null);
        ((LinkedList) term37292).add((Object)null);
        ((LinkedList) term37292).add((Object)null);
        ((LinkedList) term37292).add((Object)null);
        Integer term37305 = new Integer(1134449235);
        Integer term37307 = new Integer(-883034806);
        Integer term37309 = new Integer(1585847225);
        Integer term37311 = new Integer(597278769);
        term37291 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage"));
        setField(term37291, term37291.getClass(), "data", term37292);
        setField(term37291, term37291.getClass(), "current", term37305);
        setField(term37291, term37291.getClass(), "pageSize", term37307);
        setField(term37291, term37291.getClass(), "total", term37309);
        setField(term37291, term37291.getClass(), "maxPageNum", term37311);
        Object term37316 = newInstance(Class.forName("java.lang.Object"));
        Object term37318 = newInstance(Class.forName("java.lang.Object"));
        Object term37320 = newInstance(Class.forName("java.lang.Object"));
        term37313 = new LinkedList();
        ((LinkedList) term37313).add(term37316);
        ((LinkedList) term37313).add(term37318);
        ((LinkedList) term37313).add(term37320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DataPage");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term37291;
        args[1] = term37313;
        callMethod(klass, "convent", argTypes, null, args);
    }

};


