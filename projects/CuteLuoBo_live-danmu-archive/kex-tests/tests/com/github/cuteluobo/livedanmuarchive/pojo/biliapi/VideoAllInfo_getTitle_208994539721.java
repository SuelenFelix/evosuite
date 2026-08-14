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

public class VideoAllInfo_getTitle_208994539721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6955;

    public VideoAllInfo_getTitle_208994539721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6955 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term6955, term6955.getClass(), "bvId", null);
        setIntField(term6955, term6955.getClass(), "avId", 0);
        setIntField(term6955, term6955.getClass(), "videos", 0);
        setIntField(term6955, term6955.getClass(), "tid", 0);
        setField(term6955, term6955.getClass(), "tName", null);
        setIntField(term6955, term6955.getClass(), "copyright", 0);
        setField(term6955, term6955.getClass(), "pic", null);
        setField(term6955, term6955.getClass(), "title", null);
        setIntField(term6955, term6955.getClass(), "pubDate", 0);
        setIntField(term6955, term6955.getClass(), "ctime", 0);
        setField(term6955, term6955.getClass(), "desc", null);
        setField(term6955, term6955.getClass(), "descV2", null);
        setIntField(term6955, term6955.getClass(), "state", 0);
        setLongField(term6955, term6955.getClass(), "duration", 0L);
        setField(term6955, term6955.getClass(), "creatorUid", null);
        setField(term6955, term6955.getClass(), "pages", null);
        setField(term6955, term6955.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term6955, args);
    }

};


