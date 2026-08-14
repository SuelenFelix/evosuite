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

public class VideoAllInfo_setState_134371693763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20044;
     Object term20053;

    public VideoAllInfo_setState_134371693763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20044 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term20044, term20044.getClass(), "bvId", null);
        setIntField(term20044, term20044.getClass(), "avId", 0);
        setIntField(term20044, term20044.getClass(), "videos", 0);
        setIntField(term20044, term20044.getClass(), "tid", 0);
        setField(term20044, term20044.getClass(), "tName", null);
        setIntField(term20044, term20044.getClass(), "copyright", 0);
        setField(term20044, term20044.getClass(), "pic", null);
        setField(term20044, term20044.getClass(), "title", null);
        setIntField(term20044, term20044.getClass(), "pubDate", 0);
        setIntField(term20044, term20044.getClass(), "ctime", 0);
        setField(term20044, term20044.getClass(), "desc", null);
        setField(term20044, term20044.getClass(), "descV2", null);
        setIntField(term20044, term20044.getClass(), "state", 0);
        setLongField(term20044, term20044.getClass(), "duration", 0L);
        setField(term20044, term20044.getClass(), "creatorUid", null);
        setField(term20044, term20044.getClass(), "pages", null);
        setField(term20044, term20044.getClass(), "tagList", null);
        term20053 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20053;
        callMethod(klass, "setState", argTypes, term20044, args);
    }

};


