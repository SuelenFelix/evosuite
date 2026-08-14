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

public class VideoAllInfo_setPubDate_210145587556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13937;
     Object term13946;

    public VideoAllInfo_setPubDate_210145587556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13937 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13937, term13937.getClass(), "bvId", null);
        setIntField(term13937, term13937.getClass(), "avId", 0);
        setIntField(term13937, term13937.getClass(), "videos", 0);
        setIntField(term13937, term13937.getClass(), "tid", 0);
        setField(term13937, term13937.getClass(), "tName", null);
        setIntField(term13937, term13937.getClass(), "copyright", 0);
        setField(term13937, term13937.getClass(), "pic", null);
        setField(term13937, term13937.getClass(), "title", null);
        setIntField(term13937, term13937.getClass(), "pubDate", 0);
        setIntField(term13937, term13937.getClass(), "ctime", 0);
        setField(term13937, term13937.getClass(), "desc", null);
        setField(term13937, term13937.getClass(), "descV2", null);
        setIntField(term13937, term13937.getClass(), "state", 0);
        setLongField(term13937, term13937.getClass(), "duration", 0L);
        setField(term13937, term13937.getClass(), "creatorUid", null);
        setField(term13937, term13937.getClass(), "pages", null);
        setField(term13937, term13937.getClass(), "tagList", null);
        term13946 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13946;
        callMethod(klass, "setPubDate", argTypes, term13937, args);
    }

};


