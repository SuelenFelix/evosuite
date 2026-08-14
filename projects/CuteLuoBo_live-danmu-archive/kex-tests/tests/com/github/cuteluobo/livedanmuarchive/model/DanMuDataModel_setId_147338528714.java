package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModel_setId_147338528714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5993;
     Object term6028;

    public DanMuDataModel_setId_147338528714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5994 = new Long(-5258945362776941718L);
        Integer term5996 = new Integer(-1347358701);
        Integer term6010 = new Integer(806595993);
        Integer term6012 = new Integer(548228925);
        Long term6014 = new Long(24067105862153728L);
        term5993 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5993, term5993.getClass(), "id", term5994);
        setField(term5993, term5993.getClass(), "userId", term5996);
        setField(term5993, term5993.getClass(), "data", "kGMQdqJYyB");
        setField(term5993, term5993.getClass(), "format", term6010);
        setField(term5993, term5993.getClass(), "type", term6012);
        setField(term5993, term5993.getClass(), "createTime", term6014);
        setField(term5993, term5993.getClass(), "createTimeText", "XJJNClzHRf");
        term6028 = new Long(-8477368071089201577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6028;
        callMethod(klass, "setId", argTypes, term5993, args);
    }

};


