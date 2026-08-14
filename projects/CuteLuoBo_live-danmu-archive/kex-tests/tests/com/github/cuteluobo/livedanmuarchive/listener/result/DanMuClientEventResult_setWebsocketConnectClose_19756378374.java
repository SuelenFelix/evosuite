package com.github.cuteluobo.livedanmuarchive.listener.result;

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
import static com.github.cuteluobo.livedanmuarchive.listener.result.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class DanMuClientEventResult_setWebsocketConnectClose_19756378374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869;
     Object term1953;

    public DanMuClientEventResult_setWebsocketConnectClose_19756378374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1966 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1965 = ((Class) term1966).getDeclaredField((String) "Huya");
        ((Field) term1965).setAccessible(true);
        Object enum4 = ((Field) term1965).get((Object) null);
        Boolean term1939 = new Boolean(false);
        term1869 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term1870 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term1870, term1870.getClass(), "saveName", "eZFUvlxvGV");
        setField(term1870, term1870.getClass(), "websiteType", enum4);
        setField(term1870, term1870.getClass(), "liveRoomUrl", "BYqFIqCKAV");
        setField(term1870, term1870.getClass(), "liveRoomCode", "vrQLuWIDJX");
        setField(term1870, term1870.getClass(), "liveAnchorName", "flxyYxBRtu");
        setField(term1869, term1869.getClass(), "liveRoomData", term1870);
        setField(term1869, term1869.getClass(), "isWebsocketConnectClose", term1939);
        setField(term1869, term1869.getClass(), "message", "OclPbYPkcH");
        term1953 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1953;
        callMethod(klass, "setWebsocketConnectClose", argTypes, term1869, args);
    }

};


