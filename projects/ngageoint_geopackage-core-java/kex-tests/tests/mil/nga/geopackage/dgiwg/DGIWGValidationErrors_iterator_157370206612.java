package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class DGIWGValidationErrors_iterator_157370206612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16428;

    public DGIWGValidationErrors_iterator_157370206612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16430 = new LinkedHashMap();
        Set<Object> term16436 =  ((Map) term16430).keySet();
        LinkedHashSet term16429 = new LinkedHashSet((Collection<? extends Object>) term16436);
        term16428 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term16428, term16428.getClass(), "errors", term16429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term16428, args);
    }

};


