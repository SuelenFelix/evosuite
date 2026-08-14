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

public class BaseWebSocketListener_init_14883536108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public BaseWebSocketListener_init_14883536108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


