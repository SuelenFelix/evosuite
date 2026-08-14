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

public class GeometryIndex_getTableIndex_7702999874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;

    public GeometryIndex_getTableIndex_7702999874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term398 = new Double(0.7655020693602768);
        Double term400 = new Double(0.1374549299694151);
        Double term402 = new Double(0.7031006357544823);
        Double term404 = new Double(0.9527281779865117);
        term380 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term380, term380.getClass(), "tableIndex", null);
        setField(term380, term380.getClass(), "tableName", "LQFpaHEwXR");
        setLongField(term380, term380.getClass(), "geomId", 2535595959091595249L);
        setDoubleField(term380, term380.getClass(), "minX", 0.7655020693602768);
        setDoubleField(term380, term380.getClass(), "maxX", 0.1374549299694151);
        setDoubleField(term380, term380.getClass(), "minY", 0.7031006357544823);
        setDoubleField(term380, term380.getClass(), "maxY", 0.9527281779865117);
        setField(term380, term380.getClass(), "minZ", term398);
        setField(term380, term380.getClass(), "maxZ", term400);
        setField(term380, term380.getClass(), "minM", term402);
        setField(term380, term380.getClass(), "maxM", term404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableIndex", argTypes, term380, args);
    }

};


