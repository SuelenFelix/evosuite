package com.github.cuteluobo.livedanmuarchive.websocketclient;

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
import static com.github.cuteluobo.livedanmuarchive.websocketclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BaseWebSocketListener_init_14883536100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term140;
     Object term142;

    public BaseWebSocketListener_init_14883536100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term227 = ((Class) term228).getDeclaredField((String) "Bil");
        ((Field) term227).setAccessible(true);
        Object enum0 = ((Field) term227).get((Object) null);
        term64 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term64, term64.getClass(), "saveName", "EGtDIRbSSb");
        setField(term64, term64.getClass(), "websiteType", enum0);
        setField(term64, term64.getClass(), "liveRoomUrl", "SzjVpOQTyS");
        setField(term64, term64.getClass(), "liveRoomCode", "MjGYSRKTNF");
        setField(term64, term64.getClass(), "liveAnchorName", "hRNSzYYIrc");
        term140 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        setField(term140, term140.getClass(), "logger", null);
        setField(term140, term140.getClass(), "intervalRun", null);
        setIntField(term140, term140.getClass(), "intervalTime", -616727354);
        term142 = (byte[]) newByteArray(5);
        setByteElement(term142, 0, (byte) 47);
        setByteElement(term142, 1, (byte) 48);
        setByteElement(term142, 2, (byte) 89);
        setByteElement(term142, 3, (byte) 75);
        setByteElement(term142, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.EventManager");
        argTypes[2] = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval");
        argTypes[3] = Class.forName("java.util.concurrent.ScheduledExecutorService");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = Class.forName("com.github.cuteluobo.livedanmuarchive.service.DanMuParseService");
        Object[] args = new Object[6];
        args[0] = term64;
        args[1] = null;
        args[2] = term140;
        args[3] = null;
        args[4] = term142;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


