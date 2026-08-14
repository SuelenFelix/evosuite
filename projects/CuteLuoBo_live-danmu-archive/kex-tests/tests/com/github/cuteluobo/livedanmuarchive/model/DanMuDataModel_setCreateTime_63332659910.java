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

public class DanMuDataModel_setCreateTime_63332659910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5749;
     Object term5784;

    public DanMuDataModel_setCreateTime_63332659910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5750 = new Long(-5242567610844514867L);
        Integer term5752 = new Integer(1152356969);
        Integer term5766 = new Integer(-1667990367);
        Integer term5768 = new Integer(-1214628358);
        Long term5770 = new Long(-2951854704066477061L);
        term5749 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5749, term5749.getClass(), "id", term5750);
        setField(term5749, term5749.getClass(), "userId", term5752);
        setField(term5749, term5749.getClass(), "data", "kNqaJKIATy");
        setField(term5749, term5749.getClass(), "format", term5766);
        setField(term5749, term5749.getClass(), "type", term5768);
        setField(term5749, term5749.getClass(), "createTime", term5770);
        setField(term5749, term5749.getClass(), "createTimeText", "vKQukfbJUd");
        term5784 = new Long(174253963298276221L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5784;
        callMethod(klass, "setCreateTime", argTypes, term5749, args);
    }

};


