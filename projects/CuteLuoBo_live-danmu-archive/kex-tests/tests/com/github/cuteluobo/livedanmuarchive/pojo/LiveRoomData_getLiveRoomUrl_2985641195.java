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

public class LiveRoomData_getLiveRoomUrl_2985641195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33086;

    public LiveRoomData_getLiveRoomUrl_2985641195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33173 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term33172 = ((Class) term33173).getDeclaredField((String) "Bil");
        ((Field) term33172).setAccessible(true);
        Object enum5 = ((Field) term33172).get((Object) null);
        term33086 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term33086, term33086.getClass(), "saveName", "DYzWJljbaE");
        setField(term33086, term33086.getClass(), "websiteType", enum5);
        setField(term33086, term33086.getClass(), "liveRoomUrl", "idwbHVHUcz");
        setField(term33086, term33086.getClass(), "liveRoomCode", "sWJHIWZMuX");
        setField(term33086, term33086.getClass(), "liveAnchorName", "PwMdJRwzDW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLiveRoomUrl", argTypes, term33086, args);
    }

};


