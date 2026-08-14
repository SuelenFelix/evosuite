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
import java.lang.Long;

public class DBModelSystem_setUts_84087738429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;
     Object term3726;

    public DBModelSystem_setUts_84087738429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3723, term3723.getClass(), "id", null);
        setField(term3723, term3723.getClass(), "name", null);
        setField(term3723, term3723.getClass(), "groupId", null);
        setField(term3723, term3723.getClass(), "status", null);
        setField(term3723, term3723.getClass(), "payload", null);
        setLongField(term3723, term3723.getClass(), "mts", 0L);
        setLongField(term3723, term3723.getClass(), "uts", 0L);
        term3726 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3726;
        callMethod(klass, "setUts", argTypes, term3723, args);
    }

};


