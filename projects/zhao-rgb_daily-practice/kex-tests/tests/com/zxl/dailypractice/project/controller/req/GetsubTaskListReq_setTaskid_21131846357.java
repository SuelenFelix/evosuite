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

public class GetsubTaskListReq_setTaskid_21131846357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5283;

    public GetsubTaskListReq_setTaskid_21131846357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5283 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5283, term5283.getClass(), "taskid", "NWldOLAbqk");
        setField(term5283, term5283.getClass(), "accessnum", "qnYaYSpDwO");
        setField(term5283, term5283.getClass(), "executestatus", "dgbFDCdHtj");
        setField(term5283, term5283.getClass(), "step", "EKpdCBubDE");
        setIntField(term5283, term5283.getClass(), "pageNum", 1134449235);
        setIntField(term5283, term5283.getClass(), "pageSize", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zMsSLTfGhl";
        callMethod(klass, "setTaskid", argTypes, term5283, args);
    }

};


