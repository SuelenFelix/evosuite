package com.usantatecla.ustumlserver.domain.services.parsers;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectParser_createPackage_14693310983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25951;

    public ProjectParser_createPackage_14693310983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25951 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.ProjectParser"));
        setField(term25951, term25951.getClass(), "members", null);
        setField(term25951, term25951.getClass(), "account", null);
        setField(term25951, term25951.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.ProjectParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPackage", argTypes, term25951, args);
    }

};


