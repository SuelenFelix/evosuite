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

public class GeometryIndex_getMinZ_127725050617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858;

    public GeometryIndex_getMinZ_127725050617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term876 = new Double(0.11179067076100713);
        Double term878 = new Double(0.5306473989087822);
        Double term880 = new Double(0.022483645678509023);
        Double term882 = new Double(0.025133051616627267);
        term858 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term858, term858.getClass(), "tableIndex", null);
        setField(term858, term858.getClass(), "tableName", "flxyYxBRtu");
        setLongField(term858, term858.getClass(), "geomId", -4502405999831680926L);
        setDoubleField(term858, term858.getClass(), "minX", 0.016575281023182953);
        setDoubleField(term858, term858.getClass(), "maxX", 0.5308350402051779);
        setDoubleField(term858, term858.getClass(), "minY", 0.7154795600170818);
        setDoubleField(term858, term858.getClass(), "maxY", 0.6355029654528058);
        setField(term858, term858.getClass(), "minZ", term876);
        setField(term858, term858.getClass(), "maxZ", term878);
        setField(term858, term858.getClass(), "minM", term880);
        setField(term858, term858.getClass(), "maxM", term882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinZ", argTypes, term858, args);
    }

};


