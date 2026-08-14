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

public class VideoPage_getCid_10951341721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16225;

    public VideoPage_getCid_10951341721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16225 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16225, term16225.getClass(), "cid", -8993073054427011802L);
        setIntField(term16225, term16225.getClass(), "page", -1398142433);
        setField(term16225, term16225.getClass(), "from", "TiEyxWXsra");
        setField(term16225, term16225.getClass(), "partName", "TuLgwTZsPP");
        setLongField(term16225, term16225.getClass(), "duration", 2287785643837657068L);
        setIntField(term16225, term16225.getClass(), "width", -1112119058);
        setIntField(term16225, term16225.getClass(), "height", 2073858334);
        setBooleanField(term16225, term16225.getClass(), "rotate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCid", argTypes, term16225, args);
    }

};


