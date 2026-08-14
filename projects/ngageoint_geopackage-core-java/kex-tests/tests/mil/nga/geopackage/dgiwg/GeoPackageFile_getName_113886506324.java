package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GeoPackageFile_getName_113886506324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20686;

    public GeoPackageFile_getName_113886506324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20686 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        setField(term20686, term20686.getClass(), "file", null);
        setField(term20686, term20686.getClass(), "fileName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term20686, args);
    }

};


