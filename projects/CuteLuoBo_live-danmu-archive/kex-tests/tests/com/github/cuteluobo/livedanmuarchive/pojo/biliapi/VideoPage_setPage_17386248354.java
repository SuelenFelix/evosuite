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

public class VideoPage_setPage_17386248354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16380;
     Object term16411;

    public VideoPage_setPage_17386248354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16380 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16380, term16380.getClass(), "cid", -421166328269063791L);
        setIntField(term16380, term16380.getClass(), "page", 2136158480);
        setField(term16380, term16380.getClass(), "from", "TbiwoiebNe");
        setField(term16380, term16380.getClass(), "partName", "laTITSWZuc");
        setLongField(term16380, term16380.getClass(), "duration", 4811527754205378980L);
        setIntField(term16380, term16380.getClass(), "width", 2118747457);
        setIntField(term16380, term16380.getClass(), "height", 1868344256);
        setBooleanField(term16380, term16380.getClass(), "rotate", false);
        term16411 = new Integer(1857693976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16411;
        callMethod(klass, "setPage", argTypes, term16380, args);
    }

};


