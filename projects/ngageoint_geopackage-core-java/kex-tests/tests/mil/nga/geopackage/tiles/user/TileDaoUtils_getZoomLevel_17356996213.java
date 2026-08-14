package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Double;

public class TileDaoUtils_getZoomLevel_17356996213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3663;
     Object term3668;
     Object term3673;
     Object term3676;
     Object term3678;

    public TileDaoUtils_getZoomLevel_17356996213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3663 = (double[]) newDoubleArray(4);
        setDoubleElement(term3663, 0, 0.11493000848982304);
        setDoubleElement(term3663, 1, 0.37161417339133307);
        setDoubleElement(term3663, 2, 0.6805867182029153);
        setDoubleElement(term3663, 3, 0.2852810965221698);
        term3668 = (double[]) newDoubleArray(4);
        setDoubleElement(term3668, 0, 0.6300849762307866);
        setDoubleElement(term3668, 1, 0.9737083944266686);
        setDoubleElement(term3668, 2, 0.0668892744806211);
        setDoubleElement(term3668, 3, 0.3587267442738795);
        term3673 = new LinkedList();
        term3676 = new Double(0.07802449704920456);
        term3678 = new Double(0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term3663;
        args[1] = term3668;
        args[2] = term3673;
        args[3] = term3676;
        args[4] = term3678;
        callMethod(klass, "getZoomLevel", argTypes, null, args);
    }

};


