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

public class LiveRoomData_getSaveName_201430409912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35583;

    public LiveRoomData_getSaveName_201430409912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35583 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term35583, term35583.getClass(), "saveName", null);
        setField(term35583, term35583.getClass(), "websiteType", null);
        setField(term35583, term35583.getClass(), "liveRoomUrl", null);
        setField(term35583, term35583.getClass(), "liveRoomCode", null);
        setField(term35583, term35583.getClass(), "liveAnchorName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaveName", argTypes, term35583, args);
    }

};


