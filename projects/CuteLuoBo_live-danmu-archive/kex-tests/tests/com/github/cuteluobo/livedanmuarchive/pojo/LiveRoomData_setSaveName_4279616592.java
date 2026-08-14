package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class LiveRoomData_setSaveName_4279616592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31527;

    public LiveRoomData_setSaveName_4279616592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31621 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term31620 = ((Class) term31621).getDeclaredField((String) "Douyu");
        ((Field) term31620).setAccessible(true);
        Object enum1 = ((Field) term31620).get((Object) null);
        term31527 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term31527, term31527.getClass(), "saveName", "bZrrPiMnsr");
        setField(term31527, term31527.getClass(), "websiteType", enum1);
        setField(term31527, term31527.getClass(), "liveRoomUrl", "IeromvfDmz");
        setField(term31527, term31527.getClass(), "liveRoomCode", "xJLHPTRSqe");
        setField(term31527, term31527.getClass(), "liveAnchorName", "OIFZYdbUZz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPablxseTr";
        callMethod(klass, "setSaveName", argTypes, term31527, args);
    }

};


