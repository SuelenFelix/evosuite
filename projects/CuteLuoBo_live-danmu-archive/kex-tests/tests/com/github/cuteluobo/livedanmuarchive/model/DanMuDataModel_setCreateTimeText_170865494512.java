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

public class DanMuDataModel_setCreateTimeText_170865494512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5861;

    public DanMuDataModel_setCreateTimeText_170865494512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5862 = new Long(3423965054378869855L);
        Integer term5864 = new Integer(-1870495012);
        Integer term5878 = new Integer(-1310015129);
        Integer term5880 = new Integer(-2104981311);
        Long term5882 = new Long(-593735869267672817L);
        term5861 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5861, term5861.getClass(), "id", term5862);
        setField(term5861, term5861.getClass(), "userId", term5864);
        setField(term5861, term5861.getClass(), "data", "OqbwYQfvAe");
        setField(term5861, term5861.getClass(), "format", term5878);
        setField(term5861, term5861.getClass(), "type", term5880);
        setField(term5861, term5861.getClass(), "createTime", term5882);
        setField(term5861, term5861.getClass(), "createTimeText", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "setCreateTimeText", argTypes, term5861, args);
    }

};


