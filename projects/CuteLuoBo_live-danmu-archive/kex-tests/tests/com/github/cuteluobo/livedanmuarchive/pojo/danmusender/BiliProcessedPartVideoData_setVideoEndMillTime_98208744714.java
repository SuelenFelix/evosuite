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
import java.lang.Long;

public class BiliProcessedPartVideoData_setVideoEndMillTime_98208744714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term701;

    public BiliProcessedPartVideoData_setVideoEndMillTime_98208744714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term672, term672.getClass(), "bvId", "OclPbYPkcH");
        setLongField(term672, term672.getClass(), "cid", -1468719814009985452L);
        setLongField(term672, term672.getClass(), "duration", -7738503207562305297L);
        setField(term672, term672.getClass(), "partName", "IoAlmYsBwc");
        setLongField(term672, term672.getClass(), "videoStartMillTime", 3825396310311739952L);
        setLongField(term672, term672.getClass(), "videoEndMillTime", -3838084482494604218L);
        term701 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term701;
        callMethod(klass, "setVideoEndMillTime", argTypes, term672, args);
    }

};


