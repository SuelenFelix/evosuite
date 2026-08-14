package mil.nga.geopackage.extension.im.vector_tiles;

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
import static mil.nga.geopackage.extension.im.vector_tiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class VectorTilesLayers_setMinZoom_105747092512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1637;
     Object term1689;

    public VectorTilesLayers_setMinZoom_105747092512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1637 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1637, term1637.getClass(), "id", -7738503207562305297L);
        setField(term1637, term1637.getClass(), "tableName", "bLPjGVBhlX");
        setField(term1637, term1637.getClass(), "name", "whBvTVIIlC");
        setField(term1637, term1637.getClass(), "description", "IgRJUzaCwW");
        setLongField(term1637, term1637.getClass(), "minZoom", 3825396310311739952L);
        setLongField(term1637, term1637.getClass(), "maxZoom", -3838084482494604218L);
        setField(term1637, term1637.getClass(), "attributesTableName", "JUmudUmaaV");
        term1689 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1689;
        callMethod(klass, "setMinZoom", argTypes, term1637, args);
    }

};


