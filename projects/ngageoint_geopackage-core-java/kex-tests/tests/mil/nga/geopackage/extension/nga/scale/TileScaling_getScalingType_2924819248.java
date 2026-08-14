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

public class TileScaling_getScalingType_2924819248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1399;

    public TileScaling_getScalingType_2924819248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1424 = new Long(-5476826692763582090L);
        Long term1426 = new Long(-872011222785455006L);
        term1399 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term1399, term1399.getClass(), "tableName", "MxlszYVzRf");
        setField(term1399, term1399.getClass(), "scalingType", "LQFpaHEwXR");
        setField(term1399, term1399.getClass(), "zoomIn", term1424);
        setField(term1399, term1399.getClass(), "zoomOut", term1426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScalingType", argTypes, term1399, args);
    }

};


