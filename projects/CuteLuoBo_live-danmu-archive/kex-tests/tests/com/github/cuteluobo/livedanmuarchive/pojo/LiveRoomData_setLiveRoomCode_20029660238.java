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

public class LiveRoomData_setLiveRoomCode_20029660238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34326;

    public LiveRoomData_setLiveRoomCode_20029660238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34418 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term34417 = ((Class) term34418).getDeclaredField((String) "Huya");
        ((Field) term34417).setAccessible(true);
        Object enum8 = ((Field) term34417).get((Object) null);
        term34326 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term34326, term34326.getClass(), "saveName", "NSxzAUSujy");
        setField(term34326, term34326.getClass(), "websiteType", enum8);
        setField(term34326, term34326.getClass(), "liveRoomUrl", "FEezgglqXC");
        setField(term34326, term34326.getClass(), "liveRoomCode", "rvYqMRgiPA");
        setField(term34326, term34326.getClass(), "liveAnchorName", "qOZXeUUmdz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FCovVZHqPx";
        callMethod(klass, "setLiveRoomCode", argTypes, term34326, args);
    }

};


