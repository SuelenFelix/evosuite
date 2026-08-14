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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GraphUtils_TransitiveReduction_filterAncestors_13705182591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term323;

    public GraphUtils_TransitiveReduction_filterAncestors_13705182591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = newInstance(Class.forName("java.lang.Object"));
        HashMap term324 = new HashMap();
        Set<Object> term357 =  ((Map) term324).keySet();
        term323 = new HashSet((Collection<? extends Object>) term357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("au.csiro.fhir.owl.util.GraphUtils$TransitiveReduction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term322;
        args[1] = term323;
        callMethod(klass, "filterAncestors", argTypes, null, args);
    }

};


