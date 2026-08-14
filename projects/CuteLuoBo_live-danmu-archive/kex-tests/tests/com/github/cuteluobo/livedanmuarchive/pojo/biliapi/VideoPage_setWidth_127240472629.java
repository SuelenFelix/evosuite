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
import java.lang.Integer;

public class VideoPage_setWidth_127240472629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17180;
     Object term17187;

    public VideoPage_setWidth_127240472629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17180 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17180, term17180.getClass(), "cid", 0L);
        setIntField(term17180, term17180.getClass(), "page", 0);
        setField(term17180, term17180.getClass(), "from", null);
        setField(term17180, term17180.getClass(), "partName", null);
        setLongField(term17180, term17180.getClass(), "duration", 0L);
        setIntField(term17180, term17180.getClass(), "width", 0);
        setIntField(term17180, term17180.getClass(), "height", 0);
        setBooleanField(term17180, term17180.getClass(), "rotate", false);
        term17187 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17187;
        callMethod(klass, "setWidth", argTypes, term17180, args);
    }

};


