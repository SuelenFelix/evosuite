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

public class TileScaling_setZoomOut_150359147715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2119;
     Object term2148;

    public TileScaling_setZoomOut_150359147715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2144 = new Long(2120084523938730454L);
        Long term2146 = new Long(6855071767938501807L);
        term2119 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term2119, term2119.getClass(), "tableName", "OclPbYPkcH");
        setField(term2119, term2119.getClass(), "scalingType", "IoAlmYsBwc");
        setField(term2119, term2119.getClass(), "zoomIn", term2144);
        setField(term2119, term2119.getClass(), "zoomOut", term2146);
        term2148 = new Long(-5892135042702373494L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2148;
        callMethod(klass, "setZoomOut", argTypes, term2119, args);
    }

};


