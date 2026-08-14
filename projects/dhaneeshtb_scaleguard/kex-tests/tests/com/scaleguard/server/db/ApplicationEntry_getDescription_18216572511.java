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

public class ApplicationEntry_getDescription_18216572511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7616;

    public ApplicationEntry_getDescription_18216572511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7616 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term7616, term7616.getClass(), "id", "IBpaxltauX");
        setField(term7616, term7616.getClass(), "name", "hePqROaplw");
        setField(term7616, term7616.getClass(), "description", "PJcSNDruWd");
        setLongField(term7616, term7616.getClass(), "mts", -3948863953565024517L);
        setLongField(term7616, term7616.getClass(), "uts", -6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term7616, args);
    }

};


