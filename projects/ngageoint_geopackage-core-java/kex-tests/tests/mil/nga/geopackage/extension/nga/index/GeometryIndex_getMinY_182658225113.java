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

public class GeometryIndex_getMinY_182658225113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public GeometryIndex_getMinY_182658225113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term728 = new Double(0.7591353014991907);
        Double term730 = new Double(0.791695029600875);
        Double term732 = new Double(0.6862221294683138);
        Double term734 = new Double(0.15917839663695388);
        term710 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term710, term710.getClass(), "tableIndex", null);
        setField(term710, term710.getClass(), "tableName", "xOEqzGAmDU");
        setLongField(term710, term710.getClass(), "geomId", -4365849114644724155L);
        setDoubleField(term710, term710.getClass(), "minX", 0.6862221294683138);
        setDoubleField(term710, term710.getClass(), "maxX", 0.15917839663695388);
        setDoubleField(term710, term710.getClass(), "minY", 0.9374115574082594);
        setDoubleField(term710, term710.getClass(), "maxY", 0.8454723071922143);
        setField(term710, term710.getClass(), "minZ", term728);
        setField(term710, term710.getClass(), "maxZ", term730);
        setField(term710, term710.getClass(), "minM", term732);
        setField(term710, term710.getClass(), "maxM", term734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinY", argTypes, term710, args);
    }

};


