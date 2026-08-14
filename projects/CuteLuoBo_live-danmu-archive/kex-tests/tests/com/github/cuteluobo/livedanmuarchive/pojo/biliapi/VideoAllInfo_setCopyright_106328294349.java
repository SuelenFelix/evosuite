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

public class VideoAllInfo_setCopyright_106328294349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19912;
     Object term19921;

    public VideoAllInfo_setCopyright_106328294349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19912 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term19912, term19912.getClass(), "bvId", null);
        setIntField(term19912, term19912.getClass(), "avId", 0);
        setIntField(term19912, term19912.getClass(), "videos", 0);
        setIntField(term19912, term19912.getClass(), "tid", 0);
        setField(term19912, term19912.getClass(), "tName", null);
        setIntField(term19912, term19912.getClass(), "copyright", 0);
        setField(term19912, term19912.getClass(), "pic", null);
        setField(term19912, term19912.getClass(), "title", null);
        setIntField(term19912, term19912.getClass(), "pubDate", 0);
        setIntField(term19912, term19912.getClass(), "ctime", 0);
        setField(term19912, term19912.getClass(), "desc", null);
        setField(term19912, term19912.getClass(), "descV2", null);
        setIntField(term19912, term19912.getClass(), "state", 0);
        setLongField(term19912, term19912.getClass(), "duration", 0L);
        setField(term19912, term19912.getClass(), "creatorUid", null);
        setField(term19912, term19912.getClass(), "pages", null);
        setField(term19912, term19912.getClass(), "tagList", null);
        term19921 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19921;
        callMethod(klass, "setCopyright", argTypes, term19912, args);
    }

};


