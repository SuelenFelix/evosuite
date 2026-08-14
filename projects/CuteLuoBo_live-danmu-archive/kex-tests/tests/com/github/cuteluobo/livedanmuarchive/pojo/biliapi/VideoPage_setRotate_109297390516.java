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
import java.lang.Boolean;

public class VideoPage_setRotate_109297390516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17044;
     Object term17075;

    public VideoPage_setRotate_109297390516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17044 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term17044, term17044.getClass(), "cid", -3231440836116263235L);
        setIntField(term17044, term17044.getClass(), "page", -40335961);
        setField(term17044, term17044.getClass(), "from", "gSAtqakaLY");
        setField(term17044, term17044.getClass(), "partName", "taPBiMFNEZ");
        setLongField(term17044, term17044.getClass(), "duration", 8010417010297313651L);
        setIntField(term17044, term17044.getClass(), "width", 175343605);
        setIntField(term17044, term17044.getClass(), "height", 1050853183);
        setBooleanField(term17044, term17044.getClass(), "rotate", false);
        term17075 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17075;
        callMethod(klass, "setRotate", argTypes, term17044, args);
    }

};


