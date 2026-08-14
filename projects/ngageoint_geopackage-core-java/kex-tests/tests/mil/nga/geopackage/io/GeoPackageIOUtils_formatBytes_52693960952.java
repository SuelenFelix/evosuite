package mil.nga.geopackage.io;

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
import static mil.nga.geopackage.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GeoPackageIOUtils_formatBytes_52693960952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2631;
     Object term2632;

    public GeoPackageIOUtils_formatBytes_52693960952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2631 = newInstance(Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils"));
        term2632 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.io.GeoPackageIOUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2632;
        callMethod(klass, "formatBytes", argTypes, term2631, args);
    }

};


