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
import java.lang.Boolean;

public class BaseWebSocketListener_onText_71553889310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6302;
     Object term6305;

    public BaseWebSocketListener_onText_71553889310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6302 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        setField(term6302, term6302.getClass(), "logger", null);
        setField(term6302, term6302.getClass(), "liveRoomData", null);
        setField(term6302, term6302.getClass(), "eventManager", null);
        setField(term6302, term6302.getClass(), "webSocketInterval", null);
        setField(term6302, term6302.getClass(), "scheduledExecutorService", null);
        setField(term6302, term6302.getClass(), "handshakeDataByteArray", null);
        setLongField(term6302, term6302.getClass(), "debugInfoTotal", 0L);
        setLongField(term6302, term6302.getClass(), "debugPingPongTotal", 0L);
        setField(term6302, term6302.getClass(), "danMuParseService", null);
        term6305 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term6305;
        callMethod(klass, "onText", argTypes, term6302, args);
    }

};


