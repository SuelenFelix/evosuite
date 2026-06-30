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

public class GetsubTaskListReq_getStep_5288592394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5010;

    public GetsubTaskListReq_getStep_5288592394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5010 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq"));
        setField(term5010, term5010.getClass(), "taskid", "CAMnvfDLJL");
        setField(term5010, term5010.getClass(), "accessnum", "mfHtgSbdjD");
        setField(term5010, term5010.getClass(), "executestatus", "cmuaUiHMVL");
        setField(term5010, term5010.getClass(), "step", "xjoSGPWUgu");
        setIntField(term5010, term5010.getClass(), "pageNum", -1955890973);
        setIntField(term5010, term5010.getClass(), "pageSize", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.GetsubTaskListReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStep", argTypes, term5010, args);
    }

};


