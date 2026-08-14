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

public class RawConstraint_getSql_3353988377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4615;

    public RawConstraint_getSql_3353988377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4673 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term4672 = ((Class) term4673).getDeclaredField((String) "UNIQUE");
        ((Field) term4672).setAccessible(true);
        Object enum16 = ((Field) term4672).get((Object) null);
        Integer term4650 = new Integer(-1922583790);
        term4615 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term4615, term4615.getClass(), "sql", "pCTimMblYc");
        setField(term4615, term4615.getClass(), "name", "hNxWaHcfhY");
        setField(term4615, term4615.getClass(), "type", enum16);
        setField(term4615, term4615.getClass(), "order", term4650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSql", argTypes, term4615, args);
    }

};


