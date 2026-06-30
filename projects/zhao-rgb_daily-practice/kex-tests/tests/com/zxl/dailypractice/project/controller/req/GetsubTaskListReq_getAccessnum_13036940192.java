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

public class GetsubTaskListReq_getAccessnum_13036940192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4828;

    public GetsubTaskListReq_getAccessnum_13036940192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4828 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term4828, term4828.getClass(), "taskid", "LrqwfrKKtS");
        setField(term4828, term4828.getClass(), "accessnum", "ZUdnQXfzCI");
        setField(term4828, term4828.getClass(), "executestatus", "EULDrUNQvw");
        setField(term4828, term4828.getClass(), "step", "BtvAvsJSei");
        setIntField(term4828, term4828.getClass(), "pageNum", 1484323161);
        setIntField(term4828, term4828.getClass(), "pageSize", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessnum", argTypes, term4828, args);
    }

};


