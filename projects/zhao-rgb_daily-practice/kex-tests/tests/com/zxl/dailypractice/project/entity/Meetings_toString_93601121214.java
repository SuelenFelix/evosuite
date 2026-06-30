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

public class Meetings_toString_93601121214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public Meetings_toString_93601121214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1302 = new Integer(1585847225);
        term1301 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term1340 = newInstance(Class.forName("java.util.Date"));
        setField(term1301, term1301.getClass(), "id", term1302);
        setField(term1301, term1301.getClass(), "people", "ffYhPOzlUs");
        setField(term1301, term1301.getClass(), "subject", "MLqYREekMl");
        setField(term1301, term1301.getClass(), "context", "ytSBIKXogI");
        setLongField(term1340, term1340.getClass(), "fastTime", 1706078172457L);
        setField(term1340, term1340.getClass(), "cdate", null);
        setField(term1301, term1301.getClass(), "time", term1340);
        setField(term1301, term1301.getClass(), "remark", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1301, args);
    }

};


