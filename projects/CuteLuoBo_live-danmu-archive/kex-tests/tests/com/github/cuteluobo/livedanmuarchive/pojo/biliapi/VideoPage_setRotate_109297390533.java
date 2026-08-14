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
import java.lang.Boolean;

public class VideoPage_setRotate_109297390533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17212;
     Object term17219;

    public VideoPage_setRotate_109297390533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17212 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17212, term17212.getClass(), "cid", 0L);
        setIntField(term17212, term17212.getClass(), "page", 0);
        setField(term17212, term17212.getClass(), "from", null);
        setField(term17212, term17212.getClass(), "partName", null);
        setLongField(term17212, term17212.getClass(), "duration", 0L);
        setIntField(term17212, term17212.getClass(), "width", 0);
        setIntField(term17212, term17212.getClass(), "height", 0);
        setBooleanField(term17212, term17212.getClass(), "rotate", false);
        term17219 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17219;
        callMethod(klass, "setRotate", argTypes, term17212, args);
    }

};


