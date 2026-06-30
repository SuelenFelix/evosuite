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

public class GetsubTaskListReq_setExecutestatus_82918445623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6036;

    public GetsubTaskListReq_setExecutestatus_82918445623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6036 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term6036, term6036.getClass(), "taskid", null);
        setField(term6036, term6036.getClass(), "accessnum", null);
        setField(term6036, term6036.getClass(), "executestatus", null);
        setField(term6036, term6036.getClass(), "step", null);
        setIntField(term6036, term6036.getClass(), "pageNum", 0);
        setIntField(term6036, term6036.getClass(), "pageSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExecutestatus", argTypes, term6036, args);
    }

};


