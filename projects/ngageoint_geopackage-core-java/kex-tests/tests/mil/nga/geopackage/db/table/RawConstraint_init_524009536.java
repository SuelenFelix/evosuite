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

public class RawConstraint_init_524009536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4327;

    public RawConstraint_init_524009536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4384 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term4383 = ((Class) term4384).getDeclaredField((String) "CHECK");
        ((Field) term4383).setAccessible(true);
        Object enum15 = ((Field) term4383).get((Object) null);
        Integer term4361 = new Integer(391863371);
        term4327 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term4327, term4327.getClass(), "sql", "tbcdzjIfER");
        setField(term4327, term4327.getClass(), "name", "HyxfbSQYBe");
        setField(term4327, term4327.getClass(), "type", enum15);
        setField(term4327, term4327.getClass(), "order", term4361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Object[] args = new Object[1];
        args[0] = term4327;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


