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

public class VideoPage_getHeight_185107933513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16889;

    public VideoPage_getHeight_185107933513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16889 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16889, term16889.getClass(), "cid", -7423063312741500355L);
        setIntField(term16889, term16889.getClass(), "page", 1474899591);
        setField(term16889, term16889.getClass(), "from", "EOTYMqXRmE");
        setField(term16889, term16889.getClass(), "partName", "iTxNduwSjE");
        setLongField(term16889, term16889.getClass(), "duration", -8992404862613425105L);
        setIntField(term16889, term16889.getClass(), "width", 297582552);
        setIntField(term16889, term16889.getClass(), "height", -1485916498);
        setBooleanField(term16889, term16889.getClass(), "rotate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term16889, args);
    }

};


