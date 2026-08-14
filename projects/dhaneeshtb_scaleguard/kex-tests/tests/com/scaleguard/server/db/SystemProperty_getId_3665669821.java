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

public class SystemProperty_getId_3665669821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3728;

    public SystemProperty_getId_3665669821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3728 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term3728, term3728.getClass(), "id", "aWYOWZFyaX");
        setField(term3728, term3728.getClass(), "name", "BRIVNtfUWU");
        setField(term3728, term3728.getClass(), "groupname", "DbiCVtPPCT");
        setField(term3728, term3728.getClass(), "value", "WzFopsaDuG");
        setLongField(term3728, term3728.getClass(), "mts", 5953383087795962419L);
        setLongField(term3728, term3728.getClass(), "uts", 7994303628307559416L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3728, args);
    }

};


