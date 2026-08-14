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

public class Constraints_size_10089462838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;
     Object enum8;

    public Constraints_size_10089462838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2289 = new ArrayList();
        HashMap term2293 = new HashMap();
        term2288 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2288, term2288.getClass(), "constraints", term2289);
        setField(term2288, term2288.getClass(), "typedContraints", term2293);
        Class<? extends Object> term2311 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term2310 = ((Class) term2311).getDeclaredField((String) "NOT_NULL");
        ((Field) term2310).setAccessible(true);
        enum8 = ((Field) term2310).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[1];
        args[0] = enum8;
        callMethod(klass, "size", argTypes, term2288, args);
    }

};


