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

public class VideoPage_setPage_173862483521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17120;
     Object term17127;

    public VideoPage_setPage_173862483521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17120 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17120, term17120.getClass(), "cid", 0L);
        setIntField(term17120, term17120.getClass(), "page", 0);
        setField(term17120, term17120.getClass(), "from", null);
        setField(term17120, term17120.getClass(), "partName", null);
        setLongField(term17120, term17120.getClass(), "duration", 0L);
        setIntField(term17120, term17120.getClass(), "width", 0);
        setIntField(term17120, term17120.getClass(), "height", 0);
        setBooleanField(term17120, term17120.getClass(), "rotate", false);
        term17127 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17127;
        callMethod(klass, "setPage", argTypes, term17120, args);
    }

};


