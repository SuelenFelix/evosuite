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

public class VideoAllInfo_setTitle_178135348354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13919;

    public VideoAllInfo_setTitle_178135348354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13919 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13919, term13919.getClass(), "bvId", null);
        setIntField(term13919, term13919.getClass(), "avId", 0);
        setIntField(term13919, term13919.getClass(), "videos", 0);
        setIntField(term13919, term13919.getClass(), "tid", 0);
        setField(term13919, term13919.getClass(), "tName", null);
        setIntField(term13919, term13919.getClass(), "copyright", 0);
        setField(term13919, term13919.getClass(), "pic", null);
        setField(term13919, term13919.getClass(), "title", null);
        setIntField(term13919, term13919.getClass(), "pubDate", 0);
        setIntField(term13919, term13919.getClass(), "ctime", 0);
        setField(term13919, term13919.getClass(), "desc", null);
        setField(term13919, term13919.getClass(), "descV2", null);
        setIntField(term13919, term13919.getClass(), "state", 0);
        setLongField(term13919, term13919.getClass(), "duration", 0L);
        setField(term13919, term13919.getClass(), "creatorUid", null);
        setField(term13919, term13919.getClass(), "pages", null);
        setField(term13919, term13919.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term13919, args);
    }

};


