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

public class VodResult_setLimit_102272019825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4761;
     Object term4767;

    public VodResult_setLimit_102272019825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4761 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4761, term4761.getClass(), "code", 0);
        setIntField(term4761, term4761.getClass(), "page", 0);
        setIntField(term4761, term4761.getClass(), "pagecount", 0);
        setIntField(term4761, term4761.getClass(), "limit", 0);
        setIntField(term4761, term4761.getClass(), "total", 0);
        setField(term4761, term4761.getClass(), "list", null);
        setField(term4761, term4761.getClass(), "vodClassList", null);
        term4767 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4767;
        callMethod(klass, "setLimit", argTypes, term4761, args);
    }

};


