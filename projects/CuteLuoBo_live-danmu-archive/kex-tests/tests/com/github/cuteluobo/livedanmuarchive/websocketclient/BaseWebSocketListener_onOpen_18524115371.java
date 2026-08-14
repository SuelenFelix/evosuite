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

public class BaseWebSocketListener_onOpen_18524115371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553;

    public BaseWebSocketListener_onOpen_18524115371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term645 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term644 = ((Class) term645).getDeclaredField((String) "Douyu");
        ((Field) term644).setAccessible(true);
        Object enum1 = ((Field) term644).get((Object) null);
        term553 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term554 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term625 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term627 = (byte[]) newByteArray(4);
        setField(term553, term553.getClass(), "logger", null);
        setField(term554, term554.getClass(), "saveName", "RMFIsYGgne");
        setField(term554, term554.getClass(), "websiteType", enum1);
        setField(term554, term554.getClass(), "liveRoomUrl", "NRdvgJlhkX");
        setField(term554, term554.getClass(), "liveRoomCode", "uuaPigETmJ");
        setField(term554, term554.getClass(), "liveAnchorName", "MxlszYVzRf");
        setField(term553, term553.getClass(), "liveRoomData", term554);
        setField(term553, term553.getClass(), "eventManager", null);
        setField(term625, term625.getClass(), "logger", null);
        setField(term625, term625.getClass(), "intervalRun", null);
        setIntField(term625, term625.getClass(), "intervalTime", -1955890973);
        setField(term553, term553.getClass(), "webSocketInterval", term625);
        setField(term553, term553.getClass(), "scheduledExecutorService", null);
        setByteElement(term627, 0, (byte) -58);
        setByteElement(term627, 1, (byte) -29);
        setByteElement(term627, 2, (byte) -54);
        setByteElement(term627, 3, (byte) -10);
        setField(term553, term553.getClass(), "handshakeDataByteArray", term627);
        setLongField(term553, term553.getClass(), "debugInfoTotal", -8257434502486459194L);
        setLongField(term553, term553.getClass(), "debugPingPongTotal", -8400487765614892086L);
        setField(term553, term553.getClass(), "danMuParseService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onOpen", argTypes, term553, args);
    }

};


