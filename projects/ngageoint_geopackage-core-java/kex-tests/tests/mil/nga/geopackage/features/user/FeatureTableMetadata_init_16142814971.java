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

public class FeatureTableMetadata_init_16142814971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;
     Object term1512;

    public FeatureTableMetadata_init_16142814971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1460 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1460, term1460.getClass(), "contents", null);
        setField(term1460, term1460.getClass(), "tableName", "eqJfYWRaEL");
        setField(term1460, term1460.getClass(), "columnName", "fhkbdRViHi");
        setField(term1460, term1460.getClass(), "geometryTypeName", "uWHnvSvaPl");
        setField(term1460, term1460.getClass(), "srs", null);
        setLongField(term1460, term1460.getClass(), "srsId", 2442117782898005296L);
        setByteField(term1460, term1460.getClass(), "z", (byte) 47);
        setByteField(term1460, term1460.getClass(), "m", (byte) 48);
        term1512 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[4];
        args[0] = term1460;
        args[1] = "kBdSllIBVz";
        args[2] = term1512;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


