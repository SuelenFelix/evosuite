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

public class VideoAllInfo_getAvId_55288906642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13803;

    public VideoAllInfo_getAvId_55288906642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13803 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13803, term13803.getClass(), "bvId", null);
        setIntField(term13803, term13803.getClass(), "avId", 0);
        setIntField(term13803, term13803.getClass(), "videos", 0);
        setIntField(term13803, term13803.getClass(), "tid", 0);
        setField(term13803, term13803.getClass(), "tName", null);
        setIntField(term13803, term13803.getClass(), "copyright", 0);
        setField(term13803, term13803.getClass(), "pic", null);
        setField(term13803, term13803.getClass(), "title", null);
        setIntField(term13803, term13803.getClass(), "pubDate", 0);
        setIntField(term13803, term13803.getClass(), "ctime", 0);
        setField(term13803, term13803.getClass(), "desc", null);
        setField(term13803, term13803.getClass(), "descV2", null);
        setIntField(term13803, term13803.getClass(), "state", 0);
        setLongField(term13803, term13803.getClass(), "duration", 0L);
        setField(term13803, term13803.getClass(), "creatorUid", null);
        setField(term13803, term13803.getClass(), "pages", null);
        setField(term13803, term13803.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvId", argTypes, term13803, args);
    }

};


