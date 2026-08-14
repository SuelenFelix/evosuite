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

public class VideoAllInfo_getCtime_190469293057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13948;

    public VideoAllInfo_getCtime_190469293057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13948 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13948, term13948.getClass(), "bvId", null);
        setIntField(term13948, term13948.getClass(), "avId", 0);
        setIntField(term13948, term13948.getClass(), "videos", 0);
        setIntField(term13948, term13948.getClass(), "tid", 0);
        setField(term13948, term13948.getClass(), "tName", null);
        setIntField(term13948, term13948.getClass(), "copyright", 0);
        setField(term13948, term13948.getClass(), "pic", null);
        setField(term13948, term13948.getClass(), "title", null);
        setIntField(term13948, term13948.getClass(), "pubDate", 0);
        setIntField(term13948, term13948.getClass(), "ctime", 0);
        setField(term13948, term13948.getClass(), "desc", null);
        setField(term13948, term13948.getClass(), "descV2", null);
        setIntField(term13948, term13948.getClass(), "state", 0);
        setLongField(term13948, term13948.getClass(), "duration", 0L);
        setField(term13948, term13948.getClass(), "creatorUid", null);
        setField(term13948, term13948.getClass(), "pages", null);
        setField(term13948, term13948.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCtime", argTypes, term13948, args);
    }

};


