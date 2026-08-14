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

public class GeometryIndex_getId_196208268927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1154;

    public GeometryIndex_getId_196208268927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1154 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1154, term1154.getClass(), "tableIndex", null);
        setField(term1154, term1154.getClass(), "tableName", null);
        setLongField(term1154, term1154.getClass(), "geomId", 0L);
        setDoubleField(term1154, term1154.getClass(), "minX", 0.0);
        setDoubleField(term1154, term1154.getClass(), "maxX", 0.0);
        setDoubleField(term1154, term1154.getClass(), "minY", 0.0);
        setDoubleField(term1154, term1154.getClass(), "maxY", 0.0);
        setField(term1154, term1154.getClass(), "minZ", null);
        setField(term1154, term1154.getClass(), "maxZ", null);
        setField(term1154, term1154.getClass(), "minM", null);
        setField(term1154, term1154.getClass(), "maxM", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1154, args);
    }

};


