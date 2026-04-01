package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class TransactionalEntity_getId_11378169571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4168;

    public TransactionalEntity_getId_11378169571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4169 = new Long(-2177368829816872572L);
        Integer term4209 = new Integer(-505439934);
        term4168 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4223 = newInstance(Class.forName("java.time.Instant"));
        Object term4238 = newInstance(Class.forName("java.time.Instant"));
        setField(term4168, term4168.getClass(), "id", term4169);
        setField(term4168, term4168.getClass(), "referenceId", "2e851f4d-33c7-4799-94e9-2d9130ffaf67");
        setField(term4168, term4168.getClass(), "version", term4209);
        setField(term4168, term4168.getClass(), "createdBy", "WXMWFDGcLB");
        setLongField(term4223, term4223.getClass(), "seconds", 1560286398L);
        setIntField(term4223, term4223.getClass(), "nanos", 870000000);
        setField(term4168, term4168.getClass(), "createdAt", term4223);
        setField(term4168, term4168.getClass(), "updatedBy", "wKWbJssZuG");
        setLongField(term4238, term4238.getClass(), "seconds", 1791294437L);
        setIntField(term4238, term4238.getClass(), "nanos", 21000000);
        setField(term4168, term4168.getClass(), "updatedAt", term4238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4168, args);
    }

};


