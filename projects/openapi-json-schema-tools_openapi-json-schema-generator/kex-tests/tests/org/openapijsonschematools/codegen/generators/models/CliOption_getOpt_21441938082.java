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

public class CliOption_getOpt_21441938082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;

    public CliOption_getOpt_21441938082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1124 = new HashMap();
        term1063 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1063, term1063.getClass(), "opt", "SzjVpOQTyS");
        setField(term1063, term1063.getClass(), "description", "MjGYSRKTNF");
        setField(term1063, term1063.getClass(), "type", "hRNSzYYIrc");
        setField(term1063, term1063.getClass(), "defaultValue", "RMFIsYGgne");
        setField(term1063, term1063.getClass(), "optValue", "NRdvgJlhkX");
        setField(term1063, term1063.getClass(), "enumValues", term1124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpt", argTypes, term1063, args);
    }

};


