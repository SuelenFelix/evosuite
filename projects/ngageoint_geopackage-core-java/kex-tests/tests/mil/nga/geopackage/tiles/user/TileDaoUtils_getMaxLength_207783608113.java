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

public class TileDaoUtils_getMaxLength_207783608113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4284;
     Object term4291;

    public TileDaoUtils_getMaxLength_207783608113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4284 = (double[]) newDoubleArray(6);
        setDoubleElement(term4284, 0, 0.9090793968999221);
        setDoubleElement(term4284, 1, 0.25997329921466494);
        setDoubleElement(term4284, 2, 0.7814864708383836);
        setDoubleElement(term4284, 3, 0.5657654165545906);
        setDoubleElement(term4284, 4, 0.6382060245198228);
        setDoubleElement(term4284, 5, 0.1849998667663698);
        term4291 = (double[]) newDoubleArray(6);
        setDoubleElement(term4291, 0, 0.36312400202399575);
        setDoubleElement(term4291, 1, 0.5485690030548175);
        setDoubleElement(term4291, 2, 0.9765248027281291);
        setDoubleElement(term4291, 3, 0.9184034277897645);
        setDoubleElement(term4291, 4, 0.9457448635091538);
        setDoubleElement(term4291, 5, 0.3238255203811462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4284;
        args[1] = term4291;
        callMethod(klass, "getMaxLength", argTypes, null, args);
    }

};


