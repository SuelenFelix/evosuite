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

public class VectorTilesLayers_getMaxZoom_91239695530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177;

    public VectorTilesLayers_getMaxZoom_91239695530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2177 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term2177, term2177.getClass(), "id", 0L);
        setField(term2177, term2177.getClass(), "tableName", null);
        setField(term2177, term2177.getClass(), "name", null);
        setField(term2177, term2177.getClass(), "description", null);
        setLongField(term2177, term2177.getClass(), "minZoom", 0L);
        setLongField(term2177, term2177.getClass(), "maxZoom", 0L);
        setField(term2177, term2177.getClass(), "attributesTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxZoom", argTypes, term2177, args);
    }

};


