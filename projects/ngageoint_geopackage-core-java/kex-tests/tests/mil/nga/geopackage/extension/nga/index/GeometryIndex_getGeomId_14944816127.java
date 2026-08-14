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

public class GeometryIndex_getGeomId_14944816127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public GeometryIndex_getGeomId_14944816127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term506 = new Double(0.13481025392611334);
        Double term508 = new Double(0.3800088629986428);
        Double term510 = new Double(0.5840714198152577);
        Double term512 = new Double(0.7559240768573477);
        term488 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term488, term488.getClass(), "tableIndex", null);
        setField(term488, term488.getClass(), "tableName", "ZiaGIbnzTs");
        setLongField(term488, term488.getClass(), "geomId", -316468845751588286L);
        setDoubleField(term488, term488.getClass(), "minX", 0.13481025392611334);
        setDoubleField(term488, term488.getClass(), "maxX", 0.3800088629986428);
        setDoubleField(term488, term488.getClass(), "minY", 0.5840714198152577);
        setDoubleField(term488, term488.getClass(), "maxY", 0.7559240768573477);
        setField(term488, term488.getClass(), "minZ", term506);
        setField(term488, term488.getClass(), "maxZ", term508);
        setField(term488, term488.getClass(), "minM", term510);
        setField(term488, term488.getClass(), "maxM", term512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeomId", argTypes, term488, args);
    }

};


