package com.github.cuteluobo.livedanmuarchive.manager;

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
import static com.github.cuteluobo.livedanmuarchive.manager.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class DanMuClientEventManager_notify_10457876093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768;
     Object enum2;
     Object term796;

    public DanMuClientEventManager_notify_10457876093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term769 = new HashMap();
        term768 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager"));
        setField(term768, term768.getClass(), "listenerMap", term769);
        Class<? extends Object> term888 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        Field term887 = ((Class) term888).getDeclaredField((String) "CLOSE");
        ((Field) term887).setAccessible(true);
        enum2 = ((Field) term887).get((Object) null);
        Class<? extends Object> term1309 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term1308 = ((Class) term1309).getDeclaredField((String) "Bil");
        ((Field) term1308).setAccessible(true);
        Object enum3 = ((Field) term1308).get((Object) null);
        Boolean term873 = new Boolean(false);
        term796 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult"));
        Object term797 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term797, term797.getClass(), "saveName", "PAEBtnZtTD");
        setField(term797, term797.getClass(), "websiteType", enum3);
        setField(term797, term797.getClass(), "liveRoomUrl", "sjlJAEtRrb");
        setField(term797, term797.getClass(), "liveRoomCode", "MuLcgQHgqz");
        setField(term797, term797.getClass(), "liveAnchorName", "xxtlPwDYFs");
        setField(term796, term796.getClass(), "liveRoomData", term797);
        setField(term796, term796.getClass(), "isWebsocketConnectClose", term873);
        setField(term796, term796.getClass(), "message", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.result.DanMuClientEventResult");
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = term796;
        callMethod(klass, "notify", argTypes, term768, args);
    }

};


