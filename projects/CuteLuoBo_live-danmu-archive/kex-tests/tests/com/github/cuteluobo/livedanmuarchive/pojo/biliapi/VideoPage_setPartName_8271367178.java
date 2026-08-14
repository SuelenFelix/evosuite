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

public class VideoPage_setPartName_8271367178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16608;

    public VideoPage_setPartName_8271367178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16608 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16608, term16608.getClass(), "cid", 2809748481176687920L);
        setIntField(term16608, term16608.getClass(), "page", 1622857008);
        setField(term16608, term16608.getClass(), "from", "RINhPkhhct");
        setField(term16608, term16608.getClass(), "partName", "vjNPcTSqmS");
        setLongField(term16608, term16608.getClass(), "duration", 4012955251407483889L);
        setIntField(term16608, term16608.getClass(), "width", 934338954);
        setIntField(term16608, term16608.getClass(), "height", 598635505);
        setBooleanField(term16608, term16608.getClass(), "rotate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fFhdWuJbdC";
        callMethod(klass, "setPartName", argTypes, term16608, args);
    }

};


