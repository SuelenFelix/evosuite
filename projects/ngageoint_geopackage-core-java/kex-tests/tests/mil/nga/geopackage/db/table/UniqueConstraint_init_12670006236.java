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

public class UniqueConstraint_init_12670006236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9316;

    public UniqueConstraint_init_12670006236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9317 = new ArrayList();
        Class<? extends Object> term9356 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term9355 = ((Class) term9356).getDeclaredField((String) "UNIQUE");
        ((Field) term9355).setAccessible(true);
        Object enum31 = ((Field) term9355).get((Object) null);
        Integer term9343 = new Integer(1134449235);
        term9316 = newInstance(Class.forName("mil.nga.geopackage.db.table.UniqueConstraint"));
        setField(term9316, term9316.getClass(), "columns", term9317);
        setField(term9316, term9316.getClass(), "name", "NTWMiBEaDF");
        setField(term9316, term9316.getClass(), "type", enum31);
        setField(term9316, term9316.getClass(), "order", term9343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Object[] args = new Object[1];
        args[0] = term9316;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


