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

public class BiliProcessedPartVideoData_setVideoStartMillTime_170802740812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572;
     Object term601;

    public BiliProcessedPartVideoData_setVideoStartMillTime_170802740812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term572, term572.getClass(), "bvId", "eZFUvlxvGV");
        setLongField(term572, term572.getClass(), "cid", -2170847986967241072L);
        setLongField(term572, term572.getClass(), "duration", 4044358158040652353L);
        setField(term572, term572.getClass(), "partName", "BYqFIqCKAV");
        setLongField(term572, term572.getClass(), "videoStartMillTime", -4443169559037975007L);
        setLongField(term572, term572.getClass(), "videoEndMillTime", -3842548265506930260L);
        term601 = new Long(-5788180182343976541L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term601;
        callMethod(klass, "setVideoStartMillTime", argTypes, term572, args);
    }

};


