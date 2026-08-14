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
import java.lang.Integer;

public class BaseWebSocketListener_onClose_16204395366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656;
     Object term2735;

    public BaseWebSocketListener_onClose_16204395366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2760 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term2759 = ((Class) term2760).getDeclaredField((String) "Douyu");
        ((Field) term2759).setAccessible(true);
        Object enum6 = ((Field) term2759).get((Object) null);
        term2656 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener"));
        Object term2657 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        Object term2728 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.WebSocketInterval"));
        byte[] term2730 = (byte[]) newByteArray(2);
        setField(term2656, term2656.getClass(), "logger", null);
        setField(term2657, term2657.getClass(), "saveName", "TEParAifyi");
        setField(term2657, term2657.getClass(), "websiteType", enum6);
        setField(term2657, term2657.getClass(), "liveRoomUrl", "OWDIEULEFu");
        setField(term2657, term2657.getClass(), "liveRoomCode", "dWRymuLBtr");
        setField(term2657, term2657.getClass(), "liveAnchorName", "AijpHYOFuy");
        setField(term2656, term2656.getClass(), "liveRoomData", term2657);
        setField(term2656, term2656.getClass(), "eventManager", null);
        setField(term2728, term2728.getClass(), "logger", null);
        setField(term2728, term2728.getClass(), "intervalRun", null);
        setIntField(term2728, term2728.getClass(), "intervalTime", -522618178);
        setField(term2656, term2656.getClass(), "webSocketInterval", term2728);
        setField(term2656, term2656.getClass(), "scheduledExecutorService", null);
        setByteElement(term2730, 0, (byte) -16);
        setByteElement(term2730, 1, (byte) -112);
        setField(term2656, term2656.getClass(), "handshakeDataByteArray", term2730);
        setLongField(term2656, term2656.getClass(), "debugInfoTotal", -4325723315152823407L);
        setLongField(term2656, term2656.getClass(), "debugPingPongTotal", 2535595959091595249L);
        setField(term2656, term2656.getClass(), "danMuParseService", null);
        term2735 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.websocketclient.BaseWebSocketListener");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.http.WebSocket");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2735;
        args[2] = "SbAoxhfrkn";
        callMethod(klass, "onClose", argTypes, term2656, args);
    }

};


