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

public class FeatureTableMetadata_init_4361873196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1990;
     Object term2030;

    public FeatureTableMetadata_init_4361873196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1990 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1990, term1990.getClass(), "contents", null);
        setField(term1990, term1990.getClass(), "tableName", "LvJFtLBaxj");
        setField(term1990, term1990.getClass(), "columnName", "PHvxnGHptP");
        setField(term1990, term1990.getClass(), "geometryTypeName", "TimdotUuNC");
        setField(term1990, term1990.getClass(), "srs", null);
        setLongField(term1990, term1990.getClass(), "srsId", 7411271909051562686L);
        setByteField(term1990, term1990.getClass(), "z", (byte) -119);
        setByteField(term1990, term1990.getClass(), "m", (byte) -66);
        term2030 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = "cAPeiZHKGJ";
        args[1] = term1990;
        args[2] = null;
        args[3] = term2030;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


