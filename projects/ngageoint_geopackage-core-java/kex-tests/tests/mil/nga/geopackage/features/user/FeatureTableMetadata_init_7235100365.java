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

public class FeatureTableMetadata_init_7235100365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1905;
     Object term1945;

    public FeatureTableMetadata_init_7235100365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1905 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term1905, term1905.getClass(), "contents", null);
        setField(term1905, term1905.getClass(), "tableName", "VgZnGoIFwQ");
        setField(term1905, term1905.getClass(), "columnName", "jUbSRrkrYZ");
        setField(term1905, term1905.getClass(), "geometryTypeName", "bWWfajKbEX");
        setField(term1905, term1905.getClass(), "srs", null);
        setLongField(term1905, term1905.getClass(), "srsId", 5270370404989704783L);
        setByteField(term1905, term1905.getClass(), "z", (byte) -10);
        setByteField(term1905, term1905.getClass(), "m", (byte) 79);
        term1945 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        argTypes[1] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term1905;
        args[1] = null;
        args[2] = term1945;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


