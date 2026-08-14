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

public class DanMuClientEventResult_setLiveRoomData_5639041262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term682;

    public DanMuClientEventResult_setLiveRoomData_5639041262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term769 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term768 = ((Class) term769).getDeclaredField((String) "Douyu");
        ((Field) term768).setAccessible(true);
        Object enum1 = ((Field) term768).get((Object) null);
        Boolean term668 = new Boolean(false);
        term596 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term597 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term597, term597.getClass(), "saveName", "RMFIsYGgne");
        setField(term597, term597.getClass(), "websiteType", enum1);
        setField(term597, term597.getClass(), "liveRoomUrl", "NRdvgJlhkX");
        setField(term597, term597.getClass(), "liveRoomCode", "uuaPigETmJ");
        setField(term597, term597.getClass(), "liveAnchorName", "MxlszYVzRf");
        setField(term596, term596.getClass(), "liveRoomData", term597);
        setField(term596, term596.getClass(), "isWebsocketConnectClose", term668);
        setField(term596, term596.getClass(), "message", "LQFpaHEwXR");
        Class<? extends Object> term1116 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1115 = ((Class) term1116).getDeclaredField((String) "Bil");
        ((Field) term1115).setAccessible(true);
        Object enum2 = ((Field) term1115).get((Object) null);
        term682 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term682, term682.getClass(), "saveName", "oVcInYnLWB");
        setField(term682, term682.getClass(), "websiteType", enum2);
        setField(term682, term682.getClass(), "liveRoomUrl", "aJlieCFVtF");
        setField(term682, term682.getClass(), "liveRoomCode", "ZiaGIbnzTs");
        setField(term682, term682.getClass(), "liveAnchorName", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Object[] args = new Object[1];
        args[0] = term682;
        callMethod(klass, "setLiveRoomData", argTypes, term596, args);
    }

};


