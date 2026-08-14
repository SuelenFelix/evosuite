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
import java.lang.Integer;

public class DGIWGValidationErrors_getError_56760014811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16417;
     Object term16425;

    public DGIWGValidationErrors_getError_56760014811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16419 = new LinkedHashMap();
        Set<Object> term16427 =  ((Map) term16419).keySet();
        LinkedHashSet term16418 = new LinkedHashSet((Collection<? extends Object>) term16427);
        term16417 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term16417, term16417.getClass(), "errors", term16418);
        term16425 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16425;
        callMethod(klass, "getError", argTypes, term16417, args);
    }

};


