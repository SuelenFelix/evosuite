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
import java.lang.String;
import java.lang.Object;

public class TileScaling_setScalingType_8335218489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1448;
     Object enum3;

    public TileScaling_setScalingType_8335218489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1473 = new Long(-316468845751588286L);
        Long term1475 = new Long(5127676408959197577L);
        term1448 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term1448, term1448.getClass(), "tableName", "oVcInYnLWB");
        setField(term1448, term1448.getClass(), "scalingType", "aJlieCFVtF");
        setField(term1448, term1448.getClass(), "zoomIn", term1473);
        setField(term1448, term1448.getClass(), "zoomOut", term1475);
        Class<? extends Object> term1532 = Class.forName((String) "mil.nga.geopackage.extension.nga.scale.TileScalingType");
        Field term1531 = ((Class) term1532).getDeclaredField((String) "CLOSEST_OUT_IN");
        ((Field) term1531).setAccessible(true);
        enum3 = ((Field) term1531).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScalingType");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "setScalingType", argTypes, term1448, args);
    }

};


