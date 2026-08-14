package com.zxl.dailypractice.project.entity;

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
import static com.zxl.dailypractice.project.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meetings_setContext_20668257679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;

    public Meetings_setContext_20668257679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term885 = new Integer(1725571209);
        term884 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term923 = newInstance(Class.forName("java.util.Date"));
        setField(term884, term884.getClass(), "id", term885);
        setField(term884, term884.getClass(), "people", "nyiiPDVjAc");
        setField(term884, term884.getClass(), "subject", "aKnKipADSo");
        setField(term884, term884.getClass(), "context", "wSQxaModmm");
        setLongField(term923, term923.getClass(), "fastTime", 1500721068023L);
        setField(term923, term923.getClass(), "cdate", null);
        setField(term884, term884.getClass(), "time", term923);
        setField(term884, term884.getClass(), "remark", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setContext", argTypes, term884, args);
    }

};


