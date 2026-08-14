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
import java.lang.Long;

public class GeometryIndex_setGeomId_15794332268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;
     Object term550;

    public GeometryIndex_setGeomId_15794332268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term542 = new Double(0.10667076642995188);
        Double term544 = new Double(0.11493000848982304);
        Double term546 = new Double(0.37161417339133307);
        Double term548 = new Double(0.6805867182029153);
        term524 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term524, term524.getClass(), "tableIndex", null);
        setField(term524, term524.getClass(), "tableName", "tbcdzjIfER");
        setLongField(term524, term524.getClass(), "geomId", 5127676408959197577L);
        setDoubleField(term524, term524.getClass(), "minX", 0.10667076642995188);
        setDoubleField(term524, term524.getClass(), "maxX", 0.11493000848982304);
        setDoubleField(term524, term524.getClass(), "minY", 0.37161417339133307);
        setDoubleField(term524, term524.getClass(), "maxY", 0.6805867182029153);
        setField(term524, term524.getClass(), "minZ", term542);
        setField(term524, term524.getClass(), "maxZ", term544);
        setField(term524, term524.getClass(), "minM", term546);
        setField(term524, term524.getClass(), "maxM", term548);
        term550 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term550;
        callMethod(klass, "setGeomId", argTypes, term524, args);
    }

};


