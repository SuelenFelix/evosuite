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

public class FeatureColumns_getGeometryColumn_178368504621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;

    public FeatureColumns_getGeometryColumn_178368504621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1454 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        setField(term1454, term1454.getClass(), "geometryColumn", null);
        setIntField(term1454, term1454.getClass(), "geometryIndex", 0);
        setField(term1454, term1454.getClass(), "tableName", null);
        setField(term1454, term1454.getClass(), "columnNames", null);
        setField(term1454, term1454.getClass(), "columns", null);
        setBooleanField(term1454, term1454.getClass(), "custom", false);
        setField(term1454, term1454.getClass(), "nameToIndex", null);
        setIntField(term1454, term1454.getClass(), "pkIndex", 0);
        setBooleanField(term1454, term1454.getClass(), "pkModifiable", false);
        setBooleanField(term1454, term1454.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumn", argTypes, term1454, args);
    }

};


