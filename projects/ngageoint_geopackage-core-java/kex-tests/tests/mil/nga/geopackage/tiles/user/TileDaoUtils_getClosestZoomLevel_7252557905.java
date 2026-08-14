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

public class TileDaoUtils_getClosestZoomLevel_7252557905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;
     Object term3725;
     Object term3732;
     Object term3735;
     Object term3737;

    public TileDaoUtils_getClosestZoomLevel_7252557905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = (double[]) newDoubleArray(1);
        setDoubleElement(term3723, 0, 0.8566567697571895);
        term3725 = (double[]) newDoubleArray(6);
        setDoubleElement(term3725, 0, 0.9203805380592256);
        setDoubleElement(term3725, 1, 0.5804948995371725);
        setDoubleElement(term3725, 2, 0.20737514139742264);
        setDoubleElement(term3725, 3, 0.7919370314903882);
        setDoubleElement(term3725, 4, 0.2109867221632754);
        setDoubleElement(term3725, 5, 0.3227335400819148);
        term3732 = new LinkedList();
        term3735 = new Double(0.43337207054070237);
        term3737 = new Double(0.13246999699526574);
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
        args[0] = term3723;
        args[1] = term3725;
        args[2] = term3732;
        args[3] = term3735;
        args[4] = term3737;
        callMethod(klass, "getClosestZoomLevel", argTypes, null, args);
    }

};


