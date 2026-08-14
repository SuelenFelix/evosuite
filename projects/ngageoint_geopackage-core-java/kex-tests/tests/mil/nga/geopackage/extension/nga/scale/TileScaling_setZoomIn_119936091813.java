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
import java.lang.Long;

public class TileScaling_setZoomIn_119936091813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019;
     Object term2048;

    public TileScaling_setZoomIn_119936091813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2044 = new Long(2486810210675247493L);
        Long term2046 = new Long(7009926388951271268L);
        term2019 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term2019, term2019.getClass(), "tableName", "eZFUvlxvGV");
        setField(term2019, term2019.getClass(), "scalingType", "BYqFIqCKAV");
        setField(term2019, term2019.getClass(), "zoomIn", term2044);
        setField(term2019, term2019.getClass(), "zoomOut", term2046);
        term2048 = new Long(-7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2048;
        callMethod(klass, "setZoomIn", argTypes, term2019, args);
    }

};


