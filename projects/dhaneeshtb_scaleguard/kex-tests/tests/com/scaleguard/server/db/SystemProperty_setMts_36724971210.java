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

public class SystemProperty_setMts_36724971210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4635;
     Object term4686;

    public SystemProperty_setMts_36724971210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4635 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4635, term4635.getClass(), "id", "nhoHrZfnIN");
        setField(term4635, term4635.getClass(), "name", "ZkMALXpEAZ");
        setField(term4635, term4635.getClass(), "groupname", "tXfQjSqDzN");
        setField(term4635, term4635.getClass(), "value", "BjugTaMcxJ");
        setLongField(term4635, term4635.getClass(), "mts", 7862575738391801707L);
        setLongField(term4635, term4635.getClass(), "uts", 50358265865610362L);
        term4686 = new Long(5510783420697225605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4686;
        callMethod(klass, "setMts", argTypes, term4635, args);
    }

};


