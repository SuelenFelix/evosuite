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

public class BaseWebSocketListener_onPing_18960399754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;

    public BaseWebSocketListener_onPing_18960399754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1907 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1906 = ((Class) term1907).getDeclaredField((String) "Huya");
        ((Field) term1906).setAccessible(true);
        Object enum4 = ((Field) term1906).get((Object) null);
        term1820 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term1821 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term1890 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term1892 = (byte[]) newByteArray(1);
        setField(term1820, term1820.getClass(), "logger", null);
        setField(term1821, term1821.getClass(), "saveName", "RkybSrpybU");
        setField(term1821, term1821.getClass(), "websiteType", enum4);
        setField(term1821, term1821.getClass(), "liveRoomUrl", "xOEqzGAmDU");
        setField(term1821, term1821.getClass(), "liveRoomCode", "eZFUvlxvGV");
        setField(term1821, term1821.getClass(), "liveAnchorName", "BYqFIqCKAV");
        setField(term1820, term1820.getClass(), "liveRoomData", term1821);
        setField(term1820, term1820.getClass(), "eventManager", null);
        setField(term1890, term1890.getClass(), "logger", null);
        setField(term1890, term1890.getClass(), "intervalRun", null);
        setIntField(term1890, term1890.getClass(), "intervalTime", -1339778481);
        setField(term1820, term1820.getClass(), "webSocketInterval", term1890);
        setField(term1820, term1820.getClass(), "scheduledExecutorService", null);
        setByteElement(term1892, 0, (byte) -54);
        setField(term1820, term1820.getClass(), "handshakeDataByteArray", term1892);
        setLongField(term1820, term1820.getClass(), "debugInfoTotal", -7237588299778557629L);
        setLongField(term1820, term1820.getClass(), "debugPingPongTotal", 6967924379644551255L);
        setField(term1820, term1820.getClass(), "danMuParseService", null);
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
        callMethod(klass, "onPing", argTypes, term1820, args);
    }

};


