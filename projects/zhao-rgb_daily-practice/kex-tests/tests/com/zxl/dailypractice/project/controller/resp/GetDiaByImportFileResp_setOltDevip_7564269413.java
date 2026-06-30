package com.zxl.dailypractice.project.controller.resp;

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
import static com.zxl.dailypractice.project.controller.resp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetDiaByImportFileResp_setOltDevip_7564269413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public GetDiaByImportFileResp_setOltDevip_7564269413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.resp.GetDiaByImportFileResp"));
        setField(term91, term91.getClass(), "oltDevip", "jJCZpVmanW");
        setField(term91, term91.getClass(), "subresid", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.resp.GetDiaByImportFileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setOltDevip", argTypes, term91, args);
    }

};


