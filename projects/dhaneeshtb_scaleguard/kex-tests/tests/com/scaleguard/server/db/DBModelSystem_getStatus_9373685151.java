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

public class DBModelSystem_getStatus_9373685151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;

    public DBModelSystem_getStatus_9373685151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1986 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term1986, term1986.getClass(), "id", "PHvxnGHptP");
        setField(term1986, term1986.getClass(), "name", "TimdotUuNC");
        setField(term1986, term1986.getClass(), "groupId", "PkWMRdJcBb");
        setField(term1986, term1986.getClass(), "status", "jSpAteRute");
        setField(term1986, term1986.getClass(), "payload", "swZVeJAxjt");
        setLongField(term1986, term1986.getClass(), "mts", 6855071767938501807L);
        setLongField(term1986, term1986.getClass(), "uts", -5892135042702373494L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term1986, args);
    }

};


