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

public class VectorTilesLayers_setMaxZoom_182994949931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;
     Object term2185;

    public VectorTilesLayers_setMaxZoom_182994949931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2181 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term2181, term2181.getClass(), "id", 0L);
        setField(term2181, term2181.getClass(), "tableName", null);
        setField(term2181, term2181.getClass(), "name", null);
        setField(term2181, term2181.getClass(), "description", null);
        setLongField(term2181, term2181.getClass(), "minZoom", 0L);
        setLongField(term2181, term2181.getClass(), "maxZoom", 0L);
        setField(term2181, term2181.getClass(), "attributesTableName", null);
        term2185 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2185;
        callMethod(klass, "setMaxZoom", argTypes, term2181, args);
    }

};


