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

public class VideoPage_setFrom_13160241536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16484;

    public VideoPage_setFrom_13160241536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16484 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16484, term16484.getClass(), "cid", 7006402814669334483L);
        setIntField(term16484, term16484.getClass(), "page", 487369012);
        setField(term16484, term16484.getClass(), "from", "owLqDDnwZA");
        setField(term16484, term16484.getClass(), "partName", "eBcTbweeYp");
        setLongField(term16484, term16484.getClass(), "duration", -4003544865306793676L);
        setIntField(term16484, term16484.getClass(), "width", -179238712);
        setIntField(term16484, term16484.getClass(), "height", -2018735535);
        setBooleanField(term16484, term16484.getClass(), "rotate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "drcmjfQUDq";
        callMethod(klass, "setFrom", argTypes, term16484, args);
    }

};


