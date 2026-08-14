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

public class DGIWGValidationErrors_add_2169101806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16363;
     Object term16371;

    public DGIWGValidationErrors_add_2169101806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16365 = new LinkedHashMap();
        Set<Object> term16379 =  ((Map) term16365).keySet();
        LinkedHashSet term16364 = new LinkedHashSet((Collection<? extends Object>) term16379);
        term16363 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term16363, term16363.getClass(), "errors", term16364);
        LinkedHashMap term16373 = new LinkedHashMap();
        Set<Object> term16380 =  ((Map) term16373).keySet();
        LinkedHashSet term16372 = new LinkedHashSet((Collection<? extends Object>) term16380);
        term16371 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term16371, term16371.getClass(), "errors", term16372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Object[] args = new Object[1];
        args[0] = term16371;
        callMethod(klass, "add", argTypes, term16363, args);
    }

};


