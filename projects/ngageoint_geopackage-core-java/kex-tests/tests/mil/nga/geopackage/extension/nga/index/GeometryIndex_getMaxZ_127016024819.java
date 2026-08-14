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

public class GeometryIndex_getMaxZ_127016024819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932;

    public GeometryIndex_getMaxZ_127016024819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term950 = new Double(0.36226058076369927);
        Double term952 = new Double(0.03699061125289671);
        Double term954 = new Double(0.6047137830113202);
        Double term956 = new Double(0.6767213143579776);
        term932 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term932, term932.getClass(), "tableIndex", null);
        setField(term932, term932.getClass(), "tableName", "IoAlmYsBwc");
        setLongField(term932, term932.getClass(), "geomId", 2120084523938730454L);
        setDoubleField(term932, term932.getClass(), "minX", 0.6767213143579776);
        setDoubleField(term932, term932.getClass(), "maxX", 0.48862955528902696);
        setDoubleField(term932, term932.getClass(), "minY", 0.426231085465289);
        setDoubleField(term932, term932.getClass(), "maxY", 0.0027299293098262956);
        setField(term932, term932.getClass(), "minZ", term950);
        setField(term932, term932.getClass(), "maxZ", term952);
        setField(term932, term932.getClass(), "minM", term954);
        setField(term932, term932.getClass(), "maxM", term956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxZ", argTypes, term932, args);
    }

};


