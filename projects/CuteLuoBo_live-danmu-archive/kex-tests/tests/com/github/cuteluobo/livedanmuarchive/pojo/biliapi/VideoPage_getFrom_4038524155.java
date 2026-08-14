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

public class VideoPage_getFrom_4038524155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16433;

    public VideoPage_getFrom_4038524155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16433 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16433, term16433.getClass(), "cid", 9174730812791817537L);
        setIntField(term16433, term16433.getClass(), "page", 1631305277);
        setField(term16433, term16433.getClass(), "from", "fkzRpxlAqS");
        setField(term16433, term16433.getClass(), "partName", "VYvbTGKslj");
        setLongField(term16433, term16433.getClass(), "duration", 8024477479047145752L);
        setIntField(term16433, term16433.getClass(), "width", 162113491);
        setIntField(term16433, term16433.getClass(), "height", -932147928);
        setBooleanField(term16433, term16433.getClass(), "rotate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrom", argTypes, term16433, args);
    }

};


