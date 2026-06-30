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

public class GetsubTaskListReq_setPageNum_113312630711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5735;
     Object term5786;

    public GetsubTaskListReq_setPageNum_113312630711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5735 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5735, term5735.getClass(), "taskid", "lbmSGBwIiV");
        setField(term5735, term5735.getClass(), "accessnum", "DAxyHoTLzZ");
        setField(term5735, term5735.getClass(), "executestatus", "fhZgTouhCC");
        setField(term5735, term5735.getClass(), "step", "wrikqJwXvL");
        setIntField(term5735, term5735.getClass(), "pageNum", -655067527);
        setIntField(term5735, term5735.getClass(), "pageSize", -6029667);
        term5786 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5786;
        callMethod(klass, "setPageNum", argTypes, term5735, args);
    }

};


