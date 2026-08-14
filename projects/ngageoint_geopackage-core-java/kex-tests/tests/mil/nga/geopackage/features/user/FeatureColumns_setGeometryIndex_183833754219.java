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
import java.lang.Integer;

public class FeatureColumns_setGeometryIndex_183833754219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440;
     Object term1446;

    public FeatureColumns_setGeometryIndex_183833754219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1440 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        setField(term1440, term1440.getClass(), "geometryColumn", null);
        setIntField(term1440, term1440.getClass(), "geometryIndex", 0);
        setField(term1440, term1440.getClass(), "tableName", null);
        setField(term1440, term1440.getClass(), "columnNames", null);
        setField(term1440, term1440.getClass(), "columns", null);
        setBooleanField(term1440, term1440.getClass(), "custom", false);
        setField(term1440, term1440.getClass(), "nameToIndex", null);
        setIntField(term1440, term1440.getClass(), "pkIndex", 0);
        setBooleanField(term1440, term1440.getClass(), "pkModifiable", false);
        setBooleanField(term1440, term1440.getClass(), "valueValidation", false);
        term1446 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1446;
        callMethod(klass, "setGeometryIndex", argTypes, term1440, args);
    }

};


