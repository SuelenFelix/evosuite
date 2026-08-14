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

public class VectorTilesLayers_getMaxZoom_91239695513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;

    public VectorTilesLayers_getMaxZoom_91239695513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1731 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1731, term1731.getClass(), "id", 5953383087795962419L);
        setField(term1731, term1731.getClass(), "tableName", "KoyGrUJeJW");
        setField(term1731, term1731.getClass(), "name", "HqBOwkVqjD");
        setField(term1731, term1731.getClass(), "description", "MAcUBcBckh");
        setLongField(term1731, term1731.getClass(), "minZoom", 7994303628307559416L);
        setLongField(term1731, term1731.getClass(), "maxZoom", 2443640364875054177L);
        setField(term1731, term1731.getClass(), "attributesTableName", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxZoom", argTypes, term1731, args);
    }

};


