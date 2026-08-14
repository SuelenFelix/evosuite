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

public class VideoAllInfo_getPages_36712580867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14044;

    public VideoAllInfo_getPages_36712580867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14044 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term14044, term14044.getClass(), "bvId", null);
        setIntField(term14044, term14044.getClass(), "avId", 0);
        setIntField(term14044, term14044.getClass(), "videos", 0);
        setIntField(term14044, term14044.getClass(), "tid", 0);
        setField(term14044, term14044.getClass(), "tName", null);
        setIntField(term14044, term14044.getClass(), "copyright", 0);
        setField(term14044, term14044.getClass(), "pic", null);
        setField(term14044, term14044.getClass(), "title", null);
        setIntField(term14044, term14044.getClass(), "pubDate", 0);
        setIntField(term14044, term14044.getClass(), "ctime", 0);
        setField(term14044, term14044.getClass(), "desc", null);
        setField(term14044, term14044.getClass(), "descV2", null);
        setIntField(term14044, term14044.getClass(), "state", 0);
        setLongField(term14044, term14044.getClass(), "duration", 0L);
        setField(term14044, term14044.getClass(), "creatorUid", null);
        setField(term14044, term14044.getClass(), "pages", null);
        setField(term14044, term14044.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPages", argTypes, term14044, args);
    }

};


