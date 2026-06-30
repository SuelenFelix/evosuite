package com.kv.webflux.logging.provider;

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
import static com.kv.webflux.logging.provider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReqIdProvider_createFromLogId_11583737362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;
     Object term264;

    public ReqIdProvider_createFromLogId_11583737362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251 = newInstance(Class.forName("com.kv.webflux.logging.provider.ReqIdProvider"));
        term264 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term279 = (Object[]) newArray("java.lang.String", 3);
        Object[] term317 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term264, term264.getClass(), "logRequestId", true);
        setField(term264, term264.getClass(), "requestIdPrefix", "MxlszYVzRf");
        setBooleanField(term264, term264.getClass(), "logHeaders", true);
        setElement(term279, 0, "LQFpaHEwXR");
        setElement(term279, 1, "oVcInYnLWB");
        setElement(term279, 2, "aJlieCFVtF");
        setField(term264, term264.getClass(), "maskedHeaders", term279);
        setBooleanField(term264, term264.getClass(), "logCookies", true);
        setElement(term317, 0, "ZiaGIbnzTs");
        setElement(term317, 1, "tbcdzjIfER");
        setElement(term317, 2, "HyxfbSQYBe");
        setElement(term317, 3, "pCTimMblYc");
        setField(term264, term264.getClass(), "maskedCookies", term317);
        setBooleanField(term264, term264.getClass(), "logBody", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.provider.ReqIdProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = term264;
        callMethod(klass, "createFromLogId", argTypes, term251, args);
    }

};


