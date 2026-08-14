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

public class DanMuDataModel_getUserId_325829401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5226;

    public DanMuDataModel_getUserId_325829401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5227 = new Long(4069264186851023313L);
        Integer term5229 = new Integer(-2014576105);
        Integer term5243 = new Integer(1296895584);
        Integer term5245 = new Integer(628918458);
        Long term5247 = new Long(5184635470881147510L);
        term5226 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5226, term5226.getClass(), "id", term5227);
        setField(term5226, term5226.getClass(), "userId", term5229);
        setField(term5226, term5226.getClass(), "data", "DSNsTGYXDF");
        setField(term5226, term5226.getClass(), "format", term5243);
        setField(term5226, term5226.getClass(), "type", term5245);
        setField(term5226, term5226.getClass(), "createTime", term5247);
        setField(term5226, term5226.getClass(), "createTimeText", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term5226, args);
    }

};


