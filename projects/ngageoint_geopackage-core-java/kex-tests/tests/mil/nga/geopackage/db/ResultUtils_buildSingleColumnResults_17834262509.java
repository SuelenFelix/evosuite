package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ResultUtils_buildSingleColumnResults_17834262509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1859;
     Object term1860;

    public ResultUtils_buildSingleColumnResults_17834262509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1859 = newInstance(Class.forName("mil.nga.geopackage.db.ResultUtils"));
        term1860 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.ResultUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.Result");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1860;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "buildSingleColumnResults", argTypes, term1859, args);
    }

};


