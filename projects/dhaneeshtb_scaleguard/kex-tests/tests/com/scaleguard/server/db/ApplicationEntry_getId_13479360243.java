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

public class ApplicationEntry_getId_13479360243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7776;

    public ApplicationEntry_getId_13479360243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7776 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term7776, term7776.getClass(), "id", "iuCxnHGMoW");
        setField(term7776, term7776.getClass(), "name", "GPSEWEDSTo");
        setField(term7776, term7776.getClass(), "description", "RCOqfVsRHt");
        setLongField(term7776, term7776.getClass(), "mts", -4598158870068953328L);
        setLongField(term7776, term7776.getClass(), "uts", 138235087558060686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7776, args);
    }

};


