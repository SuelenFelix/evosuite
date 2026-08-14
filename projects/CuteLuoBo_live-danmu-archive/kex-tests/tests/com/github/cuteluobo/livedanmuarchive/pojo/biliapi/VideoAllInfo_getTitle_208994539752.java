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

public class VideoAllInfo_getTitle_208994539752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19941;

    public VideoAllInfo_getTitle_208994539752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19941 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19941, term19941.getClass(), "bvId", null);
        setIntField(term19941, term19941.getClass(), "avId", 0);
        setIntField(term19941, term19941.getClass(), "videos", 0);
        setIntField(term19941, term19941.getClass(), "tid", 0);
        setField(term19941, term19941.getClass(), "tName", null);
        setIntField(term19941, term19941.getClass(), "copyright", 0);
        setField(term19941, term19941.getClass(), "pic", null);
        setField(term19941, term19941.getClass(), "title", null);
        setIntField(term19941, term19941.getClass(), "pubDate", 0);
        setIntField(term19941, term19941.getClass(), "ctime", 0);
        setField(term19941, term19941.getClass(), "desc", null);
        setField(term19941, term19941.getClass(), "descV2", null);
        setIntField(term19941, term19941.getClass(), "state", 0);
        setLongField(term19941, term19941.getClass(), "duration", 0L);
        setField(term19941, term19941.getClass(), "creatorUid", null);
        setField(term19941, term19941.getClass(), "pages", null);
        setField(term19941, term19941.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term19941, args);
    }

};


