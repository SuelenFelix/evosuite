package mil.nga.geopackage.extension.nga.index;

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
import static mil.nga.geopackage.extension.nga.index.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GeometryIndex_setMinZ_143210697418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894;
     Object term920;

    public GeometryIndex_setMinZ_143210697418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term912 = new Double(0.016575281023182953);
        Double term914 = new Double(0.5308350402051779);
        Double term916 = new Double(0.7154795600170818);
        Double term918 = new Double(0.6355029654528058);
        term894 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term894, term894.getClass(), "tableIndex", null);
        setField(term894, term894.getClass(), "tableName", "OclPbYPkcH");
        setLongField(term894, term894.getClass(), "geomId", 1967728129628047933L);
        setDoubleField(term894, term894.getClass(), "minX", 0.0022646783892913414);
        setDoubleField(term894, term894.getClass(), "maxX", 0.36226058076369927);
        setDoubleField(term894, term894.getClass(), "minY", 0.03699061125289671);
        setDoubleField(term894, term894.getClass(), "maxY", 0.6047137830113202);
        setField(term894, term894.getClass(), "minZ", term912);
        setField(term894, term894.getClass(), "maxZ", term914);
        setField(term894, term894.getClass(), "minM", term916);
        setField(term894, term894.getClass(), "maxM", term918);
        term920 = new Double(0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term920;
        callMethod(klass, "setMinZ", argTypes, term894, args);
    }

};


