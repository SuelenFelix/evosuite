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

public class VideoAllInfo_getDesc_145879451258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19999;

    public VideoAllInfo_getDesc_145879451258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19999 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19999, term19999.getClass(), "bvId", null);
        setIntField(term19999, term19999.getClass(), "avId", 0);
        setIntField(term19999, term19999.getClass(), "videos", 0);
        setIntField(term19999, term19999.getClass(), "tid", 0);
        setField(term19999, term19999.getClass(), "tName", null);
        setIntField(term19999, term19999.getClass(), "copyright", 0);
        setField(term19999, term19999.getClass(), "pic", null);
        setField(term19999, term19999.getClass(), "title", null);
        setIntField(term19999, term19999.getClass(), "pubDate", 0);
        setIntField(term19999, term19999.getClass(), "ctime", 0);
        setField(term19999, term19999.getClass(), "desc", null);
        setField(term19999, term19999.getClass(), "descV2", null);
        setIntField(term19999, term19999.getClass(), "state", 0);
        setLongField(term19999, term19999.getClass(), "duration", 0L);
        setField(term19999, term19999.getClass(), "creatorUid", null);
        setField(term19999, term19999.getClass(), "pages", null);
        setField(term19999, term19999.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDesc", argTypes, term19999, args);
    }

};


