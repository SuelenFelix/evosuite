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

public class GetsubTaskListReq_setStep_119101732910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5622;

    public GetsubTaskListReq_setStep_119101732910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5622 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5622, term5622.getClass(), "taskid", "QZBHZqZope");
        setField(term5622, term5622.getClass(), "accessnum", "VBUahCvyxC");
        setField(term5622, term5622.getClass(), "executestatus", "MlzTkzKMCX");
        setField(term5622, term5622.getClass(), "step", "UqKUbMyPMJ");
        setIntField(term5622, term5622.getClass(), "pageNum", 1622346318);
        setIntField(term5622, term5622.getClass(), "pageSize", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QpYltHAdyY";
        callMethod(klass, "setStep", argTypes, term5622, args);
    }

};


