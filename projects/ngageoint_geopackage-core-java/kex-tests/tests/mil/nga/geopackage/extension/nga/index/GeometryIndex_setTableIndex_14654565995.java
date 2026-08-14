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

public class GeometryIndex_setTableIndex_14654565995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;

    public GeometryIndex_setTableIndex_14654565995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term434 = new Double(0.9828442029246764);
        Double term436 = new Double(0.2779719046761513);
        Double term438 = new Double(0.6436713023569729);
        Double term440 = new Double(0.7332741045694002);
        term416 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term416, term416.getClass(), "tableIndex", null);
        setField(term416, term416.getClass(), "tableName", "oVcInYnLWB");
        setLongField(term416, term416.getClass(), "geomId", -5476826692763582090L);
        setDoubleField(term416, term416.getClass(), "minX", 0.9828442029246764);
        setDoubleField(term416, term416.getClass(), "maxX", 0.2779719046761513);
        setDoubleField(term416, term416.getClass(), "minY", 0.6436713023569729);
        setDoubleField(term416, term416.getClass(), "maxY", 0.7332741045694002);
        setField(term416, term416.getClass(), "minZ", term434);
        setField(term416, term416.getClass(), "maxZ", term436);
        setField(term416, term416.getClass(), "minM", term438);
        setField(term416, term416.getClass(), "maxM", term440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.index.TableIndex");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTableIndex", argTypes, term416, args);
    }

};


