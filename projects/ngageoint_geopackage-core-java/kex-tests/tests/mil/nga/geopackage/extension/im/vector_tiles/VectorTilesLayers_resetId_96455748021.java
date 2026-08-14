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

public class VectorTilesLayers_resetId_96455748021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2139;

    public VectorTilesLayers_resetId_96455748021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2139 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term2139, term2139.getClass(), "id", 0L);
        setField(term2139, term2139.getClass(), "tableName", null);
        setField(term2139, term2139.getClass(), "name", null);
        setField(term2139, term2139.getClass(), "description", null);
        setLongField(term2139, term2139.getClass(), "minZoom", 0L);
        setLongField(term2139, term2139.getClass(), "maxZoom", 0L);
        setField(term2139, term2139.getClass(), "attributesTableName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term2139, args);
    }

};


