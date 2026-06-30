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

public class GetsubTaskListReq_getAccessnum_130369401916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6015;

    public GetsubTaskListReq_getAccessnum_130369401916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6015 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term6015, term6015.getClass(), "taskid", null);
        setField(term6015, term6015.getClass(), "accessnum", null);
        setField(term6015, term6015.getClass(), "executestatus", null);
        setField(term6015, term6015.getClass(), "step", null);
        setIntField(term6015, term6015.getClass(), "pageNum", 0);
        setIntField(term6015, term6015.getClass(), "pageSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessnum", argTypes, term6015, args);
    }

};


