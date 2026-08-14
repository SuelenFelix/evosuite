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

public class LiveRoomData_getLiveRoomCode_10086251997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33923;

    public LiveRoomData_getLiveRoomCode_10086251997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34003 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term34002 = ((Class) term34003).getDeclaredField((String) "Huya");
        ((Field) term34002).setAccessible(true);
        Object enum7 = ((Field) term34002).get((Object) null);
        term33923 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term33923, term33923.getClass(), "saveName", "KoPzTuvIeK");
        setField(term33923, term33923.getClass(), "websiteType", enum7);
        setField(term33923, term33923.getClass(), "liveRoomUrl", "SMoWUILIhn");
        setField(term33923, term33923.getClass(), "liveRoomCode", "SvSKSCjgTM");
        setField(term33923, term33923.getClass(), "liveAnchorName", "UFxnRbWtog");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLiveRoomCode", argTypes, term33923, args);
    }

};


