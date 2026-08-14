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

public class DanMuDataModel_setData_11772423494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5393;

    public DanMuDataModel_setData_11772423494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5394 = new Long(4255811647459029682L);
        Integer term5396 = new Integer(197109649);
        Integer term5410 = new Integer(-1239406390);
        Integer term5412 = new Integer(1557431527);
        Long term5414 = new Long(8000844860910174690L);
        term5393 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5393, term5393.getClass(), "id", term5394);
        setField(term5393, term5393.getClass(), "userId", term5396);
        setField(term5393, term5393.getClass(), "data", "cudZvLMQon");
        setField(term5393, term5393.getClass(), "format", term5410);
        setField(term5393, term5393.getClass(), "type", term5412);
        setField(term5393, term5393.getClass(), "createTime", term5414);
        setField(term5393, term5393.getClass(), "createTimeText", "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmcmxoGhIK";
        callMethod(klass, "setData", argTypes, term5393, args);
    }

};


