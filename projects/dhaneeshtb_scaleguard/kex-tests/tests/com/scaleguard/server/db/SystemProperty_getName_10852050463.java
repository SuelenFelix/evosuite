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

public class SystemProperty_getName_10852050463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3932;

    public SystemProperty_getName_10852050463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3932 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term3932, term3932.getClass(), "id", "sQvGcVjdEx");
        setField(term3932, term3932.getClass(), "name", "rLHAoqXgPh");
        setField(term3932, term3932.getClass(), "groupname", "zUlRdimJtU");
        setField(term3932, term3932.getClass(), "value", "vwbEQQNQrx");
        setLongField(term3932, term3932.getClass(), "mts", 2062173786000223358L);
        setLongField(term3932, term3932.getClass(), "uts", -8658027316505137504L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3932, args);
    }

};


