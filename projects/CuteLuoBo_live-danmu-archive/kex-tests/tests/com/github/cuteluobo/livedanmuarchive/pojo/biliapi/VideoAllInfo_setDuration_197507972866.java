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
import java.lang.Long;

public class VideoAllInfo_setDuration_197507972866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14033;
     Object term14042;

    public VideoAllInfo_setDuration_197507972866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14033 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term14033, term14033.getClass(), "bvId", null);
        setIntField(term14033, term14033.getClass(), "avId", 0);
        setIntField(term14033, term14033.getClass(), "videos", 0);
        setIntField(term14033, term14033.getClass(), "tid", 0);
        setField(term14033, term14033.getClass(), "tName", null);
        setIntField(term14033, term14033.getClass(), "copyright", 0);
        setField(term14033, term14033.getClass(), "pic", null);
        setField(term14033, term14033.getClass(), "title", null);
        setIntField(term14033, term14033.getClass(), "pubDate", 0);
        setIntField(term14033, term14033.getClass(), "ctime", 0);
        setField(term14033, term14033.getClass(), "desc", null);
        setField(term14033, term14033.getClass(), "descV2", null);
        setIntField(term14033, term14033.getClass(), "state", 0);
        setLongField(term14033, term14033.getClass(), "duration", 0L);
        setField(term14033, term14033.getClass(), "creatorUid", null);
        setField(term14033, term14033.getClass(), "pages", null);
        setField(term14033, term14033.getClass(), "tagList", null);
        term14042 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14042;
        callMethod(klass, "setDuration", argTypes, term14033, args);
    }

};


