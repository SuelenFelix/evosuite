package mil.nga.geopackage.extension.nga.scale;

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
import static mil.nga.geopackage.extension.nga.scale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileScaling_setZoomOut_150359147733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;

    public TileScaling_setZoomOut_150359147733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2278 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term2278, term2278.getClass(), "tableName", null);
        setField(term2278, term2278.getClass(), "scalingType", null);
        setField(term2278, term2278.getClass(), "zoomIn", null);
        setField(term2278, term2278.getClass(), "zoomOut", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setZoomOut", argTypes, term2278, args);
    }

};


