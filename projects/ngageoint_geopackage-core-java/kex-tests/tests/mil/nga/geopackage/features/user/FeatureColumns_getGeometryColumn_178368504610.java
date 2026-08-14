package mil.nga.geopackage.features.user;

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
import static mil.nga.geopackage.features.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class FeatureColumns_getGeometryColumn_178368504610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;

    public FeatureColumns_getGeometryColumn_178368504610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1349 = new ArrayList();
        HashMap term1354 = new HashMap();
        term1298 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term1324 = (Object[]) newArray("java.lang.String", 2);
        setField(term1298, term1298.getClass(), "geometryColumn", "ytSBIKXogI");
        setIntField(term1298, term1298.getClass(), "geometryIndex", -1456670397);
        setField(term1298, term1298.getClass(), "tableName", "nHXjMycHlU");
        setElement(term1324, 0, "ieCtQFdkii");
        setElement(term1324, 1, "dEnhdmILtU");
        setField(term1298, term1298.getClass(), "columnNames", term1324);
        setField(term1298, term1298.getClass(), "columns", term1349);
        setBooleanField(term1298, term1298.getClass(), "custom", false);
        setField(term1298, term1298.getClass(), "nameToIndex", term1354);
        setIntField(term1298, term1298.getClass(), "pkIndex", 1622346318);
        setBooleanField(term1298, term1298.getClass(), "pkModifiable", false);
        setBooleanField(term1298, term1298.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumn", argTypes, term1298, args);
    }

};


