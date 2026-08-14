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

public class Constraints_has_79862266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2015;
     Object enum7;

    public Constraints_has_79862266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2016 = new ArrayList();
        HashMap term2020 = new HashMap();
        term2015 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2015, term2015.getClass(), "constraints", term2016);
        setField(term2015, term2015.getClass(), "typedContraints", term2020);
        Class<? extends Object> term2038 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term2037 = ((Class) term2038).getDeclaredField((String) "NOT_NULL");
        ((Field) term2037).setAccessible(true);
        enum7 = ((Field) term2037).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "has", argTypes, term2015, args);
    }

};


