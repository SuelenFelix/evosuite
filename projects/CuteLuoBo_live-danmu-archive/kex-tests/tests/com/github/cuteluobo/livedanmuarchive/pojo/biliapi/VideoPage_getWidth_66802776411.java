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

public class VideoPage_getWidth_66802776411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16785;

    public VideoPage_getWidth_66802776411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16785 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16785, term16785.getClass(), "cid", 7010148136855890340L);
        setIntField(term16785, term16785.getClass(), "page", -1911972560);
        setField(term16785, term16785.getClass(), "from", "eRYlSLwtvV");
        setField(term16785, term16785.getClass(), "partName", "duOyJsARTD");
        setLongField(term16785, term16785.getClass(), "duration", -6771377873268167033L);
        setIntField(term16785, term16785.getClass(), "width", -642716895);
        setIntField(term16785, term16785.getClass(), "height", 1743398246);
        setBooleanField(term16785, term16785.getClass(), "rotate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidth", argTypes, term16785, args);
    }

};


