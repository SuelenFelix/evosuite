package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class VideoPage_setDuration_133409999210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16732;
     Object term16763;

    public VideoPage_setDuration_133409999210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16732 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16732, term16732.getClass(), "cid", -5004803270846838598L);
        setIntField(term16732, term16732.getClass(), "page", -574105759);
        setField(term16732, term16732.getClass(), "from", "gVnDVbSyKa");
        setField(term16732, term16732.getClass(), "partName", "kdCYNMSuoD");
        setLongField(term16732, term16732.getClass(), "duration", -8211859616692114655L);
        setIntField(term16732, term16732.getClass(), "width", -1165271567);
        setIntField(term16732, term16732.getClass(), "height", 376834234);
        setBooleanField(term16732, term16732.getClass(), "rotate", true);
        term16763 = new Long(7487838449539103993L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16763;
        callMethod(klass, "setDuration", argTypes, term16732, args);
    }

};


