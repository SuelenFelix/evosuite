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

public class VideoAllInfo_setCopyright_106328294351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13890;
     Object term13899;

    public VideoAllInfo_setCopyright_106328294351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13890 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term13890, term13890.getClass(), "bvId", null);
        setIntField(term13890, term13890.getClass(), "avId", 0);
        setIntField(term13890, term13890.getClass(), "videos", 0);
        setIntField(term13890, term13890.getClass(), "tid", 0);
        setField(term13890, term13890.getClass(), "tName", null);
        setIntField(term13890, term13890.getClass(), "copyright", 0);
        setField(term13890, term13890.getClass(), "pic", null);
        setField(term13890, term13890.getClass(), "title", null);
        setIntField(term13890, term13890.getClass(), "pubDate", 0);
        setIntField(term13890, term13890.getClass(), "ctime", 0);
        setField(term13890, term13890.getClass(), "desc", null);
        setField(term13890, term13890.getClass(), "descV2", null);
        setIntField(term13890, term13890.getClass(), "state", 0);
        setLongField(term13890, term13890.getClass(), "duration", 0L);
        setField(term13890, term13890.getClass(), "creatorUid", null);
        setField(term13890, term13890.getClass(), "pages", null);
        setField(term13890, term13890.getClass(), "tagList", null);
        term13899 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13899;
        callMethod(klass, "setCopyright", argTypes, term13890, args);
    }

};


