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

public class VideoAllInfo_settName_67380398247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19894;

    public VideoAllInfo_settName_67380398247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19894 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19894, term19894.getClass(), "bvId", null);
        setIntField(term19894, term19894.getClass(), "avId", 0);
        setIntField(term19894, term19894.getClass(), "videos", 0);
        setIntField(term19894, term19894.getClass(), "tid", 0);
        setField(term19894, term19894.getClass(), "tName", null);
        setIntField(term19894, term19894.getClass(), "copyright", 0);
        setField(term19894, term19894.getClass(), "pic", null);
        setField(term19894, term19894.getClass(), "title", null);
        setIntField(term19894, term19894.getClass(), "pubDate", 0);
        setIntField(term19894, term19894.getClass(), "ctime", 0);
        setField(term19894, term19894.getClass(), "desc", null);
        setField(term19894, term19894.getClass(), "descV2", null);
        setIntField(term19894, term19894.getClass(), "state", 0);
        setLongField(term19894, term19894.getClass(), "duration", 0L);
        setField(term19894, term19894.getClass(), "creatorUid", null);
        setField(term19894, term19894.getClass(), "pages", null);
        setField(term19894, term19894.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "settName", argTypes, term19894, args);
    }

};


