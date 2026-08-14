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

public class GeometryColumnsSfSql_init_13448267591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public GeometryColumnsSfSql_init_13448267591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSfSql"));
        setField(term71, term71.getClass(), "contents", null);
        setField(term71, term71.getClass(), "fTableName", "xxtlPwDYFs");
        setField(term71, term71.getClass(), "fGeometryColumn", "jJCZpVmanW");
        setIntField(term71, term71.getClass(), "geometryType", 568599855);
        setByteField(term71, term71.getClass(), "coordDimension", (byte) 89);
        setField(term71, term71.getClass(), "srs", null);
        setLongField(term71, term71.getClass(), "srid", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSfSql");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumnsSfSql");
        Object[] args = new Object[1];
        args[0] = term71;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


