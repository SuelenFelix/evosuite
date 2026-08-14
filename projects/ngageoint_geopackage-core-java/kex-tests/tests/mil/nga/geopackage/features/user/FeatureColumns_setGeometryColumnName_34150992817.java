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

public class FeatureColumns_setGeometryColumnName_34150992817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;

    public FeatureColumns_setGeometryColumnName_34150992817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1428 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        setField(term1428, term1428.getClass(), "geometryColumn", null);
        setIntField(term1428, term1428.getClass(), "geometryIndex", 0);
        setField(term1428, term1428.getClass(), "tableName", null);
        setField(term1428, term1428.getClass(), "columnNames", null);
        setField(term1428, term1428.getClass(), "columns", null);
        setBooleanField(term1428, term1428.getClass(), "custom", false);
        setField(term1428, term1428.getClass(), "nameToIndex", null);
        setIntField(term1428, term1428.getClass(), "pkIndex", 0);
        setBooleanField(term1428, term1428.getClass(), "pkModifiable", false);
        setBooleanField(term1428, term1428.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeometryColumnName", argTypes, term1428, args);
    }

};


