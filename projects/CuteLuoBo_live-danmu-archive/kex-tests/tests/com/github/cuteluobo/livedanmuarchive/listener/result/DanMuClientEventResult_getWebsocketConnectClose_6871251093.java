package com.github.cuteluobo.livedanmuarchive.listener.result;

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
import static com.github.cuteluobo.livedanmuarchive.listener.result.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class DanMuClientEventResult_getWebsocketConnectClose_6871251093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1436;

    public DanMuClientEventResult_getWebsocketConnectClose_6871251093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1533 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1532 = ((Class) term1533).getDeclaredField((String) "Douyu");
        ((Field) term1532).setAccessible(true);
        Object enum3 = ((Field) term1532).get((Object) null);
        Boolean term1508 = new Boolean(false);
        term1436 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term1437 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term1437, term1437.getClass(), "saveName", "HyxfbSQYBe");
        setField(term1437, term1437.getClass(), "websiteType", enum3);
        setField(term1437, term1437.getClass(), "liveRoomUrl", "pCTimMblYc");
        setField(term1437, term1437.getClass(), "liveRoomCode", "hNxWaHcfhY");
        setField(term1437, term1437.getClass(), "liveAnchorName", "RkybSrpybU");
        setField(term1436, term1436.getClass(), "liveRoomData", term1437);
        setField(term1436, term1436.getClass(), "isWebsocketConnectClose", term1508);
        setField(term1436, term1436.getClass(), "message", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebsocketConnectClose", argTypes, term1436, args);
    }

};


