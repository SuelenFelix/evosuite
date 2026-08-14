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

public class TileScaling_getTableName_200760601824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2269;

    public TileScaling_getTableName_200760601824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2269 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term2269, term2269.getClass(), "tableName", null);
        setField(term2269, term2269.getClass(), "scalingType", null);
        setField(term2269, term2269.getClass(), "zoomIn", null);
        setField(term2269, term2269.getClass(), "zoomOut", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term2269, args);
    }

};


