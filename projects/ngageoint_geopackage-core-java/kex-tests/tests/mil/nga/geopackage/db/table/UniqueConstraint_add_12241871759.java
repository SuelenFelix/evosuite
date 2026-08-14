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

public class UniqueConstraint_add_12241871759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10138;
     Object term10167;

    public UniqueConstraint_add_12241871759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10139 = new ArrayList();
        Class<? extends Object> term10179 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term10178 = ((Class) term10179).getDeclaredField((String) "UNIQUE");
        ((Field) term10178).setAccessible(true);
        Object enum34 = ((Field) term10178).get((Object) null);
        Integer term10165 = new Integer(597278769);
        term10138 = newInstance(Class.forName("mil.nga.geopackage.db.table.UniqueConstraint"));
        setField(term10138, term10138.getClass(), "columns", term10139);
        setField(term10138, term10138.getClass(), "name", "OeQLvhVERT");
        setField(term10138, term10138.getClass(), "type", enum34);
        setField(term10138, term10138.getClass(), "order", term10165);
        term10167 = (Object[]) newArray("mil.nga.geopackage.user.UserColumn", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("mil.nga.geopackage.user.UserColumn"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10167;
        callMethod(klass, "add", argTypes, term10138, args);
    }

};


