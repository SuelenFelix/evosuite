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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ComposeHttpStatusCodeChecker_prepareErrorCodes_9407169663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1168;
     Object term1184;

    public ComposeHttpStatusCodeChecker_prepareErrorCodes_9407169663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1170 = new HashMap();
        Set<Object> term1185 =  ((Map) term1170).keySet();
        HashSet term1169 = new HashSet((Collection<? extends Object>) term1185);
        HashMap term1176 = new HashMap();
        Set<Object> term1186 =  ((Map) term1176).keySet();
        HashSet term1175 = new HashSet((Collection<? extends Object>) term1186);
        term1168 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1168, term1168.getClass(), "excludedCodes", term1169);
        setField(term1168, term1168.getClass(), "errorCodes", term1175);
        term1184 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1184;
        callMethod(klass, "prepareErrorCodes", argTypes, term1168, args);
    }

};


