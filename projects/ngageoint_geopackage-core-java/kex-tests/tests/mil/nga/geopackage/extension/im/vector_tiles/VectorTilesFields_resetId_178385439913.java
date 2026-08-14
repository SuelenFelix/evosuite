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

public class VectorTilesFields_resetId_178385439913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;

    public VectorTilesFields_resetId_178385439913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesFields"));
        setLongField(term524, term524.getClass(), "id", 0L);
        setLongField(term524, term524.getClass(), "layerId", 0L);
        setField(term524, term524.getClass(), "name", null);
        setField(term524, term524.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesFields");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term524, args);
    }

};


