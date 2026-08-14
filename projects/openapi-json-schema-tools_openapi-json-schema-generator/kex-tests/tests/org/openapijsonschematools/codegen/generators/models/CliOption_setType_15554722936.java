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

public class CliOption_setType_15554722936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;

    public CliOption_setType_15554722936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1630 = new HashMap();
        term1569 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1569, term1569.getClass(), "opt", "Ghbwtircqb");
        setField(term1569, term1569.getClass(), "description", "xrwlQZdwCp");
        setField(term1569, term1569.getClass(), "type", "IDCWpPLRkE");
        setField(term1569, term1569.getClass(), "defaultValue", "nyiiPDVjAc");
        setField(term1569, term1569.getClass(), "optValue", "aKnKipADSo");
        setField(term1569, term1569.getClass(), "enumValues", term1630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setType", argTypes, term1569, args);
    }

};


