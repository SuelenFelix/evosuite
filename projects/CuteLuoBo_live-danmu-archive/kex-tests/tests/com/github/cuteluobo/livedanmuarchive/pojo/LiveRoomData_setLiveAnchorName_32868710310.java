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

public class LiveRoomData_setLiveAnchorName_32868710310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35154;

    public LiveRoomData_setLiveAnchorName_32868710310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35253 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term35252 = ((Class) term35253).getDeclaredField((String) "Bil");
        ((Field) term35252).setAccessible(true);
        Object enum10 = ((Field) term35252).get((Object) null);
        term35154 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term35154, term35154.getClass(), "saveName", "fzzIOVxKdF");
        setField(term35154, term35154.getClass(), "websiteType", enum10);
        setField(term35154, term35154.getClass(), "liveRoomUrl", "cdvmxZaBEK");
        setField(term35154, term35154.getClass(), "liveRoomCode", "QHYZiyDyPC");
        setField(term35154, term35154.getClass(), "liveAnchorName", "kcHMyiheuH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DGMBBNDEYs";
        callMethod(klass, "setLiveAnchorName", argTypes, term35154, args);
    }

};


