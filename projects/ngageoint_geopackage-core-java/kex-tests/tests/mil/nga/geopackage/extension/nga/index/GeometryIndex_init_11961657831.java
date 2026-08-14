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

public class GeometryIndex_init_11961657831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public GeometryIndex_init_11961657831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term266 = new Double(0.13238746331190498);
        Double term268 = new Double(0.3455959125047594);
        Double term270 = new Double(0.5523635872663106);
        Double term272 = new Double(0.544608645520025);
        term248 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term248, term248.getClass(), "tableIndex", null);
        setField(term248, term248.getClass(), "tableName", "RMFIsYGgne");
        setLongField(term248, term248.getClass(), "geomId", 6967924379644551255L);
        setDoubleField(term248, term248.getClass(), "minX", 0.13238746331190498);
        setDoubleField(term248, term248.getClass(), "maxX", 0.3455959125047594);
        setDoubleField(term248, term248.getClass(), "minY", 0.5523635872663106);
        setDoubleField(term248, term248.getClass(), "maxY", 0.544608645520025);
        setField(term248, term248.getClass(), "minZ", term266);
        setField(term248, term248.getClass(), "maxZ", term268);
        setField(term248, term248.getClass(), "minM", term270);
        setField(term248, term248.getClass(), "maxM", term272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Object[] args = new Object[1];
        args[0] = term248;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


