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

public class BaseWebSocketClientByJdk_setProxy_6395510086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public BaseWebSocketClientByJdk_setProxy_6395510086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk"));
        setField(term58, term58.getClass(), "logger", null);
        setField(term58, term58.getClass(), "webSocketInterval", null);
        setField(term58, term58.getClass(), "intervalSendStringMessage", null);
        setField(term58, term58.getClass(), "intervalSendStringByteArray", null);
        setField(term58, term58.getClass(), "serverUri", null);
        setIntField(term58, term58.getClass(), "intervalSecond", 0);
        setField(term58, term58.getClass(), "scheduledExecutorService", null);
        setIntField(term58, term58.getClass(), "connectTimeout", 0);
        setField(term58, term58.getClass(), "httpHeaders", null);
        setField(term58, term58.getClass(), "httpClient", null);
        setField(term58, term58.getClass(), "wsBuilder", null);
        setField(term58, term58.getClass(), "webSocketCompletableFuture", null);
        setField(term58, term58.getClass(), "webSocket", null);
        setField(term58, term58.getClass(), "httpClientBuilder", null);
        setField(term58, term58.getClass(), "handshakeDataByteArray", null);
        setField(term58, term58.getClass(), "danMuParseService", null);
        setField(term58, term58.getClass(), "eventManager", null);
        setField(term58, term58.getClass(), "liveRoomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.InetSocketAddress");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProxy", argTypes, term58, args);
    }

};


