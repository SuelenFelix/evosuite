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

public class LiveRoomData_getSaveName_20143040991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31051;

    public LiveRoomData_getSaveName_20143040991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31207 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term31206 = ((Class) term31207).getDeclaredField((String) "Bil");
        ((Field) term31206).setAccessible(true);
        Object enum0 = ((Field) term31206).get((Object) null);
        term31051 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term31051, term31051.getClass(), "saveName", "nUDhadopHE");
        setField(term31051, term31051.getClass(), "websiteType", enum0);
        setField(term31051, term31051.getClass(), "liveRoomUrl", "vLrTnQTIPg");
        setField(term31051, term31051.getClass(), "liveRoomCode", "GsXvLZCFtf");
        setField(term31051, term31051.getClass(), "liveAnchorName", "JqSCTBGSUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveName", argTypes, term31051, args);
    }

};


