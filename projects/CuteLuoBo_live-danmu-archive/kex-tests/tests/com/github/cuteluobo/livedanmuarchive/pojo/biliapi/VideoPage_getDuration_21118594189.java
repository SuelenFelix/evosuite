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

public class VideoPage_getDuration_21118594189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16681;

    public VideoPage_getDuration_21118594189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16681 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16681, term16681.getClass(), "cid", -4058686252500969842L);
        setIntField(term16681, term16681.getClass(), "page", -944986533);
        setField(term16681, term16681.getClass(), "from", "JlgLIHPabR");
        setField(term16681, term16681.getClass(), "partName", "LHnkeoNwHq");
        setLongField(term16681, term16681.getClass(), "duration", 6077991958696417121L);
        setIntField(term16681, term16681.getClass(), "width", 1894454926);
        setIntField(term16681, term16681.getClass(), "height", 1415142780);
        setBooleanField(term16681, term16681.getClass(), "rotate", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term16681, args);
    }

};


