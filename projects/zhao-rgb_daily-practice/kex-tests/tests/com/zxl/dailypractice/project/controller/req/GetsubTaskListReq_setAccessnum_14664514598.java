package com.zxl.dailypractice.project.controller.req;

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
import static com.zxl.dailypractice.project.controller.req.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetsubTaskListReq_setAccessnum_14664514598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5396;

    public GetsubTaskListReq_setAccessnum_14664514598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5396 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5396, term5396.getClass(), "taskid", "bEmHScVZaQ");
        setField(term5396, term5396.getClass(), "accessnum", "TcuXODkzBV");
        setField(term5396, term5396.getClass(), "executestatus", "coJPjrBZNe");
        setField(term5396, term5396.getClass(), "step", "vMsWjuPTnO");
        setIntField(term5396, term5396.getClass(), "pageNum", 1585847225);
        setIntField(term5396, term5396.getClass(), "pageSize", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zHvfKaOstO";
        callMethod(klass, "setAccessnum", argTypes, term5396, args);
    }

};


