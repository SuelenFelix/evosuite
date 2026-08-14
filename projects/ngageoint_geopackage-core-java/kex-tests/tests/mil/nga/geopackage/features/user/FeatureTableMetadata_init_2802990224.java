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

public class FeatureTableMetadata_init_2802990224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1795;
     Object term1847;
     Object term1849;

    public FeatureTableMetadata_init_2802990224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1795 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1795, term1795.getClass(), "contents", null);
        setField(term1795, term1795.getClass(), "tableName", "vQVyKLdtaz");
        setField(term1795, term1795.getClass(), "columnName", "OWKQODBLzb");
        setField(term1795, term1795.getClass(), "geometryTypeName", "wGmYcqUkgE");
        setField(term1795, term1795.getClass(), "srs", null);
        setLongField(term1795, term1795.getClass(), "srsId", -8400487765614892086L);
        setByteField(term1795, term1795.getClass(), "z", (byte) -29);
        setByteField(term1795, term1795.getClass(), "m", (byte) -54);
        term1847 = new Boolean(true);
        term1849 = new LinkedList();
        ((LinkedList) term1849).add((Object)null);
        ((LinkedList) term1849).add((Object)null);
        ((LinkedList) term1849).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[6];
        args[0] = "oVgzLbrsFr";
        args[1] = term1795;
        args[2] = "idgaQsnJpQ";
        args[3] = term1847;
        args[4] = term1849;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


