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

public class VideoAllInfo_getVideos_80209649444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13823;

    public VideoAllInfo_getVideos_80209649444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13823 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13823, term13823.getClass(), "bvId", null);
        setIntField(term13823, term13823.getClass(), "avId", 0);
        setIntField(term13823, term13823.getClass(), "videos", 0);
        setIntField(term13823, term13823.getClass(), "tid", 0);
        setField(term13823, term13823.getClass(), "tName", null);
        setIntField(term13823, term13823.getClass(), "copyright", 0);
        setField(term13823, term13823.getClass(), "pic", null);
        setField(term13823, term13823.getClass(), "title", null);
        setIntField(term13823, term13823.getClass(), "pubDate", 0);
        setIntField(term13823, term13823.getClass(), "ctime", 0);
        setField(term13823, term13823.getClass(), "desc", null);
        setField(term13823, term13823.getClass(), "descV2", null);
        setIntField(term13823, term13823.getClass(), "state", 0);
        setLongField(term13823, term13823.getClass(), "duration", 0L);
        setField(term13823, term13823.getClass(), "creatorUid", null);
        setField(term13823, term13823.getClass(), "pages", null);
        setField(term13823, term13823.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideos", argTypes, term13823, args);
    }

};


