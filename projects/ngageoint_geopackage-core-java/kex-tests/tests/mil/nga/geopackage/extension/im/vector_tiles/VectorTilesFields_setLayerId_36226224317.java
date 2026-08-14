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

public class VectorTilesFields_setLayerId_36226224317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538;
     Object term541;

    public VectorTilesFields_setLayerId_36226224317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesFields"));
        setLongField(term538, term538.getClass(), "id", 0L);
        setLongField(term538, term538.getClass(), "layerId", 0L);
        setField(term538, term538.getClass(), "name", null);
        setField(term538, term538.getClass(), "type", null);
        term541 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesFields");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term541;
        callMethod(klass, "setLayerId", argTypes, term538, args);
    }

};


