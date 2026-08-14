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

public class DGIWGValidate_validateCoordinateReferenceSystem_147714647912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31956;
     Object enum53;

    public DGIWGValidate_validateCoordinateReferenceSystem_147714647912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term31958 = new LinkedHashMap();
        Set<Object> term31985 =  ((Map) term31958).keySet();
        LinkedHashSet term31957 = new LinkedHashSet((Collection<? extends Object>) term31985);
        term31956 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors"));
        setField(term31956, term31956.getClass(), "errors", term31957);
        Class<? extends Object> term31997 = Class.forName((String) "mil.nga.geopackage.contents.ContentsDataType");
        Field term31996 = ((Class) term31997).getDeclaredField((String) "TILES");
        ((Field) term31996).setAccessible(true);
        enum53 = ((Field) term31996).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidate");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystem");
        argTypes[3] = Class.forName("mil.nga.geopackage.contents.ContentsDataType");
        Object[] args = new Object[4];
        args[0] = term31956;
        args[1] = "MIwvgVrhzP";
        args[2] = null;
        args[3] = enum53;
        callMethod(klass, "validateCoordinateReferenceSystem", argTypes, null, args);
    }

};


