package com.getindata.connectors.http.internal.status;

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
import static com.getindata.connectors.http.internal.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_toString_37836645011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3568;

    public ComposeHttpStatusCodeChecker_ComposeHttpStatusCodeCheckerConfig_ComposeHttpStatusCodeCheckerConfigBuilder_toString_37836645011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3568 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder"));
        setField(term3568, term3568.getClass(), "whiteListPrefix", null);
        setField(term3568, term3568.getClass(), "errorCodePrefix", null);
        setField(term3568, term3568.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig$ComposeHttpStatusCodeCheckerConfigBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3568, args);
    }

};


