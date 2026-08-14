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

public class BaseWebSocketListener_onPing_189603997512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6312;

    public BaseWebSocketListener_onPing_189603997512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6312 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        setField(term6312, term6312.getClass(), "logger", null);
        setField(term6312, term6312.getClass(), "liveRoomData", null);
        setField(term6312, term6312.getClass(), "eventManager", null);
        setField(term6312, term6312.getClass(), "webSocketInterval", null);
        setField(term6312, term6312.getClass(), "scheduledExecutorService", null);
        setField(term6312, term6312.getClass(), "handshakeDataByteArray", null);
        setLongField(term6312, term6312.getClass(), "debugInfoTotal", 0L);
        setLongField(term6312, term6312.getClass(), "debugPingPongTotal", 0L);
        setField(term6312, term6312.getClass(), "danMuParseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "onPing", argTypes, term6312, args);
    }

};


