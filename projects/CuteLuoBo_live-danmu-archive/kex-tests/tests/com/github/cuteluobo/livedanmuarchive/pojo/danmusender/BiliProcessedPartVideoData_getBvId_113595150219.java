package com.github.cuteluobo.livedanmuarchive.pojo.danmusender;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.danmusender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BiliProcessedPartVideoData_getBvId_113595150219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788;

    public BiliProcessedPartVideoData_getBvId_113595150219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term788 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term788, term788.getClass(), "bvId", null);
        setLongField(term788, term788.getClass(), "cid", 0L);
        setLongField(term788, term788.getClass(), "duration", 0L);
        setField(term788, term788.getClass(), "partName", null);
        setLongField(term788, term788.getClass(), "videoStartMillTime", 0L);
        setLongField(term788, term788.getClass(), "videoEndMillTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBvId", argTypes, term788, args);
    }

};


