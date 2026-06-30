package com.zxl.dailypractice.card.two.october.october10;

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
import static com.zxl.dailypractice.card.two.october.october10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StuResp_getFileDownloadUrl_31187128418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;

    public StuResp_getFileDownloadUrl_31187128418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1262 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp"));
        setField(term1262, term1262.getClass(), "taskid", null);
        setField(term1262, term1262.getClass(), "seq", null);
        setField(term1262, term1262.getClass(), "originalFileName", null);
        setField(term1262, term1262.getClass(), "fileDownloadUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileDownloadUrl", argTypes, term1262, args);
    }

};


