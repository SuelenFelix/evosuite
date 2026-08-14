package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SystemProperty_getUts_19762270211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4728;

    public SystemProperty_getUts_19762270211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4728 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4728, term4728.getClass(), "id", "vGiuZVPJNH");
        setField(term4728, term4728.getClass(), "name", "tlzpzIjMib");
        setField(term4728, term4728.getClass(), "groupname", "AZdLeSugwv");
        setField(term4728, term4728.getClass(), "value", "RMsXuyzKJV");
        setLongField(term4728, term4728.getClass(), "mts", 6005241913654469005L);
        setLongField(term4728, term4728.getClass(), "uts", -1983291584002806658L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term4728, args);
    }

};


