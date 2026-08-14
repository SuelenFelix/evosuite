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

public class SystemProperty_setValue_12868192488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4431;

    public SystemProperty_setValue_12868192488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4431 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4431, term4431.getClass(), "id", "OqbwYQfvAe");
        setField(term4431, term4431.getClass(), "name", "tRxZafjqIx");
        setField(term4431, term4431.getClass(), "groupname", "DhjNLmRMCu");
        setField(term4431, term4431.getClass(), "value", "PgPzMSEjjX");
        setLongField(term4431, term4431.getClass(), "mts", 682356318767179819L);
        setLongField(term4431, term4431.getClass(), "uts", -7291743527973326814L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wzsPSPcRdj";
        callMethod(klass, "setValue", argTypes, term4431, args);
    }

};


