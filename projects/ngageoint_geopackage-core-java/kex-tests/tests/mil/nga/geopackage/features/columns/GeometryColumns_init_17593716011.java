package mil.nga.geopackage.features.columns;

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
import static mil.nga.geopackage.features.columns.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GeometryColumns_init_17593716011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GeometryColumns_init_17593716011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1, term1.getClass(), "contents", null);
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "columnName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "geometryTypeName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "srs", null);
        setLongField(term1, term1.getClass(), "srsId", 2442117782898005296L);
        setByteField(term1, term1.getClass(), "z", (byte) 47);
        setByteField(term1, term1.getClass(), "m", (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


