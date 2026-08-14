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
import java.lang.Integer;

public class ComposeHttpStatusCodeChecker_isErrorCode_9530698391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;
     Object term1082;

    public ComposeHttpStatusCodeChecker_isErrorCode_9530698391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1054 = new HashMap();
        Set<Object> term1084 =  ((Map) term1054).keySet();
        HashSet term1053 = new HashSet((Collection<? extends Object>) term1084);
        HashMap term1077 = new HashMap();
        Set<Object> term1085 =  ((Map) term1077).keySet();
        HashSet term1076 = new HashSet((Collection<? extends Object>) term1085);
        term1052 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1052, term1052.getClass(), "excludedCodes", term1053);
        setField(term1052, term1052.getClass(), "errorCodes", term1076);
        term1082 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1082;
        callMethod(klass, "isErrorCode", argTypes, term1052, args);
    }

};


