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

public class VideoPage_isRotate_41577632115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16993;

    public VideoPage_isRotate_41577632115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16993 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16993, term16993.getClass(), "cid", 3643973882575578879L);
        setIntField(term16993, term16993.getClass(), "page", -2093707412);
        setField(term16993, term16993.getClass(), "from", "vQJUCtuYpK");
        setField(term16993, term16993.getClass(), "partName", "GHtOeztAdz");
        setLongField(term16993, term16993.getClass(), "duration", -1750555031444556464L);
        setIntField(term16993, term16993.getClass(), "width", -680627153);
        setIntField(term16993, term16993.getClass(), "height", 722519669);
        setBooleanField(term16993, term16993.getClass(), "rotate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRotate", argTypes, term16993, args);
    }

};


