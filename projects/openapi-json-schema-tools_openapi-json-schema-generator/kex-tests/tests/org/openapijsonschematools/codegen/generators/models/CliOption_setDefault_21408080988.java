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

public class CliOption_setDefault_21408080988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1833;

    public CliOption_setDefault_21408080988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1894 = new HashMap();
        term1833 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1833, term1833.getClass(), "opt", "nGKItKLYNC");
        setField(term1833, term1833.getClass(), "description", "UiUYnPrcCi");
        setField(term1833, term1833.getClass(), "type", "UoYtihxVaS");
        setField(term1833, term1833.getClass(), "defaultValue", "JDswTTCZHV");
        setField(term1833, term1833.getClass(), "optValue", "onpbIeEKoi");
        setField(term1833, term1833.getClass(), "enumValues", term1894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MLqYREekMl";
        callMethod(klass, "setDefault", argTypes, term1833, args);
    }

};


