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

public class GetsubTaskListReq_getExecutestatus_20253428403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4919;

    public GetsubTaskListReq_getExecutestatus_20253428403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4919 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term4919, term4919.getClass(), "taskid", "vqnBkkxoIa");
        setField(term4919, term4919.getClass(), "accessnum", "bycpZjxXFn");
        setField(term4919, term4919.getClass(), "executestatus", "jQWttOAiwL");
        setField(term4919, term4919.getClass(), "step", "DzKFxEuEEC");
        setIntField(term4919, term4919.getClass(), "pageNum", -1922583790);
        setIntField(term4919, term4919.getClass(), "pageSize", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExecutestatus", argTypes, term4919, args);
    }

};


