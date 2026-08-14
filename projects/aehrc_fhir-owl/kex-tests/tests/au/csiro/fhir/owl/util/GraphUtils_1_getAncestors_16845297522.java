package au.csiro.fhir.owl.util;

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
import static au.csiro.fhir.owl.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GraphUtils_1_getAncestors_16845297522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;

    public GraphUtils_1_getAncestors_16845297522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("au.csiro.fhir.owl.util.GraphUtils$1"));
        setField(term18, term18.getClass(), "val$getPaths", null);
        setField(term18, term18.getClass(), "equivalentsMap", null);
        setField(term18, term18.getClass(), "ancestorMap", null);
        setField(term18, term18.getClass(), "parentMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("au.csiro.fhir.owl.util.GraphUtils$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAncestors", argTypes, term18, args);
    }

};


