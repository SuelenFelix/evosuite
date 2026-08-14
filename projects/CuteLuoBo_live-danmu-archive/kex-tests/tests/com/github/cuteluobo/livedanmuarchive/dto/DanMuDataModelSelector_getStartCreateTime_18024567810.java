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

public class DanMuDataModelSelector_getStartCreateTime_18024567810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3287;

    public DanMuDataModelSelector_getStartCreateTime_18024567810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3287 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3287, term3287.getClass(), "startCreateTime", null);
        setField(term3287, term3287.getClass(), "endCreateTime", null);
        setField(term3287, term3287.getClass(), "id", null);
        setField(term3287, term3287.getClass(), "userId", null);
        setField(term3287, term3287.getClass(), "data", null);
        setField(term3287, term3287.getClass(), "format", null);
        setField(term3287, term3287.getClass(), "type", null);
        setField(term3287, term3287.getClass(), "createTime", null);
        setField(term3287, term3287.getClass(), "createTimeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term3287, args);
    }

};


