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
import java.lang.String;
import java.util.ArrayList;

public class DGIWGValidationErrors_add_9044661474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15889;
     Object term15897;

    public DGIWGValidationErrors_add_9044661474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15891 = new LinkedHashMap();
        Set<Object> term16043 =  ((Map) term15891).keySet();
        LinkedHashSet term15890 = new LinkedHashSet((Collection<? extends Object>) term16043);
        term15889 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term15889, term15889.getClass(), "errors", term15890);
        Class<? extends Object> term16085 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term16084 = ((Class) term16085).getDeclaredField((String) "EXTENSIONS_NOT_ALLOWED");
        ((Field) term16084).setAccessible(true);
        Object enum39 = ((Field) term16084).get((Object) null);
        Object term16023 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16023, term16023.getClass(), "column", "");
        setField(term16023, term16023.getClass(), "value", "");
        Object term16026 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16026, term16026.getClass(), "column", "");
        setField(term16026, term16026.getClass(), "value", "");
        Object term16029 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16029, term16029.getClass(), "column", "");
        setField(term16029, term16029.getClass(), "value", "");
        Object term16032 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16032, term16032.getClass(), "column", "");
        setField(term16032, term16032.getClass(), "value", "");
        Object term16035 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16035, term16035.getClass(), "column", "");
        setField(term16035, term16035.getClass(), "value", "");
        Object term16038 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term16038, term16038.getClass(), "column", "");
        setField(term16038, term16038.getClass(), "value", "");
        ArrayList term16021 = new ArrayList();
        ((ArrayList) term16021).add(term16023);
        ((ArrayList) term16021).add(term16026);
        ((ArrayList) term16021).add(term16029);
        ((ArrayList) term16021).add(term16032);
        ((ArrayList) term16021).add(term16035);
        ((ArrayList) term16021).add(term16038);
        term15897 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term15897, term15897.getClass(), "table", "vKQukfbJUd");
        setField(term15897, term15897.getClass(), "column", "lFRJFUMVbx");
        setField(term15897, term15897.getClass(), "value", "sZdUNdggUW");
        setField(term15897, term15897.getClass(), "constraint", "OqbwYQfvAe");
        setField(term15897, term15897.getClass(), "requirement", enum39);
        setField(term15897, term15897.getClass(), "primaryKeys", term16021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Object[] args = new Object[1];
        args[0] = term15897;
        callMethod(klass, "add", argTypes, term15889, args);
    }

};


