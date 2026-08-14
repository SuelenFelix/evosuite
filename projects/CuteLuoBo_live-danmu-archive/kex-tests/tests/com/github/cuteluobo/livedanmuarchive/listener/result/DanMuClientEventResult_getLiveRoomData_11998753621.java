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

public class DanMuClientEventResult_getLiveRoomData_11998753621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public DanMuClientEventResult_getLiveRoomData_11998753621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term266 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term265 = ((Class) term266).getDeclaredField((String) "Bil");
        ((Field) term265).setAccessible(true);
        Object enum0 = ((Field) term265).get((Object) null);
        Boolean term172 = new Boolean(false);
        term95 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term96 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term96, term96.getClass(), "saveName", "jJCZpVmanW");
        setField(term96, term96.getClass(), "websiteType", enum0);
        setField(term96, term96.getClass(), "liveRoomUrl", "EGtDIRbSSb");
        setField(term96, term96.getClass(), "liveRoomCode", "SzjVpOQTyS");
        setField(term96, term96.getClass(), "liveAnchorName", "MjGYSRKTNF");
        setField(term95, term95.getClass(), "liveRoomData", term96);
        setField(term95, term95.getClass(), "isWebsocketConnectClose", term172);
        setField(term95, term95.getClass(), "message", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLiveRoomData", argTypes, term95, args);
    }

};


