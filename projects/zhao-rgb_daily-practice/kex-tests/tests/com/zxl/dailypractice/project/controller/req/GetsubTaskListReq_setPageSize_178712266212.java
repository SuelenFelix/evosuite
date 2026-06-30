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
import java.lang.Integer;

public class GetsubTaskListReq_setPageSize_178712266212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5828;
     Object term5879;

    public GetsubTaskListReq_setPageSize_178712266212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5828 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5828, term5828.getClass(), "taskid", "UiWhvbypdr");
        setField(term5828, term5828.getClass(), "accessnum", "CgleElJNje");
        setField(term5828, term5828.getClass(), "executestatus", "ZrchvNGMtd");
        setField(term5828, term5828.getClass(), "step", "WaEcyVlcIx");
        setIntField(term5828, term5828.getClass(), "pageNum", -117576464);
        setIntField(term5828, term5828.getClass(), "pageSize", -1007160944);
        term5879 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5879;
        callMethod(klass, "setPageSize", argTypes, term5828, args);
    }

};


