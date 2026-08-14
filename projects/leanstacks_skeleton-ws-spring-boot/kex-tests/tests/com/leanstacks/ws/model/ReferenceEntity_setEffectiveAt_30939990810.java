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

public class ReferenceEntity_setEffectiveAt_30939990810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term609;

    public ReferenceEntity_setEffectiveAt_30939990810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term572 = new Long(-2813493605142626659L);
        Integer term598 = new Integer(1725571209);
        term571 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term600 = newInstance(Class.forName("java.time.Instant"));
        Object term603 = newInstance(Class.forName("java.time.Instant"));
        Object term606 = newInstance(Class.forName("java.time.Instant"));
        setField(term571, term571.getClass(), "id", term572);
        setField(term571, term571.getClass(), "code", "hNxWaHcfhY");
        setField(term571, term571.getClass(), "label", "RkybSrpybU");
        setField(term571, term571.getClass(), "ordinal", term598);
        setLongField(term600, term600.getClass(), "seconds", 1739417792L);
        setIntField(term600, term600.getClass(), "nanos", 956000000);
        setField(term571, term571.getClass(), "effectiveAt", term600);
        setLongField(term603, term603.getClass(), "seconds", 1329640267L);
        setIntField(term603, term603.getClass(), "nanos", 573000000);
        setField(term571, term571.getClass(), "expiresAt", term603);
        setLongField(term606, term606.getClass(), "seconds", 1334853104L);
        setIntField(term606, term606.getClass(), "nanos", 718000000);
        setField(term571, term571.getClass(), "createdAt", term606);
        term609 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term609, term609.getClass(), "seconds", 1496859828L);
        setIntField(term609, term609.getClass(), "nanos", 764000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term609;
        callMethod(klass, "setEffectiveAt", argTypes, term571, args);
    }

};


