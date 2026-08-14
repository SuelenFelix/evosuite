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
import java.util.LinkedHashMap;

public class CliOption_setEnum_197240440514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2669;
     Object term2740;

    public CliOption_setEnum_197240440514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2730 = new HashMap();
        term2669 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term2669, term2669.getClass(), "opt", "JiVRgTZvKc");
        setField(term2669, term2669.getClass(), "description", "XPKmummaqg");
        setField(term2669, term2669.getClass(), "type", "BKLfkLiZTH");
        setField(term2669, term2669.getClass(), "defaultValue", "SPpkrGcPRr");
        setField(term2669, term2669.getClass(), "optValue", "sEccwbJKYE");
        setField(term2669, term2669.getClass(), "enumValues", term2730);
        term2740 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term2740;
        callMethod(klass, "setEnum", argTypes, term2669, args);
    }

};


