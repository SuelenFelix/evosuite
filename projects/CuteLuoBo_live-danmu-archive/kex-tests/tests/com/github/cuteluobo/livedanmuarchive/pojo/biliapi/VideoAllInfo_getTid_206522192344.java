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

public class VideoAllInfo_getTid_206522192344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19865;

    public VideoAllInfo_getTid_206522192344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19865 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19865, term19865.getClass(), "bvId", null);
        setIntField(term19865, term19865.getClass(), "avId", 0);
        setIntField(term19865, term19865.getClass(), "videos", 0);
        setIntField(term19865, term19865.getClass(), "tid", 0);
        setField(term19865, term19865.getClass(), "tName", null);
        setIntField(term19865, term19865.getClass(), "copyright", 0);
        setField(term19865, term19865.getClass(), "pic", null);
        setField(term19865, term19865.getClass(), "title", null);
        setIntField(term19865, term19865.getClass(), "pubDate", 0);
        setIntField(term19865, term19865.getClass(), "ctime", 0);
        setField(term19865, term19865.getClass(), "desc", null);
        setField(term19865, term19865.getClass(), "descV2", null);
        setIntField(term19865, term19865.getClass(), "state", 0);
        setLongField(term19865, term19865.getClass(), "duration", 0L);
        setField(term19865, term19865.getClass(), "creatorUid", null);
        setField(term19865, term19865.getClass(), "pages", null);
        setField(term19865, term19865.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTid", argTypes, term19865, args);
    }

};


