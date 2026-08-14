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

public class GeometryIndex_getTableIndex_77029998729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1166;

    public GeometryIndex_getTableIndex_77029998729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1166 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1166, term1166.getClass(), "tableIndex", null);
        setField(term1166, term1166.getClass(), "tableName", null);
        setLongField(term1166, term1166.getClass(), "geomId", 0L);
        setDoubleField(term1166, term1166.getClass(), "minX", 0.0);
        setDoubleField(term1166, term1166.getClass(), "maxX", 0.0);
        setDoubleField(term1166, term1166.getClass(), "minY", 0.0);
        setDoubleField(term1166, term1166.getClass(), "maxY", 0.0);
        setField(term1166, term1166.getClass(), "minZ", null);
        setField(term1166, term1166.getClass(), "maxZ", null);
        setField(term1166, term1166.getClass(), "minM", null);
        setField(term1166, term1166.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableIndex", argTypes, term1166, args);
    }

};


