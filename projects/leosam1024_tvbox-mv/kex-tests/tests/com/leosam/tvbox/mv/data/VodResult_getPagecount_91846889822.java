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

public class VodResult_getPagecount_91846889822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4741;

    public VodResult_getPagecount_91846889822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4741 = newInstance(Class.forName("com.leosam.tvbox.mv.data.VodResult"));
        setIntField(term4741, term4741.getClass(), "code", 0);
        setIntField(term4741, term4741.getClass(), "page", 0);
        setIntField(term4741, term4741.getClass(), "pagecount", 0);
        setIntField(term4741, term4741.getClass(), "limit", 0);
        setIntField(term4741, term4741.getClass(), "total", 0);
        setField(term4741, term4741.getClass(), "list", null);
        setField(term4741, term4741.getClass(), "vodClassList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.VodResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPagecount", argTypes, term4741, args);
    }

};


