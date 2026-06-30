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

public class Meetings_getTime_19365232444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public Meetings_getTime_19365232444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term374 = new Integer(-1922583790);
        term373 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term412 = newInstance(Class.forName("java.util.Date"));
        setField(term373, term373.getClass(), "id", term374);
        setField(term373, term373.getClass(), "people", "ZiaGIbnzTs");
        setField(term373, term373.getClass(), "subject", "tbcdzjIfER");
        setField(term373, term373.getClass(), "context", "HyxfbSQYBe");
        setLongField(term412, term412.getClass(), "fastTime", 1442639565302L);
        setField(term412, term412.getClass(), "cdate", null);
        setField(term373, term373.getClass(), "time", term412);
        setField(term373, term373.getClass(), "remark", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term373, args);
    }

};


