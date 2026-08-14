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
import java.util.HashMap;

public class GraphUtils_1_getAncestors_16845297521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term17;

    public GraphUtils_1_getAncestors_16845297521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        HashMap term7 = new HashMap();
        HashMap term12 = new HashMap();
        term1 = newInstance(Class.forName("au.csiro.fhir.owl.util.GraphUtils$1"));
        setField(term1, term1.getClass(), "val$getPaths", null);
        setField(term1, term1.getClass(), "equivalentsMap", term2);
        setField(term1, term1.getClass(), "ancestorMap", term7);
        setField(term1, term1.getClass(), "parentMap", term12);
        term17 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("au.csiro.fhir.owl.util.GraphUtils$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17;
        callMethod(klass, "getAncestors", argTypes, term1, args);
    }

};


