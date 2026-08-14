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

public class VideoAllInfo_setTagList_67876948669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20102;

    public VideoAllInfo_setTagList_67876948669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20102 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term20102, term20102.getClass(), "bvId", null);
        setIntField(term20102, term20102.getClass(), "avId", 0);
        setIntField(term20102, term20102.getClass(), "videos", 0);
        setIntField(term20102, term20102.getClass(), "tid", 0);
        setField(term20102, term20102.getClass(), "tName", null);
        setIntField(term20102, term20102.getClass(), "copyright", 0);
        setField(term20102, term20102.getClass(), "pic", null);
        setField(term20102, term20102.getClass(), "title", null);
        setIntField(term20102, term20102.getClass(), "pubDate", 0);
        setIntField(term20102, term20102.getClass(), "ctime", 0);
        setField(term20102, term20102.getClass(), "desc", null);
        setField(term20102, term20102.getClass(), "descV2", null);
        setIntField(term20102, term20102.getClass(), "state", 0);
        setLongField(term20102, term20102.getClass(), "duration", 0L);
        setField(term20102, term20102.getClass(), "creatorUid", null);
        setField(term20102, term20102.getClass(), "pages", null);
        setField(term20102, term20102.getClass(), "tagList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTagList", argTypes, term20102, args);
    }

};


