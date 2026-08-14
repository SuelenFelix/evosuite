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

public class BaseWebSocketListener_onText_7155388932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;
     Object term1060;

    public BaseWebSocketListener_onText_7155388932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1073 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1072 = ((Class) term1073).getDeclaredField((String) "Bil");
        ((Field) term1072).setAccessible(true);
        Object enum2 = ((Field) term1072).get((Object) null);
        term975 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term976 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term1052 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term1054 = (byte[]) newByteArray(3);
        setField(term975, term975.getClass(), "logger", null);
        setField(term976, term976.getClass(), "saveName", "LQFpaHEwXR");
        setField(term976, term976.getClass(), "websiteType", enum2);
        setField(term976, term976.getClass(), "liveRoomUrl", "oVcInYnLWB");
        setField(term976, term976.getClass(), "liveRoomCode", "aJlieCFVtF");
        setField(term976, term976.getClass(), "liveAnchorName", "ZiaGIbnzTs");
        setField(term975, term975.getClass(), "liveRoomData", term976);
        setField(term975, term975.getClass(), "eventManager", null);
        setField(term1052, term1052.getClass(), "logger", null);
        setField(term1052, term1052.getClass(), "intervalRun", null);
        setIntField(term1052, term1052.getClass(), "intervalTime", -2038273078);
        setField(term975, term975.getClass(), "webSocketInterval", term1052);
        setField(term975, term975.getClass(), "scheduledExecutorService", null);
        setByteElement(term1054, 0, (byte) 79);
        setByteElement(term1054, 1, (byte) -119);
        setByteElement(term1054, 2, (byte) -66);
        setField(term975, term975.getClass(), "handshakeDataByteArray", term1054);
        setLongField(term975, term975.getClass(), "debugInfoTotal", 5270370404989704783L);
        setLongField(term975, term975.getClass(), "debugPingPongTotal", 7411271909051562686L);
        setField(term975, term975.getClass(), "danMuParseService", null);
        term1060 = new Boolean(false);
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
        args[2] = term1060;
        callMethod(klass, "onText", argTypes, term975, args);
    }

};


