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

public class DanMuDataModel_toString_147927436131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6119;

    public DanMuDataModel_toString_147927436131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6119 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term6119, term6119.getClass(), "id", null);
        setField(term6119, term6119.getClass(), "userId", null);
        setField(term6119, term6119.getClass(), "data", null);
        setField(term6119, term6119.getClass(), "format", null);
        setField(term6119, term6119.getClass(), "type", null);
        setField(term6119, term6119.getClass(), "createTime", null);
        setField(term6119, term6119.getClass(), "createTimeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6119, args);
    }

};


