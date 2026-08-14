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

public class TileDaoUtils_getMinLength_140040348714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4310;
     Object term4311;

    public TileDaoUtils_getMinLength_140040348714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4310 = (double[]) newDoubleArray(0);
        term4311 = (double[]) newDoubleArray(6);
        setDoubleElement(term4311, 0, 0.2843894095932772);
        setDoubleElement(term4311, 1, 0.2382345237223229);
        setDoubleElement(term4311, 2, 0.6037093070161561);
        setDoubleElement(term4311, 3, 0.48050706663913145);
        setDoubleElement(term4311, 4, 0.4990217874180345);
        setDoubleElement(term4311, 5, 0.22767631814145395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4310;
        args[1] = term4311;
        callMethod(klass, "getMinLength", argTypes, null, args);
    }

};


