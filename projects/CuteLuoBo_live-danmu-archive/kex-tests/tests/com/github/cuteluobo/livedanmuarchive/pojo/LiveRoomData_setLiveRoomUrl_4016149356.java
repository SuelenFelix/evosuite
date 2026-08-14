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

public class LiveRoomData_setLiveRoomUrl_4016149356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33493;

    public LiveRoomData_setLiveRoomUrl_4016149356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33587 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term33586 = ((Class) term33587).getDeclaredField((String) "Douyu");
        ((Field) term33586).setAccessible(true);
        Object enum6 = ((Field) term33586).get((Object) null);
        term33493 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term33493, term33493.getClass(), "saveName", "sMiHxgXUuN");
        setField(term33493, term33493.getClass(), "websiteType", enum6);
        setField(term33493, term33493.getClass(), "liveRoomUrl", "oVChCWWDag");
        setField(term33493, term33493.getClass(), "liveRoomCode", "EteTxkDxin");
        setField(term33493, term33493.getClass(), "liveAnchorName", "mKgLwPdYbY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zqykonsLIo";
        callMethod(klass, "setLiveRoomUrl", argTypes, term33493, args);
    }

};


