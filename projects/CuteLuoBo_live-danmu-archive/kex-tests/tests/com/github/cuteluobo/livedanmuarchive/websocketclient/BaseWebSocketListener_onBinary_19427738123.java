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
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BaseWebSocketListener_onBinary_19427738123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396;
     Object term1477;

    public BaseWebSocketListener_onBinary_19427738123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1490 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1489 = ((Class) term1490).getDeclaredField((String) "Douyu");
        ((Field) term1489).setAccessible(true);
        Object enum3 = ((Field) term1489).get((Object) null);
        term1396 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term1397 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term1468 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term1470 = (byte[]) newByteArray(4);
        setField(term1396, term1396.getClass(), "logger", null);
        setField(term1397, term1397.getClass(), "saveName", "tbcdzjIfER");
        setField(term1397, term1397.getClass(), "websiteType", enum3);
        setField(term1397, term1397.getClass(), "liveRoomUrl", "HyxfbSQYBe");
        setField(term1397, term1397.getClass(), "liveRoomCode", "pCTimMblYc");
        setField(term1397, term1397.getClass(), "liveAnchorName", "hNxWaHcfhY");
        setField(term1396, term1396.getClass(), "liveRoomData", term1397);
        setField(term1396, term1396.getClass(), "eventManager", null);
        setField(term1468, term1468.getClass(), "logger", null);
        setField(term1468, term1468.getClass(), "intervalRun", null);
        setIntField(term1468, term1468.getClass(), "intervalTime", 1227103734);
        setField(term1396, term1396.getClass(), "webSocketInterval", term1468);
        setField(term1396, term1396.getClass(), "scheduledExecutorService", null);
        setByteElement(term1470, 0, (byte) 83);
        setByteElement(term1470, 1, (byte) 74);
        setByteElement(term1470, 2, (byte) -71);
        setByteElement(term1470, 3, (byte) 49);
        setField(term1396, term1396.getClass(), "handshakeDataByteArray", term1470);
        setLongField(term1396, term1396.getClass(), "debugInfoTotal", 4872422362414183754L);
        setLongField(term1396, term1396.getClass(), "debugPingPongTotal", 6811161968424632369L);
        setField(term1396, term1396.getClass(), "danMuParseService", null);
        term1477 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = Class.forName("java.nio.ByteBuffer");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1477;
        callMethod(klass, "onBinary", argTypes, term1396, args);
    }

};


