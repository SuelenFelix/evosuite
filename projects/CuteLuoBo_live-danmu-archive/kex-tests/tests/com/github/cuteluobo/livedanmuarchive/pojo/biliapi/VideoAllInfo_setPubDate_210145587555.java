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

public class VideoAllInfo_setPubDate_210145587555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19968;
     Object term19977;

    public VideoAllInfo_setPubDate_210145587555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19968 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19968, term19968.getClass(), "bvId", null);
        setIntField(term19968, term19968.getClass(), "avId", 0);
        setIntField(term19968, term19968.getClass(), "videos", 0);
        setIntField(term19968, term19968.getClass(), "tid", 0);
        setField(term19968, term19968.getClass(), "tName", null);
        setIntField(term19968, term19968.getClass(), "copyright", 0);
        setField(term19968, term19968.getClass(), "pic", null);
        setField(term19968, term19968.getClass(), "title", null);
        setIntField(term19968, term19968.getClass(), "pubDate", 0);
        setIntField(term19968, term19968.getClass(), "ctime", 0);
        setField(term19968, term19968.getClass(), "desc", null);
        setField(term19968, term19968.getClass(), "descV2", null);
        setIntField(term19968, term19968.getClass(), "state", 0);
        setLongField(term19968, term19968.getClass(), "duration", 0L);
        setField(term19968, term19968.getClass(), "creatorUid", null);
        setField(term19968, term19968.getClass(), "pages", null);
        setField(term19968, term19968.getClass(), "tagList", null);
        term19977 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19977;
        callMethod(klass, "setPubDate", argTypes, term19968, args);
    }

};


