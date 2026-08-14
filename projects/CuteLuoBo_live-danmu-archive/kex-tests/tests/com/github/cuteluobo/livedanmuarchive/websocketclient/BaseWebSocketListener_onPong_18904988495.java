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

public class BaseWebSocketListener_onPong_18904988495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public BaseWebSocketListener_onPong_18904988495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2330 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term2329 = ((Class) term2330).getDeclaredField((String) "Bil");
        ((Field) term2329).setAccessible(true);
        Object enum5 = ((Field) term2329).get((Object) null);
        term2231 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term2232 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term2308 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term2310 = (byte[]) newByteArray(6);
        setField(term2231, term2231.getClass(), "logger", null);
        setField(term2232, term2232.getClass(), "saveName", "vrQLuWIDJX");
        setField(term2232, term2232.getClass(), "websiteType", enum5);
        setField(term2232, term2232.getClass(), "liveRoomUrl", "flxyYxBRtu");
        setField(term2232, term2232.getClass(), "liveRoomCode", "OclPbYPkcH");
        setField(term2232, term2232.getClass(), "liveAnchorName", "IoAlmYsBwc");
        setField(term2231, term2231.getClass(), "liveRoomData", term2232);
        setField(term2231, term2231.getClass(), "eventManager", null);
        setField(term2308, term2308.getClass(), "logger", null);
        setField(term2308, term2308.getClass(), "intervalRun", null);
        setIntField(term2308, term2308.getClass(), "intervalTime", 1725571209);
        setField(term2231, term2231.getClass(), "webSocketInterval", term2308);
        setField(term2231, term2231.getClass(), "scheduledExecutorService", null);
        setByteElement(term2310, 0, (byte) 67);
        setByteElement(term2310, 1, (byte) 78);
        setByteElement(term2310, 2, (byte) 87);
        setByteElement(term2310, 3, (byte) 121);
        setByteElement(term2310, 4, (byte) -99);
        setByteElement(term2310, 5, (byte) -2);
        setField(term2231, term2231.getClass(), "handshakeDataByteArray", term2310);
        setLongField(term2231, term2231.getClass(), "debugInfoTotal", -2813493605142626659L);
        setLongField(term2231, term2231.getClass(), "debugPingPongTotal", -8885298608300233488L);
        setField(term2231, term2231.getClass(), "danMuParseService", null);
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
        callMethod(klass, "onPong", argTypes, term2231, args);
    }

};


