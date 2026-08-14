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

public class LiveRoomData_getWebsiteType_1444618623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31957;

    public LiveRoomData_getWebsiteType_1444618623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32044 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term32043 = ((Class) term32044).getDeclaredField((String) "Bil");
        ((Field) term32043).setAccessible(true);
        Object enum2 = ((Field) term32043).get((Object) null);
        term31957 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term31957, term31957.getClass(), "saveName", "wNndrIQDbr");
        setField(term31957, term31957.getClass(), "websiteType", enum2);
        setField(term31957, term31957.getClass(), "liveRoomUrl", "JiSIFtJnYv");
        setField(term31957, term31957.getClass(), "liveRoomCode", "wxAHQRVgKc");
        setField(term31957, term31957.getClass(), "liveAnchorName", "bYsZEHeoeV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebsiteType", argTypes, term31957, args);
    }

};


