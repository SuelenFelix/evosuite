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

public class CachedResource_getKeyLookupType_3418577579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10647;

    public CachedResource_getKeyLookupType_3418577579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10647 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term10686 = (Object[]) newArray("java.lang.String", 5);
        setField(term10647, term10647.getClass(), "pattern", "EULDrUNQvw");
        setField(term10647, term10647.getClass(), "method", "BtvAvsJSei");
        setBooleanField(term10647, term10647.getClass(), "cached", true);
        setBooleanField(term10647, term10647.getClass(), "async", true);
        setField(term10647, term10647.getClass(), "keyLookupType", "vqnBkkxoIa");
        setElement(term10686, 0, "bycpZjxXFn");
        setElement(term10686, 1, "jQWttOAiwL");
        setElement(term10686, 2, "DzKFxEuEEC");
        setElement(term10686, 3, "CAMnvfDLJL");
        setElement(term10686, 4, "mfHtgSbdjD");
        setField(term10647, term10647.getClass(), "keyLookupHeaders", term10686);
        setField(term10647, term10647.getClass(), "keyLookupClass", "cmuaUiHMVL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyLookupType", argTypes, term10647, args);
    }

};


