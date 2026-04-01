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

public class CliOption_getDefault_13293270747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1712;

    public CliOption_getDefault_13293270747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1773 = new HashMap();
        term1712 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1712, term1712.getClass(), "opt", "hxCBltsObl");
        setField(term1712, term1712.getClass(), "description", "BndsHwAFMv");
        setField(term1712, term1712.getClass(), "type", "GzFkzHGYFt");
        setField(term1712, term1712.getClass(), "defaultValue", "tShwQLRGNe");
        setField(term1712, term1712.getClass(), "optValue", "LvtrsXUliU");
        setField(term1712, term1712.getClass(), "enumValues", term1773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefault", argTypes, term1712, args);
    }

};


