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

public class RawConstraint_buildSql_211168470711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5881;

    public RawConstraint_buildSql_211168470711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5939 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term5938 = ((Class) term5939).getDeclaredField((String) "UNIQUE");
        ((Field) term5938).setAccessible(true);
        Object enum20 = ((Field) term5938).get((Object) null);
        Integer term5916 = new Integer(1227103734);
        term5881 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term5881, term5881.getClass(), "sql", "OWDIEULEFu");
        setField(term5881, term5881.getClass(), "name", "dWRymuLBtr");
        setField(term5881, term5881.getClass(), "type", enum20);
        setField(term5881, term5881.getClass(), "order", term5916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildSql", argTypes, term5881, args);
    }

};


