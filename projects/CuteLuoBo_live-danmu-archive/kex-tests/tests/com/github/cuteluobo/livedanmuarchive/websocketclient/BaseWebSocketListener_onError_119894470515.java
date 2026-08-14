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

public class BaseWebSocketListener_onError_119894470515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6323;

    public BaseWebSocketListener_onError_119894470515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6323 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        setField(term6323, term6323.getClass(), "logger", null);
        setField(term6323, term6323.getClass(), "liveRoomData", null);
        setField(term6323, term6323.getClass(), "eventManager", null);
        setField(term6323, term6323.getClass(), "webSocketInterval", null);
        setField(term6323, term6323.getClass(), "scheduledExecutorService", null);
        setField(term6323, term6323.getClass(), "handshakeDataByteArray", null);
        setLongField(term6323, term6323.getClass(), "debugInfoTotal", 0L);
        setLongField(term6323, term6323.getClass(), "debugPingPongTotal", 0L);
        setField(term6323, term6323.getClass(), "danMuParseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "onError", argTypes, term6323, args);
    }

};


