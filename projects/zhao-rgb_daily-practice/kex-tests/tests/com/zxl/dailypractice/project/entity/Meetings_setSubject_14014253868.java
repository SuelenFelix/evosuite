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

public class Meetings_setSubject_14014253868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;

    public Meetings_setSubject_14014253868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term770 = new Integer(-1339778481);
        term769 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term808 = newInstance(Class.forName("java.util.Date"));
        setField(term769, term769.getClass(), "id", term770);
        setField(term769, term769.getClass(), "people", "SbAoxhfrkn");
        setField(term769, term769.getClass(), "subject", "kuTXqwMtDB");
        setField(term769, term769.getClass(), "context", "Ghbwtircqb");
        setLongField(term808, term808.getClass(), "fastTime", 1645834034896L);
        setField(term808, term808.getClass(), "cdate", null);
        setField(term769, term769.getClass(), "time", term808);
        setField(term769, term769.getClass(), "remark", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setSubject", argTypes, term769, args);
    }

};


