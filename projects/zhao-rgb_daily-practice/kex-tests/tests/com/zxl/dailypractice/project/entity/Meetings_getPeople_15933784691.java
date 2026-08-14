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

public class Meetings_getPeople_15933784691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public Meetings_getPeople_15933784691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term95 = new Integer(1162663216);
        term94 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term133 = newInstance(Class.forName("java.util.Date"));
        setField(term94, term94.getClass(), "id", term95);
        setField(term94, term94.getClass(), "people", "jJCZpVmanW");
        setField(term94, term94.getClass(), "subject", "EGtDIRbSSb");
        setField(term94, term94.getClass(), "context", "SzjVpOQTyS");
        setLongField(term133, term133.getClass(), "fastTime", 1480438351369L);
        setField(term133, term133.getClass(), "cdate", null);
        setField(term94, term94.getClass(), "time", term133);
        setField(term94, term94.getClass(), "remark", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeople", argTypes, term94, args);
    }

};


