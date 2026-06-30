package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class AliasChangeRequest_getEmail_6567737877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;

    public AliasChangeRequest_getEmail_6567737877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334 = new Long(-5476826692763582090L);
        Long term336 = new Long(-872011222785455006L);
        Boolean term338 = new Boolean(true);
        term333 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest"));
        setField(term333, term333.getClass(), "id", term334);
        setField(term333, term333.getClass(), "domainId", term336);
        setField(term333, term333.getClass(), "enabled", term338);
        setField(term333, term333.getClass(), "name", "LQFpaHEwXR");
        setField(term333, term333.getClass(), "email", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term333, args);
    }

};


