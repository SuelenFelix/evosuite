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

public class VideoPage_setHeight_193603190914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16940;
     Object term16971;

    public VideoPage_setHeight_193603190914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16940 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16940, term16940.getClass(), "cid", 3103198349031409063L);
        setIntField(term16940, term16940.getClass(), "page", 722787672);
        setField(term16940, term16940.getClass(), "from", "MQUTfIiFnh");
        setField(term16940, term16940.getClass(), "partName", "JeyKRznnft");
        setLongField(term16940, term16940.getClass(), "duration", 753095050088595263L);
        setIntField(term16940, term16940.getClass(), "width", 2077491675);
        setIntField(term16940, term16940.getClass(), "height", -1728316609);
        setBooleanField(term16940, term16940.getClass(), "rotate", true);
        term16971 = new Integer(47118909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16971;
        callMethod(klass, "setHeight", argTypes, term16940, args);
    }

};


