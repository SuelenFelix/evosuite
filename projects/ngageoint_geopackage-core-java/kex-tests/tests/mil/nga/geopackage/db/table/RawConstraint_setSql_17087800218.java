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

public class RawConstraint_setSql_17087800218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4907;

    public RawConstraint_setSql_17087800218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4979 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term4978 = ((Class) term4979).getDeclaredField((String) "NOT_NULL");
        ((Field) term4978).setAccessible(true);
        Object enum17 = ((Field) term4978).get((Object) null);
        Integer term4944 = new Integer(-616727354);
        term4907 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term4907, term4907.getClass(), "sql", "RkybSrpybU");
        setField(term4907, term4907.getClass(), "name", "xOEqzGAmDU");
        setField(term4907, term4907.getClass(), "type", enum17);
        setField(term4907, term4907.getClass(), "order", term4944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setSql", argTypes, term4907, args);
    }

};


