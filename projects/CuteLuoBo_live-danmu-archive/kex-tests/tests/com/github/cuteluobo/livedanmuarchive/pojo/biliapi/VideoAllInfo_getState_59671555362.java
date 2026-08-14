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

public class VideoAllInfo_getState_59671555362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20035;

    public VideoAllInfo_getState_59671555362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20035 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term20035, term20035.getClass(), "bvId", null);
        setIntField(term20035, term20035.getClass(), "avId", 0);
        setIntField(term20035, term20035.getClass(), "videos", 0);
        setIntField(term20035, term20035.getClass(), "tid", 0);
        setField(term20035, term20035.getClass(), "tName", null);
        setIntField(term20035, term20035.getClass(), "copyright", 0);
        setField(term20035, term20035.getClass(), "pic", null);
        setField(term20035, term20035.getClass(), "title", null);
        setIntField(term20035, term20035.getClass(), "pubDate", 0);
        setIntField(term20035, term20035.getClass(), "ctime", 0);
        setField(term20035, term20035.getClass(), "desc", null);
        setField(term20035, term20035.getClass(), "descV2", null);
        setIntField(term20035, term20035.getClass(), "state", 0);
        setLongField(term20035, term20035.getClass(), "duration", 0L);
        setField(term20035, term20035.getClass(), "creatorUid", null);
        setField(term20035, term20035.getClass(), "pages", null);
        setField(term20035, term20035.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term20035, args);
    }

};


