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

public class VideoPage_setCid_165261841819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17104;
     Object term17111;

    public VideoPage_setCid_165261841819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17104 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17104, term17104.getClass(), "cid", 0L);
        setIntField(term17104, term17104.getClass(), "page", 0);
        setField(term17104, term17104.getClass(), "from", null);
        setField(term17104, term17104.getClass(), "partName", null);
        setLongField(term17104, term17104.getClass(), "duration", 0L);
        setIntField(term17104, term17104.getClass(), "width", 0);
        setIntField(term17104, term17104.getClass(), "height", 0);
        setBooleanField(term17104, term17104.getClass(), "rotate", false);
        term17111 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17111;
        callMethod(klass, "setCid", argTypes, term17104, args);
    }

};


