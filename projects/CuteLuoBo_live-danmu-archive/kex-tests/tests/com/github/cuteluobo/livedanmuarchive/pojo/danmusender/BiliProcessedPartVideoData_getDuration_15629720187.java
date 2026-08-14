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

public class BiliProcessedPartVideoData_getDuration_15629720187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;

    public BiliProcessedPartVideoData_getDuration_15629720187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term303, term303.getClass(), "bvId", "MxlszYVzRf");
        setLongField(term303, term303.getClass(), "cid", 7009926388951271268L);
        setLongField(term303, term303.getClass(), "duration", -7672528020740371001L);
        setField(term303, term303.getClass(), "partName", "LQFpaHEwXR");
        setLongField(term303, term303.getClass(), "videoStartMillTime", -4502405999831680926L);
        setLongField(term303, term303.getClass(), "videoEndMillTime", 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term303, args);
    }

};


