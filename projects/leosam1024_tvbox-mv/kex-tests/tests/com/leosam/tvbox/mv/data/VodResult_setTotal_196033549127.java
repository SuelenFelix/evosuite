package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class VodResult_setTotal_196033549127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4775;
     Object term4781;

    public VodResult_setTotal_196033549127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4775 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4775, term4775.getClass(), "code", 0);
        setIntField(term4775, term4775.getClass(), "page", 0);
        setIntField(term4775, term4775.getClass(), "pagecount", 0);
        setIntField(term4775, term4775.getClass(), "limit", 0);
        setIntField(term4775, term4775.getClass(), "total", 0);
        setField(term4775, term4775.getClass(), "list", null);
        setField(term4775, term4775.getClass(), "vodClassList", null);
        term4781 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4781;
        callMethod(klass, "setTotal", argTypes, term4775, args);
    }

};


