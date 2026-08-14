package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuDataModelSelector_setEndCreateTime_137208100313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3290;

    public DanMuDataModelSelector_setEndCreateTime_137208100313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3290 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3290, term3290.getClass(), "startCreateTime", null);
        setField(term3290, term3290.getClass(), "endCreateTime", null);
        setField(term3290, term3290.getClass(), "id", null);
        setField(term3290, term3290.getClass(), "userId", null);
        setField(term3290, term3290.getClass(), "data", null);
        setField(term3290, term3290.getClass(), "format", null);
        setField(term3290, term3290.getClass(), "type", null);
        setField(term3290, term3290.getClass(), "createTime", null);
        setField(term3290, term3290.getClass(), "createTimeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndCreateTime", argTypes, term3290, args);
    }

};


