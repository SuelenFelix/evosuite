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

public class DanMuClientEventManager_unsubscribe_2449340746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640;

    public DanMuClientEventManager_unsubscribe_2449340746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1640 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager"));
        setField(term1640, term1640.getClass(), "listenerMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.DanMuClientEventManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.enums.DanMuClientEventType");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.listener.EventListener");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "unsubscribe", argTypes, term1640, args);
    }

};


