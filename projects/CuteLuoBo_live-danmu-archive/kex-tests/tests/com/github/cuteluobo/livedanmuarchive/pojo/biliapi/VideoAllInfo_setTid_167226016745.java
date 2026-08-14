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

public class VideoAllInfo_setTid_167226016745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19874;
     Object term19883;

    public VideoAllInfo_setTid_167226016745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19874 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19874, term19874.getClass(), "bvId", null);
        setIntField(term19874, term19874.getClass(), "avId", 0);
        setIntField(term19874, term19874.getClass(), "videos", 0);
        setIntField(term19874, term19874.getClass(), "tid", 0);
        setField(term19874, term19874.getClass(), "tName", null);
        setIntField(term19874, term19874.getClass(), "copyright", 0);
        setField(term19874, term19874.getClass(), "pic", null);
        setField(term19874, term19874.getClass(), "title", null);
        setIntField(term19874, term19874.getClass(), "pubDate", 0);
        setIntField(term19874, term19874.getClass(), "ctime", 0);
        setField(term19874, term19874.getClass(), "desc", null);
        setField(term19874, term19874.getClass(), "descV2", null);
        setIntField(term19874, term19874.getClass(), "state", 0);
        setLongField(term19874, term19874.getClass(), "duration", 0L);
        setField(term19874, term19874.getClass(), "creatorUid", null);
        setField(term19874, term19874.getClass(), "pages", null);
        setField(term19874, term19874.getClass(), "tagList", null);
        term19883 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19883;
        callMethod(klass, "setTid", argTypes, term19874, args);
    }

};


