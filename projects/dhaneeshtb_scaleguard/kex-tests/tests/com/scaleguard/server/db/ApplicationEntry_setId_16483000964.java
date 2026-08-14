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

public class ApplicationEntry_setId_16483000964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7845;

    public ApplicationEntry_setId_16483000964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7845 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term7845, term7845.getClass(), "id", "TSyCeEZPaT");
        setField(term7845, term7845.getClass(), "name", "JeZFtaqkzW");
        setField(term7845, term7845.getClass(), "description", "vOVuNSCCLe");
        setLongField(term7845, term7845.getClass(), "mts", 5381386339318883012L);
        setLongField(term7845, term7845.getClass(), "uts", -1333707622307134180L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzeqPnzpnt";
        callMethod(klass, "setId", argTypes, term7845, args);
    }

};


