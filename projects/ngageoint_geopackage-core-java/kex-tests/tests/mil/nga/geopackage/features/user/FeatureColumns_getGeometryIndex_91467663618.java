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

public class FeatureColumns_getGeometryIndex_91467663618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1434;

    public FeatureColumns_getGeometryIndex_91467663618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1434 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        setField(term1434, term1434.getClass(), "geometryColumn", null);
        setIntField(term1434, term1434.getClass(), "geometryIndex", 0);
        setField(term1434, term1434.getClass(), "tableName", null);
        setField(term1434, term1434.getClass(), "columnNames", null);
        setField(term1434, term1434.getClass(), "columns", null);
        setBooleanField(term1434, term1434.getClass(), "custom", false);
        setField(term1434, term1434.getClass(), "nameToIndex", null);
        setIntField(term1434, term1434.getClass(), "pkIndex", 0);
        setBooleanField(term1434, term1434.getClass(), "pkModifiable", false);
        setBooleanField(term1434, term1434.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryIndex", argTypes, term1434, args);
    }

};


