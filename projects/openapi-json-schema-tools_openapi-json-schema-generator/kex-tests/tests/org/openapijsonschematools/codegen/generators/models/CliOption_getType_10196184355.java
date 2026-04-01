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

public class CliOption_getType_10196184355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;

    public CliOption_getType_10196184355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1509 = new HashMap();
        term1448 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1448, term1448.getClass(), "opt", "IoAlmYsBwc");
        setField(term1448, term1448.getClass(), "description", "TEParAifyi");
        setField(term1448, term1448.getClass(), "type", "OWDIEULEFu");
        setField(term1448, term1448.getClass(), "defaultValue", "dWRymuLBtr");
        setField(term1448, term1448.getClass(), "optValue", "AijpHYOFuy");
        setField(term1448, term1448.getClass(), "enumValues", term1509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1448, args);
    }

};


