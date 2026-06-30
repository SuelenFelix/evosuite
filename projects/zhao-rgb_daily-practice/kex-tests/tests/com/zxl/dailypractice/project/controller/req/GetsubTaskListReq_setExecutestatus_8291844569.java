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

public class GetsubTaskListReq_setExecutestatus_8291844569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5509;

    public GetsubTaskListReq_setExecutestatus_8291844569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5509 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5509, term5509.getClass(), "taskid", "tOszriqETr");
        setField(term5509, term5509.getClass(), "accessnum", "ncSPTkhKjO");
        setField(term5509, term5509.getClass(), "executestatus", "jcWKHRWhyj");
        setField(term5509, term5509.getClass(), "step", "nrQjODRMLD");
        setIntField(term5509, term5509.getClass(), "pageNum", -1685132342);
        setIntField(term5509, term5509.getClass(), "pageSize", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PNoWXrsFic";
        callMethod(klass, "setExecutestatus", argTypes, term5509, args);
    }

};


