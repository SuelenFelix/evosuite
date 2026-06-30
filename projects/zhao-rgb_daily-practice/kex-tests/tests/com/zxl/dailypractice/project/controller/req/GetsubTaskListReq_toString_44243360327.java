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

public class GetsubTaskListReq_toString_44243360327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6052;

    public GetsubTaskListReq_toString_44243360327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6052 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term6052, term6052.getClass(), "taskid", null);
        setField(term6052, term6052.getClass(), "accessnum", null);
        setField(term6052, term6052.getClass(), "executestatus", null);
        setField(term6052, term6052.getClass(), "step", null);
        setIntField(term6052, term6052.getClass(), "pageNum", 0);
        setIntField(term6052, term6052.getClass(), "pageSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6052, args);
    }

};


