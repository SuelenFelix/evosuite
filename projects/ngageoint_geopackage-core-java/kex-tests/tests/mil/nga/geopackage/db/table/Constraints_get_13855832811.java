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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class Constraints_get_13855832811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;
     Object enum9;

    public Constraints_get_13855832811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2574 = new ArrayList();
        HashMap term2578 = new HashMap();
        term2573 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2573, term2573.getClass(), "constraints", term2574);
        setField(term2573, term2573.getClass(), "typedContraints", term2578);
        Class<? extends Object> term2593 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term2592 = ((Class) term2593).getDeclaredField((String) "CHECK");
        ((Field) term2592).setAccessible(true);
        enum9 = ((Field) term2592).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[1];
        args[0] = enum9;
        callMethod(klass, "get", argTypes, term2573, args);
    }

};


