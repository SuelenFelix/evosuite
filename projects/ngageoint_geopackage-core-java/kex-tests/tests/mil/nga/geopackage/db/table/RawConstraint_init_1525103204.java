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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class RawConstraint_init_1525103204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;
     Object term3776;

    public RawConstraint_init_1525103204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3791 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term3790 = ((Class) term3791).getDeclaredField((String) "CHECK");
        ((Field) term3790).setAccessible(true);
        enum13 = ((Field) term3790).get((Object) null);
        term3776 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum13;
        args[1] = term3776;
        args[2] = "oVcInYnLWB";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


