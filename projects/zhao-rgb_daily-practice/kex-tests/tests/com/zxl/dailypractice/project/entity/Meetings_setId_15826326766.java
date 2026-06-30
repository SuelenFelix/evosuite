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

public class Meetings_setId_15826326766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;
     Object term612;

    public Meetings_setId_15826326766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term560 = new Integer(-1955890973);
        term559 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term598 = newInstance(Class.forName("java.util.Date"));
        setField(term559, term559.getClass(), "id", term560);
        setField(term559, term559.getClass(), "people", "BYqFIqCKAV");
        setField(term559, term559.getClass(), "subject", "vrQLuWIDJX");
        setField(term559, term559.getClass(), "context", "flxyYxBRtu");
        setLongField(term598, term598.getClass(), "fastTime", 1429023851389L);
        setField(term598, term598.getClass(), "cdate", null);
        setField(term559, term559.getClass(), "time", term598);
        setField(term559, term559.getClass(), "remark", "OclPbYPkcH");
        term612 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term612;
        callMethod(klass, "setId", argTypes, term559, args);
    }

};


