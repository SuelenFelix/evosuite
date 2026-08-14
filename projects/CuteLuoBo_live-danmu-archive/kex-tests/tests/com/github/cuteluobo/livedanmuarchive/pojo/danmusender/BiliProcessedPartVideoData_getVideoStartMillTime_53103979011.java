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

public class BiliProcessedPartVideoData_getVideoStartMillTime_53103979011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;

    public BiliProcessedPartVideoData_getVideoStartMillTime_53103979011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term523, term523.getClass(), "bvId", "RkybSrpybU");
        setLongField(term523, term523.getClass(), "cid", -6292278961887936280L);
        setLongField(term523, term523.getClass(), "duration", -6645965768855543712L);
        setField(term523, term523.getClass(), "partName", "xOEqzGAmDU");
        setLongField(term523, term523.getClass(), "videoStartMillTime", 4784595517102746672L);
        setLongField(term523, term523.getClass(), "videoEndMillTime", -7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoStartMillTime", argTypes, term523, args);
    }

};


