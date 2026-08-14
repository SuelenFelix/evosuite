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

public class GeometryIndex_getMinX_18265832129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;

    public GeometryIndex_getMinX_18265832129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term580 = new Double(0.2852810965221698);
        Double term582 = new Double(0.6300849762307866);
        Double term584 = new Double(0.9737083944266686);
        Double term586 = new Double(0.0668892744806211);
        term562 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term562, term562.getClass(), "tableIndex", null);
        setField(term562, term562.getClass(), "tableName", "HyxfbSQYBe");
        setLongField(term562, term562.getClass(), "geomId", -4920224193275732920L);
        setDoubleField(term562, term562.getClass(), "minX", 0.2852810965221698);
        setDoubleField(term562, term562.getClass(), "maxX", 0.6300849762307866);
        setDoubleField(term562, term562.getClass(), "minY", 0.9737083944266686);
        setDoubleField(term562, term562.getClass(), "maxY", 0.0668892744806211);
        setField(term562, term562.getClass(), "minZ", term580);
        setField(term562, term562.getClass(), "maxZ", term582);
        setField(term562, term562.getClass(), "minM", term584);
        setField(term562, term562.getClass(), "maxM", term586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinX", argTypes, term562, args);
    }

};


