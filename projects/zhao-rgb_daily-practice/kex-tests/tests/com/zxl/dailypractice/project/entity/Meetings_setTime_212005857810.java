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

public class Meetings_setTime_212005857810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;
     Object term1052;

    public Meetings_setTime_212005857810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1000 = new Integer(-522618178);
        term999 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term1038 = newInstance(Class.forName("java.util.Date"));
        setField(term999, term999.getClass(), "id", term1000);
        setField(term999, term999.getClass(), "people", "hxCBltsObl");
        setField(term999, term999.getClass(), "subject", "BndsHwAFMv");
        setField(term999, term999.getClass(), "context", "GzFkzHGYFt");
        setLongField(term1038, term1038.getClass(), "fastTime", 1797203628025L);
        setField(term1038, term1038.getClass(), "cdate", null);
        setField(term999, term999.getClass(), "time", term1038);
        setField(term999, term999.getClass(), "remark", "tShwQLRGNe");
        term1052 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1052, term1052.getClass(), "fastTime", 1589457921030L);
        setField(term1052, term1052.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1052;
        callMethod(klass, "setTime", argTypes, term999, args);
    }

};


