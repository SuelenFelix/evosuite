package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CachedResource_setKeyLookupType_178229775710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10849;

    public CachedResource_setKeyLookupType_178229775710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10849 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term10888 = (Object[]) newArray("java.lang.String", 5);
        setField(term10849, term10849.getClass(), "pattern", "xjoSGPWUgu");
        setField(term10849, term10849.getClass(), "method", "uzmqjnOUXu");
        setBooleanField(term10849, term10849.getClass(), "cached", true);
        setBooleanField(term10849, term10849.getClass(), "async", false);
        setField(term10849, term10849.getClass(), "keyLookupType", "xeyjTOCOJb");
        setElement(term10888, 0, "DGRqjjdhzy");
        setElement(term10888, 1, "lQFkjJUPAR");
        setElement(term10888, 2, "BsuVlGUUjV");
        setElement(term10888, 3, "bHHjfDCntT");
        setElement(term10888, 4, "sEphiduvkv");
        setField(term10849, term10849.getClass(), "keyLookupHeaders", term10888);
        setField(term10849, term10849.getClass(), "keyLookupClass", "PbLgCSAHce");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NWldOLAbqk";
        callMethod(klass, "setKeyLookupType", argTypes, term10849, args);
    }

};


