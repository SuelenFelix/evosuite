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

public class ReferenceEntity_getOrdinal_8363020817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public ReferenceEntity_getOrdinal_8363020817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term396 = new Long(6811161968424632369L);
        Integer term422 = new Integer(-1955890973);
        term395 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term424 = newInstance(Class.forName("java.time.Instant"));
        Object term427 = newInstance(Class.forName("java.time.Instant"));
        Object term430 = newInstance(Class.forName("java.time.Instant"));
        setField(term395, term395.getClass(), "id", term396);
        setField(term395, term395.getClass(), "code", "oVcInYnLWB");
        setField(term395, term395.getClass(), "label", "aJlieCFVtF");
        setField(term395, term395.getClass(), "ordinal", term422);
        setLongField(term424, term424.getClass(), "seconds", 1668569229L);
        setIntField(term424, term424.getClass(), "nanos", 825000000);
        setField(term395, term395.getClass(), "effectiveAt", term424);
        setLongField(term427, term427.getClass(), "seconds", 1725122217L);
        setIntField(term427, term427.getClass(), "nanos", 647000000);
        setField(term395, term395.getClass(), "expiresAt", term427);
        setLongField(term430, term430.getClass(), "seconds", 1550698994L);
        setIntField(term430, term430.getClass(), "nanos", 689000000);
        setField(term395, term395.getClass(), "createdAt", term430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrdinal", argTypes, term395, args);
    }

};


