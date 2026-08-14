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

public class GeometryColumnsSqlMm_init_13665646411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public GeometryColumnsSqlMm_init_13665646411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSqlMm"));
        setField(term119, term119.getClass(), "contents", null);
        setField(term119, term119.getClass(), "tableName", "EGtDIRbSSb");
        setField(term119, term119.getClass(), "columnName", "SzjVpOQTyS");
        setField(term119, term119.getClass(), "geometryTypeName", "MjGYSRKTNF");
        setField(term119, term119.getClass(), "srs", null);
        setLongField(term119, term119.getClass(), "srsId", -8257434502486459194L);
        setField(term119, term119.getClass(), "srsName", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSqlMm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSqlMm");
        Object[] args = new Object[1];
        args[0] = term119;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


