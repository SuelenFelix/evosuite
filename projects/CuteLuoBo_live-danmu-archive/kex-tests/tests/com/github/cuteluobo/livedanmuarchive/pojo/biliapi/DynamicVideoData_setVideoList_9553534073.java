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
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class DynamicVideoData_setVideoList_9553534073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17234;
     Object term17240;

    public DynamicVideoData_setVideoList_9553534073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17235 = new ArrayList();
        term17234 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.DynamicVideoData"));
        setField(term17234, term17234.getClass(), "videoList", term17235);
        setLongField(term17234, term17234.getClass(), "offsetId", -412186147449928821L);
        term17240 = new LinkedList();
        ((LinkedList) term17240).add((Object)null);
        ((LinkedList) term17240).add((Object)null);
        ((LinkedList) term17240).add((Object)null);
        ((LinkedList) term17240).add((Object)null);
        ((LinkedList) term17240).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.DynamicVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term17240;
        callMethod(klass, "setVideoList", argTypes, term17234, args);
    }

};


