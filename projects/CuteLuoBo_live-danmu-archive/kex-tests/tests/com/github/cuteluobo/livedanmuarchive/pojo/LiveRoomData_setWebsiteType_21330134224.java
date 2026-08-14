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

public class LiveRoomData_setWebsiteType_21330134224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32364;
     Object enum4;

    public LiveRoomData_setWebsiteType_21330134224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32466 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term32465 = ((Class) term32466).getDeclaredField((String) "Douyu");
        ((Field) term32465).setAccessible(true);
        Object enum3 = ((Field) term32465).get((Object) null);
        term32364 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term32364, term32364.getClass(), "saveName", "IwvwrQylib");
        setField(term32364, term32364.getClass(), "websiteType", enum3);
        setField(term32364, term32364.getClass(), "liveRoomUrl", "ZWJgSttNjg");
        setField(term32364, term32364.getClass(), "liveRoomCode", "LQTIjJLkXH");
        setField(term32364, term32364.getClass(), "liveAnchorName", "RvkBwedFKx");
        Class<? extends Object> term32793 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term32792 = ((Class) term32793).getDeclaredField((String) "Huya");
        ((Field) term32792).setAccessible(true);
        enum4 = ((Field) term32792).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "setWebsiteType", argTypes, term32364, args);
    }

};


