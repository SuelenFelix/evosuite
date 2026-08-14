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

public class TileDaoUtils_getMaxLength_71834189015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4324;

    public TileDaoUtils_getMaxLength_71834189015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4324 = (double[]) newDoubleArray(5);
        setDoubleElement(term4324, 0, 0.4630082575704827);
        setDoubleElement(term4324, 1, 0.8732511635701926);
        setDoubleElement(term4324, 2, 0.8977760608415547);
        setDoubleElement(term4324, 3, 0.3107086749915061);
        setDoubleElement(term4324, 4, 0.18330246984174836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4324;
        callMethod(klass, "getMaxLength", argTypes, null, args);
    }

};


