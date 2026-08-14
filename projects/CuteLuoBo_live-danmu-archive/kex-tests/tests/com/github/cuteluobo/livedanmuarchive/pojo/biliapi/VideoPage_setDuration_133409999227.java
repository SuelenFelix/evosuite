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

public class VideoPage_setDuration_133409999227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17164;
     Object term17171;

    public VideoPage_setDuration_133409999227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17164 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17164, term17164.getClass(), "cid", 0L);
        setIntField(term17164, term17164.getClass(), "page", 0);
        setField(term17164, term17164.getClass(), "from", null);
        setField(term17164, term17164.getClass(), "partName", null);
        setLongField(term17164, term17164.getClass(), "duration", 0L);
        setIntField(term17164, term17164.getClass(), "width", 0);
        setIntField(term17164, term17164.getClass(), "height", 0);
        setBooleanField(term17164, term17164.getClass(), "rotate", false);
        term17171 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17171;
        callMethod(klass, "setDuration", argTypes, term17164, args);
    }

};


