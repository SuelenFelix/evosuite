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
import java.util.LinkedList;

public class FeatureTable_init_9897199320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2361;
     Object term2401;

    public FeatureTable_init_9897199320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2361 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term2361, term2361.getClass(), "contents", null);
        setField(term2361, term2361.getClass(), "tableName", "AWRooQKkdW");
        setField(term2361, term2361.getClass(), "columnName", "vjxIhXHxGR");
        setField(term2361, term2361.getClass(), "geometryTypeName", "QXzGXbEXMu");
        setField(term2361, term2361.getClass(), "srs", null);
        setLongField(term2361, term2361.getClass(), "srsId", 6811161968424632369L);
        setByteField(term2361, term2361.getClass(), "z", (byte) -71);
        setByteField(term2361, term2361.getClass(), "m", (byte) 49);
        term2401 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term2361;
        args[1] = term2401;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


