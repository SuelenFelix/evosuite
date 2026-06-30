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
import java.lang.Integer;

public class StuResp_getSeq_20006491476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public StuResp_getSeq_20006491476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term992 = new Integer(597278769);
        term979 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp"));
        setField(term979, term979.getClass(), "taskid", "gGSMzuGICf");
        setField(term979, term979.getClass(), "seq", term992);
        setField(term979, term979.getClass(), "originalFileName", "hxCBltsObl");
        setField(term979, term979.getClass(), "fileDownloadUrl", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.StuResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeq", argTypes, term979, args);
    }

};


