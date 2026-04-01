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

public class ReferenceEntity_getExpiresAt_208707624711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632;

    public ReferenceEntity_getExpiresAt_208707624711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term633 = new Long(-8885298608300233488L);
        Integer term659 = new Integer(-522618178);
        term632 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term661 = newInstance(Class.forName("java.time.Instant"));
        Object term664 = newInstance(Class.forName("java.time.Instant"));
        Object term667 = newInstance(Class.forName("java.time.Instant"));
        setField(term632, term632.getClass(), "id", term633);
        setField(term632, term632.getClass(), "code", "xOEqzGAmDU");
        setField(term632, term632.getClass(), "label", "eZFUvlxvGV");
        setField(term632, term632.getClass(), "ordinal", term659);
        setLongField(term661, term661.getClass(), "seconds", 1691868468L);
        setIntField(term661, term661.getClass(), "nanos", 367000000);
        setField(term632, term632.getClass(), "effectiveAt", term661);
        setLongField(term664, term664.getClass(), "seconds", 1442370534L);
        setIntField(term664, term664.getClass(), "nanos", 632000000);
        setField(term632, term632.getClass(), "expiresAt", term664);
        setLongField(term667, term667.getClass(), "seconds", 1659994192L);
        setIntField(term667, term667.getClass(), "nanos", 918000000);
        setField(term632, term632.getClass(), "createdAt", term667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiresAt", argTypes, term632, args);
    }

};


