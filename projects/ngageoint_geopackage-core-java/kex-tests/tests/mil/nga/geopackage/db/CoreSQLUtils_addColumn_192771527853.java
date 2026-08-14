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

public class CoreSQLUtils_addColumn_192771527853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503;

    public CoreSQLUtils_addColumn_192771527853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503 = newInstance(Class.forName("mil.nga.geopackage.db.CoreSQLUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.user.UserColumn");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addColumn", argTypes, term3503, args);
    }

};


