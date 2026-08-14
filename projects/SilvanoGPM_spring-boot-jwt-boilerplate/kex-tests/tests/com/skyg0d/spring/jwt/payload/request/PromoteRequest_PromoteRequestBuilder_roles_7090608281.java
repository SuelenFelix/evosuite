package com.skyg0d.spring.jwt.payload.request;

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
import static com.skyg0d.spring.jwt.payload.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PromoteRequest_PromoteRequestBuilder_roles_7090608281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;
     Object term397;

    public PromoteRequest_PromoteRequestBuilder_roles_7090608281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term369 = new HashMap();
        Set<Object> term408 =  ((Map) term369).keySet();
        HashSet term368 = new HashSet((Collection<? extends Object>) term408);
        term367 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.request.PromoteRequest$PromoteRequestBuilder"));
        setField(term367, term367.getClass(), "roles", term368);
        setField(term367, term367.getClass(), "userId", "RkybSrpybU");
        HashMap term398 = new HashMap();
        Set<Object> term419 =  ((Map) term398).keySet();
        term397 = new HashSet((Collection<? extends Object>) term419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.request.PromoteRequest$PromoteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term397;
        callMethod(klass, "roles", argTypes, term367, args);
    }

};


