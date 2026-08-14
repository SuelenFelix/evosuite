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

public class VideoAllInfo_getDuration_119732030265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14024;

    public VideoAllInfo_getDuration_119732030265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14024 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term14024, term14024.getClass(), "bvId", null);
        setIntField(term14024, term14024.getClass(), "avId", 0);
        setIntField(term14024, term14024.getClass(), "videos", 0);
        setIntField(term14024, term14024.getClass(), "tid", 0);
        setField(term14024, term14024.getClass(), "tName", null);
        setIntField(term14024, term14024.getClass(), "copyright", 0);
        setField(term14024, term14024.getClass(), "pic", null);
        setField(term14024, term14024.getClass(), "title", null);
        setIntField(term14024, term14024.getClass(), "pubDate", 0);
        setIntField(term14024, term14024.getClass(), "ctime", 0);
        setField(term14024, term14024.getClass(), "desc", null);
        setField(term14024, term14024.getClass(), "descV2", null);
        setIntField(term14024, term14024.getClass(), "state", 0);
        setLongField(term14024, term14024.getClass(), "duration", 0L);
        setField(term14024, term14024.getClass(), "creatorUid", null);
        setField(term14024, term14024.getClass(), "pages", null);
        setField(term14024, term14024.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term14024, args);
    }

};


