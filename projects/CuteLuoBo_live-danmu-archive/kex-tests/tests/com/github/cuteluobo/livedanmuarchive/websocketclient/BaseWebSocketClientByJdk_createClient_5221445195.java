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

public class BaseWebSocketClientByJdk_createClient_5221445195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public BaseWebSocketClientByJdk_createClient_5221445195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk"));
        setField(term55, term55.getClass(), "logger", null);
        setField(term55, term55.getClass(), "webSocketInterval", null);
        setField(term55, term55.getClass(), "intervalSendStringMessage", null);
        setField(term55, term55.getClass(), "intervalSendStringByteArray", null);
        setField(term55, term55.getClass(), "serverUri", null);
        setIntField(term55, term55.getClass(), "intervalSecond", 0);
        setField(term55, term55.getClass(), "scheduledExecutorService", null);
        setIntField(term55, term55.getClass(), "connectTimeout", 0);
        setField(term55, term55.getClass(), "httpHeaders", null);
        setField(term55, term55.getClass(), "httpClient", null);
        setField(term55, term55.getClass(), "wsBuilder", null);
        setField(term55, term55.getClass(), "webSocketCompletableFuture", null);
        setField(term55, term55.getClass(), "webSocket", null);
        setField(term55, term55.getClass(), "httpClientBuilder", null);
        setField(term55, term55.getClass(), "handshakeDataByteArray", null);
        setField(term55, term55.getClass(), "danMuParseService", null);
        setField(term55, term55.getClass(), "eventManager", null);
        setField(term55, term55.getClass(), "liveRoomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketClientByJdk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createClient", argTypes, term55, args);
    }

};


