package com.getindata.connectors.http.internal.utils.uri;

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
import static com.getindata.connectors.http.internal.utils.uri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NameValuePair_getName_11530927981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;

    public NameValuePair_getName_11530927981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair"));
        setField(term330, term330.getClass(), "name", "hRNSzYYIrc");
        setField(term330, term330.getClass(), "value", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.uri.NameValuePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term330, args);
    }

};


