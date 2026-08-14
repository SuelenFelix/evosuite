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
import java.lang.Integer;

public class BaseWebSocketListener_onClose_162043953614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6318;
     Object term6321;

    public BaseWebSocketListener_onClose_162043953614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6318 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        setField(term6318, term6318.getClass(), "logger", null);
        setField(term6318, term6318.getClass(), "liveRoomData", null);
        setField(term6318, term6318.getClass(), "eventManager", null);
        setField(term6318, term6318.getClass(), "webSocketInterval", null);
        setField(term6318, term6318.getClass(), "scheduledExecutorService", null);
        setField(term6318, term6318.getClass(), "handshakeDataByteArray", null);
        setLongField(term6318, term6318.getClass(), "debugInfoTotal", 0L);
        setLongField(term6318, term6318.getClass(), "debugPingPongTotal", 0L);
        setField(term6318, term6318.getClass(), "danMuParseService", null);
        term6321 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term6321;
        args[2] = null;
        callMethod(klass, "onClose", argTypes, term6318, args);
    }

};


