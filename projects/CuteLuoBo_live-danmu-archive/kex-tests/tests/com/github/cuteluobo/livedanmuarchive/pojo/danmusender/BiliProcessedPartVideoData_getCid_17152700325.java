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

public class BiliProcessedPartVideoData_getCid_17152700325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;

    public BiliProcessedPartVideoData_getCid_17152700325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term203, term203.getClass(), "bvId", "hRNSzYYIrc");
        setLongField(term203, term203.getClass(), "cid", -316468845751588286L);
        setLongField(term203, term203.getClass(), "duration", 5127676408959197577L);
        setField(term203, term203.getClass(), "partName", "RMFIsYGgne");
        setLongField(term203, term203.getClass(), "videoStartMillTime", -6573104506744284592L);
        setLongField(term203, term203.getClass(), "videoEndMillTime", -4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCid", argTypes, term203, args);
    }

};


