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

public class DanMuClientEventManager_subscribe_15907178251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;

    public DanMuClientEventManager_subscribe_15907178251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager"));
        setField(term1, term1.getClass(), "listenerMap", term2);
        Class<? extends Object> term57 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        Field term56 = ((Class) term57).getDeclaredField((String) "CLOSE");
        ((Field) term56).setAccessible(true);
        enum0 = ((Field) term56).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.EventListener");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = null;
        callMethod(klass, "subscribe", argTypes, term1, args);
    }

};


