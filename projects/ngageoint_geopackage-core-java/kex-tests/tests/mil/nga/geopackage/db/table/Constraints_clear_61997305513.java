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

public class Constraints_clear_61997305513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2834;
     Object enum10;

    public Constraints_clear_61997305513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2835 = new ArrayList();
        HashMap term2839 = new HashMap();
        term2834 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2834, term2834.getClass(), "constraints", term2835);
        setField(term2834, term2834.getClass(), "typedContraints", term2839);
        Class<? extends Object> term2856 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term2855 = ((Class) term2856).getDeclaredField((String) "DEFAULT");
        ((Field) term2855).setAccessible(true);
        enum10 = ((Field) term2855).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[1];
        args[0] = enum10;
        callMethod(klass, "clear", argTypes, term2834, args);
    }

};


