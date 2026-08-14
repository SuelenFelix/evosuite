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

public class VideoPage_getPartName_18814881397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16557;

    public VideoPage_getPartName_18814881397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16557 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16557, term16557.getClass(), "cid", -769824408235898287L);
        setIntField(term16557, term16557.getClass(), "page", -658524954);
        setField(term16557, term16557.getClass(), "from", "GjdWUoUSyA");
        setField(term16557, term16557.getClass(), "partName", "YEkxWsWaUl");
        setLongField(term16557, term16557.getClass(), "duration", -2828343143039517941L);
        setIntField(term16557, term16557.getClass(), "width", -2009613557);
        setIntField(term16557, term16557.getClass(), "height", 654195547);
        setBooleanField(term16557, term16557.getClass(), "rotate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartName", argTypes, term16557, args);
    }

};


