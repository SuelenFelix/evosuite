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

public class VideoAllInfo_getBvId_15016032186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1439;

    public VideoAllInfo_getBvId_15016032186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1439 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term1439, term1439.getClass(), "bvId", null);
        setIntField(term1439, term1439.getClass(), "avId", 0);
        setIntField(term1439, term1439.getClass(), "videos", 0);
        setIntField(term1439, term1439.getClass(), "tid", 0);
        setField(term1439, term1439.getClass(), "tName", null);
        setIntField(term1439, term1439.getClass(), "copyright", 0);
        setField(term1439, term1439.getClass(), "pic", null);
        setField(term1439, term1439.getClass(), "title", null);
        setIntField(term1439, term1439.getClass(), "pubDate", 0);
        setIntField(term1439, term1439.getClass(), "ctime", 0);
        setField(term1439, term1439.getClass(), "desc", null);
        setField(term1439, term1439.getClass(), "descV2", null);
        setIntField(term1439, term1439.getClass(), "state", 0);
        setLongField(term1439, term1439.getClass(), "duration", 0L);
        setField(term1439, term1439.getClass(), "creatorUid", null);
        setField(term1439, term1439.getClass(), "pages", null);
        setField(term1439, term1439.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBvId", argTypes, term1439, args);
    }

};


