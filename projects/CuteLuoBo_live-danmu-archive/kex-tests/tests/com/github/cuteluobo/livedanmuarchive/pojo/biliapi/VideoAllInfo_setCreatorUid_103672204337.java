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

public class VideoAllInfo_setCreatorUid_103672204337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19798;

    public VideoAllInfo_setCreatorUid_103672204337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19798 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19798, term19798.getClass(), "bvId", null);
        setIntField(term19798, term19798.getClass(), "avId", 0);
        setIntField(term19798, term19798.getClass(), "videos", 0);
        setIntField(term19798, term19798.getClass(), "tid", 0);
        setField(term19798, term19798.getClass(), "tName", null);
        setIntField(term19798, term19798.getClass(), "copyright", 0);
        setField(term19798, term19798.getClass(), "pic", null);
        setField(term19798, term19798.getClass(), "title", null);
        setIntField(term19798, term19798.getClass(), "pubDate", 0);
        setIntField(term19798, term19798.getClass(), "ctime", 0);
        setField(term19798, term19798.getClass(), "desc", null);
        setField(term19798, term19798.getClass(), "descV2", null);
        setIntField(term19798, term19798.getClass(), "state", 0);
        setLongField(term19798, term19798.getClass(), "duration", 0L);
        setField(term19798, term19798.getClass(), "creatorUid", null);
        setField(term19798, term19798.getClass(), "pages", null);
        setField(term19798, term19798.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatorUid", argTypes, term19798, args);
    }

};


