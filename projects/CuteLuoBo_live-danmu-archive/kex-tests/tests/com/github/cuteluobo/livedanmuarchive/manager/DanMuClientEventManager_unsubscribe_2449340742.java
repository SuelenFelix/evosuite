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

public class DanMuClientEventManager_unsubscribe_2449340742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;
     Object enum1;

    public DanMuClientEventManager_unsubscribe_2449340742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term399 = new HashMap();
        term398 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager"));
        setField(term398, term398.getClass(), "listenerMap", term399);
        Class<? extends Object> term427 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        Field term426 = ((Class) term427).getDeclaredField((String) "ERROR");
        ((Field) term426).setAccessible(true);
        enum1 = ((Field) term426).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.EventListener");
        Object[] args = new Object[2];
        args[0] = enum1;
        args[1] = null;
        callMethod(klass, "unsubscribe", argTypes, term398, args);
    }

};


