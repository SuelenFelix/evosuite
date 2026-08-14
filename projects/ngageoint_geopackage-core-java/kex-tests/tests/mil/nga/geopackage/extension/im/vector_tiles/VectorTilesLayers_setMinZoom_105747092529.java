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

public class VectorTilesLayers_setMinZoom_105747092529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;
     Object term2175;

    public VectorTilesLayers_setMinZoom_105747092529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2171 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term2171, term2171.getClass(), "id", 0L);
        setField(term2171, term2171.getClass(), "tableName", null);
        setField(term2171, term2171.getClass(), "name", null);
        setField(term2171, term2171.getClass(), "description", null);
        setLongField(term2171, term2171.getClass(), "minZoom", 0L);
        setLongField(term2171, term2171.getClass(), "maxZoom", 0L);
        setField(term2171, term2171.getClass(), "attributesTableName", null);
        term2175 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2175;
        callMethod(klass, "setMinZoom", argTypes, term2171, args);
    }

};


