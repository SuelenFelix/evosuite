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

public class CachedResource_isCached_5041145791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9401;

    public CachedResource_isCached_5041145791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9401 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term9440 = (Object[]) newArray("java.lang.String", 3);
        setField(term9401, term9401.getClass(), "pattern", "JeZbrwZmsP");
        setField(term9401, term9401.getClass(), "method", "bxyfeicqrK");
        setBooleanField(term9401, term9401.getClass(), "cached", false);
        setBooleanField(term9401, term9401.getClass(), "async", false);
        setField(term9401, term9401.getClass(), "keyLookupType", "vBnWPlsZMk");
        setElement(term9440, 0, "fIZsWucfXz");
        setElement(term9440, 1, "IApvtmfhnq");
        setElement(term9440, 2, "VSaNnhMpRc");
        setField(term9401, term9401.getClass(), "keyLookupHeaders", term9440);
        setField(term9401, term9401.getClass(), "keyLookupClass", "QNjNTLlUaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCached", argTypes, term9401, args);
    }

};


