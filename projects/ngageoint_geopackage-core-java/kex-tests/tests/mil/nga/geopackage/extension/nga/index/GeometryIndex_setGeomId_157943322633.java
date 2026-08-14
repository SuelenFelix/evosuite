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
import java.lang.Long;

public class GeometryIndex_setGeomId_157943322633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term1196;

    public GeometryIndex_setGeomId_157943322633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1190, term1190.getClass(), "tableIndex", null);
        setField(term1190, term1190.getClass(), "tableName", null);
        setLongField(term1190, term1190.getClass(), "geomId", 0L);
        setDoubleField(term1190, term1190.getClass(), "minX", 0.0);
        setDoubleField(term1190, term1190.getClass(), "maxX", 0.0);
        setDoubleField(term1190, term1190.getClass(), "minY", 0.0);
        setDoubleField(term1190, term1190.getClass(), "maxY", 0.0);
        setField(term1190, term1190.getClass(), "minZ", null);
        setField(term1190, term1190.getClass(), "maxZ", null);
        setField(term1190, term1190.getClass(), "minM", null);
        setField(term1190, term1190.getClass(), "maxM", null);
        term1196 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1196;
        callMethod(klass, "setGeomId", argTypes, term1190, args);
    }

};


