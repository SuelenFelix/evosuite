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

public class GeometryIndex_getTableName_5517298716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452;

    public GeometryIndex_getTableName_5517298716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term470 = new Double(0.4569171842750229);
        Double term472 = new Double(0.8598297828918529);
        Double term474 = new Double(0.43692187681405226);
        Double term476 = new Double(0.7633268466829064);
        term452 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term452, term452.getClass(), "tableIndex", null);
        setField(term452, term452.getClass(), "tableName", "aJlieCFVtF");
        setLongField(term452, term452.getClass(), "geomId", -872011222785455006L);
        setDoubleField(term452, term452.getClass(), "minX", 0.4569171842750229);
        setDoubleField(term452, term452.getClass(), "maxX", 0.8598297828918529);
        setDoubleField(term452, term452.getClass(), "minY", 0.43692187681405226);
        setDoubleField(term452, term452.getClass(), "maxY", 0.7633268466829064);
        setField(term452, term452.getClass(), "minZ", term470);
        setField(term452, term452.getClass(), "maxZ", term472);
        setField(term452, term452.getClass(), "minM", term474);
        setField(term452, term452.getClass(), "maxM", term476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term452, args);
    }

};


