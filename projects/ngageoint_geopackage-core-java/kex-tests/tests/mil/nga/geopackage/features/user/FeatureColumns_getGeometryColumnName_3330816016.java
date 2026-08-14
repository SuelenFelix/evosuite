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

public class FeatureColumns_getGeometryColumnName_3330816016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1422;

    public FeatureColumns_getGeometryColumnName_3330816016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1422 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        setField(term1422, term1422.getClass(), "geometryColumn", null);
        setIntField(term1422, term1422.getClass(), "geometryIndex", 0);
        setField(term1422, term1422.getClass(), "tableName", null);
        setField(term1422, term1422.getClass(), "columnNames", null);
        setField(term1422, term1422.getClass(), "columns", null);
        setBooleanField(term1422, term1422.getClass(), "custom", false);
        setField(term1422, term1422.getClass(), "nameToIndex", null);
        setIntField(term1422, term1422.getClass(), "pkIndex", 0);
        setBooleanField(term1422, term1422.getClass(), "pkModifiable", false);
        setBooleanField(term1422, term1422.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumnName", argTypes, term1422, args);
    }

};


