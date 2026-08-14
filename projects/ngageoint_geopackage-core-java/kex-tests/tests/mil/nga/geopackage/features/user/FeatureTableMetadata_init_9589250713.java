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
import java.lang.Boolean;
import java.util.LinkedList;
import java.lang.Object;

public class FeatureTableMetadata_init_9589250713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1678;
     Object term1730;
     Object term1732;

    public FeatureTableMetadata_init_9589250713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1678 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1678, term1678.getClass(), "contents", null);
        setField(term1678, term1678.getClass(), "tableName", "JUmudUmaaV");
        setField(term1678, term1678.getClass(), "columnName", "KoyGrUJeJW");
        setField(term1678, term1678.getClass(), "geometryTypeName", "HqBOwkVqjD");
        setField(term1678, term1678.getClass(), "srs", null);
        setLongField(term1678, term1678.getClass(), "srsId", -8257434502486459194L);
        setByteField(term1678, term1678.getClass(), "z", (byte) 18);
        setByteField(term1678, term1678.getClass(), "m", (byte) -58);
        term1730 = new Boolean(true);
        term1732 = new LinkedList();
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
        ((LinkedList) term1732).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[5];
        args[0] = term1678;
        args[1] = "MAcUBcBckh";
        args[2] = term1730;
        args[3] = term1732;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


