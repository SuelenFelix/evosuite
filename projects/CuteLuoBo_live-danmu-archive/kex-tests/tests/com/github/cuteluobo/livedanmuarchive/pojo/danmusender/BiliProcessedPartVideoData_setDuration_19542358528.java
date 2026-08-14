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

public class BiliProcessedPartVideoData_setDuration_19542358528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term381;

    public BiliProcessedPartVideoData_setDuration_19542358528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term352, term352.getClass(), "bvId", "oVcInYnLWB");
        setLongField(term352, term352.getClass(), "cid", 2120084523938730454L);
        setLongField(term352, term352.getClass(), "duration", 6855071767938501807L);
        setField(term352, term352.getClass(), "partName", "aJlieCFVtF");
        setLongField(term352, term352.getClass(), "videoStartMillTime", -5892135042702373494L);
        setLongField(term352, term352.getClass(), "videoEndMillTime", 5262507301787091109L);
        term381 = new Long(-6823727938421990489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term381;
        callMethod(klass, "setDuration", argTypes, term352, args);
    }

};


