package com.getindata.connectors.http.internal.table.lookup;

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
import static com.getindata.connectors.http.internal.table.lookup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class LookupQueryInfo_toString_13946395087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11639;

    public LookupQueryInfo_toString_13946395087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11652 = new HashMap();
        HashMap term11662 = new HashMap();
        term11639 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo"));
        setField(term11639, term11639.getClass(), "lookupQuery", "yVMkkQhvmN");
        setField(term11639, term11639.getClass(), "bodyBasedUrlQueryParams", term11652);
        setField(term11639, term11639.getClass(), "pathBasedUrlParams", term11662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.lookup.LookupQueryInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11639, args);
    }

};


