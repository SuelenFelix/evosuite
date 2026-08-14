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

public class VideoPage_setWidth_127240472612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16836;
     Object term16867;

    public VideoPage_setWidth_127240472612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16836 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16836, term16836.getClass(), "cid", 1278107327214302894L);
        setIntField(term16836, term16836.getClass(), "page", -934658823);
        setField(term16836, term16836.getClass(), "from", "xPnOHsNlyc");
        setField(term16836, term16836.getClass(), "partName", "OTSPWPJefj");
        setLongField(term16836, term16836.getClass(), "duration", 3104349415269466587L);
        setIntField(term16836, term16836.getClass(), "width", 1632177303);
        setIntField(term16836, term16836.getClass(), "height", -802592348);
        setBooleanField(term16836, term16836.getClass(), "rotate", true);
        term16867 = new Integer(-1576584269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16867;
        callMethod(klass, "setWidth", argTypes, term16836, args);
    }

};


