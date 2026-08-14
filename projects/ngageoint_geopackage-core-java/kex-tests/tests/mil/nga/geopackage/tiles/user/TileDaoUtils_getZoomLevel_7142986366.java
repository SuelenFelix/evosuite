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
import java.lang.Boolean;

public class TileDaoUtils_getZoomLevel_7142986366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3746;
     Object term3751;
     Object term3754;
     Object term3757;
     Object term3759;

    public TileDaoUtils_getZoomLevel_7142986366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3746 = (double[]) newDoubleArray(4);
        setDoubleElement(term3746, 0, 0.9126850255993704);
        setDoubleElement(term3746, 1, 0.11179067076100713);
        setDoubleElement(term3746, 2, 0.5306473989087822);
        setDoubleElement(term3746, 3, 0.022483645678509023);
        term3751 = (double[]) newDoubleArray(2);
        setDoubleElement(term3751, 0, 0.025133051616627267);
        setDoubleElement(term3751, 1, 0.016575281023182953);
        term3754 = new LinkedList();
        term3757 = new Double(0.5308350402051779);
        term3759 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term3746;
        args[1] = term3751;
        args[2] = term3754;
        args[3] = term3757;
        args[4] = term3759;
        callMethod(klass, "getZoomLevel", argTypes, null, args);
    }

};


