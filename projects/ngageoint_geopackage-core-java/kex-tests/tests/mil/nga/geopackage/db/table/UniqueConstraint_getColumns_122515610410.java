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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class UniqueConstraint_getColumns_122515610410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10413;

    public UniqueConstraint_getColumns_122515610410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10414 = new ArrayList();
        Class<? extends Object> term10453 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term10452 = ((Class) term10453).getDeclaredField((String) "UNIQUE");
        ((Field) term10452).setAccessible(true);
        Object enum35 = ((Field) term10452).get((Object) null);
        Integer term10440 = new Integer(-1685132342);
        term10413 = newInstance(Class.forName("mil.nga.geopackage.db.table.UniqueConstraint"));
        setField(term10413, term10413.getClass(), "columns", term10414);
        setField(term10413, term10413.getClass(), "name", "IlvgFINwIa");
        setField(term10413, term10413.getClass(), "type", enum35);
        setField(term10413, term10413.getClass(), "order", term10440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumns", argTypes, term10413, args);
    }

};


