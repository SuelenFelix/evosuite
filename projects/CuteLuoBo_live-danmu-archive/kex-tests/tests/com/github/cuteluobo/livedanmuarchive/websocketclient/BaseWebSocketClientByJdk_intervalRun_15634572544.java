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

public class BaseWebSocketClientByJdk_intervalRun_15634572544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public BaseWebSocketClientByJdk_intervalRun_15634572544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk"));
        setField(term52, term52.getClass(), "logger", null);
        setField(term52, term52.getClass(), "webSocketInterval", null);
        setField(term52, term52.getClass(), "intervalSendStringMessage", null);
        setField(term52, term52.getClass(), "intervalSendStringByteArray", null);
        setField(term52, term52.getClass(), "serverUri", null);
        setIntField(term52, term52.getClass(), "intervalSecond", 0);
        setField(term52, term52.getClass(), "scheduledExecutorService", null);
        setIntField(term52, term52.getClass(), "connectTimeout", 0);
        setField(term52, term52.getClass(), "httpHeaders", null);
        setField(term52, term52.getClass(), "httpClient", null);
        setField(term52, term52.getClass(), "wsBuilder", null);
        setField(term52, term52.getClass(), "webSocketCompletableFuture", null);
        setField(term52, term52.getClass(), "webSocket", null);
        setField(term52, term52.getClass(), "httpClientBuilder", null);
        setField(term52, term52.getClass(), "handshakeDataByteArray", null);
        setField(term52, term52.getClass(), "danMuParseService", null);
        setField(term52, term52.getClass(), "eventManager", null);
        setField(term52, term52.getClass(), "liveRoomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "intervalRun", argTypes, term52, args);
    }

};


