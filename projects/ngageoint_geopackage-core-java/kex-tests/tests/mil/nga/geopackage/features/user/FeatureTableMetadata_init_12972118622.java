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
import java.lang.Object;

public class FeatureTableMetadata_init_12972118622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;
     Object term1619;

    public FeatureTableMetadata_init_12972118622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1567 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1567, term1567.getClass(), "contents", null);
        setField(term1567, term1567.getClass(), "tableName", "tPlsykYBqO");
        setField(term1567, term1567.getClass(), "columnName", "bLPjGVBhlX");
        setField(term1567, term1567.getClass(), "geometryTypeName", "whBvTVIIlC");
        setField(term1567, term1567.getClass(), "srs", null);
        setLongField(term1567, term1567.getClass(), "srsId", 6375119433582206027L);
        setByteField(term1567, term1567.getClass(), "z", (byte) 89);
        setByteField(term1567, term1567.getClass(), "m", (byte) 75);
        term1619 = new LinkedList();
        ((LinkedList) term1619).add((Object)null);
        ((LinkedList) term1619).add((Object)null);
        ((LinkedList) term1619).add((Object)null);
        ((LinkedList) term1619).add((Object)null);
        ((LinkedList) term1619).add((Object)null);
        ((LinkedList) term1619).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[5];
        args[0] = "TJmVBGfTML";
        args[1] = term1567;
        args[2] = "IgRJUzaCwW";
        args[3] = term1619;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


