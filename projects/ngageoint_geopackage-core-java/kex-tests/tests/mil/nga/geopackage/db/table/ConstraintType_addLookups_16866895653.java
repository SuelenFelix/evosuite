package mil.nga.geopackage.db.table;

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
import static mil.nga.geopackage.db.table.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Object;

public class ConstraintType_addLookups_16866895653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object enum0;

    public ConstraintType_addLookups_16866895653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new LinkedHashMap();
        Class<? extends Object> term213 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term212 = ((Class) term213).getDeclaredField((String) "COLLATE");
        ((Field) term212).setAccessible(true);
        enum0 = ((Field) term212).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[2];
        args[0] = term23;
        args[1] = enum0;
        callMethod(klass, "addLookups", argTypes, null, args);
    }

};


