package org.openapijsonschematools.codegen.generators.models;

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
import static org.openapijsonschematools.codegen.generators.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class CliOption_getOptValue_117385312710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2119;

    public CliOption_getOptValue_117385312710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2180 = new HashMap();
        term2119 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term2119, term2119.getClass(), "opt", "kBdSllIBVz");
        setField(term2119, term2119.getClass(), "description", "TJmVBGfTML");
        setField(term2119, term2119.getClass(), "type", "tPlsykYBqO");
        setField(term2119, term2119.getClass(), "defaultValue", "bLPjGVBhlX");
        setField(term2119, term2119.getClass(), "optValue", "whBvTVIIlC");
        setField(term2119, term2119.getClass(), "enumValues", term2180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptValue", argTypes, term2119, args);
    }

};


