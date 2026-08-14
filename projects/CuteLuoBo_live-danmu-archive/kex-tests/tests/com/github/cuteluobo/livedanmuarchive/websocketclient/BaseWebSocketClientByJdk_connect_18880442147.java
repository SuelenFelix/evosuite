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

public class BaseWebSocketClientByJdk_connect_18880442147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public BaseWebSocketClientByJdk_connect_18880442147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk"));
        setField(term61, term61.getClass(), "logger", null);
        setField(term61, term61.getClass(), "webSocketInterval", null);
        setField(term61, term61.getClass(), "intervalSendStringMessage", null);
        setField(term61, term61.getClass(), "intervalSendStringByteArray", null);
        setField(term61, term61.getClass(), "serverUri", null);
        setIntField(term61, term61.getClass(), "intervalSecond", 0);
        setField(term61, term61.getClass(), "scheduledExecutorService", null);
        setIntField(term61, term61.getClass(), "connectTimeout", 0);
        setField(term61, term61.getClass(), "httpHeaders", null);
        setField(term61, term61.getClass(), "httpClient", null);
        setField(term61, term61.getClass(), "wsBuilder", null);
        setField(term61, term61.getClass(), "webSocketCompletableFuture", null);
        setField(term61, term61.getClass(), "webSocket", null);
        setField(term61, term61.getClass(), "httpClientBuilder", null);
        setField(term61, term61.getClass(), "handshakeDataByteArray", null);
        setField(term61, term61.getClass(), "danMuParseService", null);
        setField(term61, term61.getClass(), "eventManager", null);
        setField(term61, term61.getClass(), "liveRoomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "connect", argTypes, term61, args);
    }

};


