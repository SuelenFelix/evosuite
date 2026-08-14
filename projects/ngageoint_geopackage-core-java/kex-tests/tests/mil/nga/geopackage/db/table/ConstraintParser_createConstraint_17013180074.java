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
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class ConstraintParser_createConstraint_17013180074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11073;
     Object term11098;
     Object term11100;
     Object enum37;

    public ConstraintParser_createConstraint_17013180074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11073 = (Object[]) newArray("java.lang.String", 2);
        setElement(term11073, 0, "wdoqITnaAP");
        setElement(term11073, 1, "rIPMBcrNqB");
        term11098 = new Integer(-1772434990);
        term11100 = new Integer(-1845499264);
        Class<? extends Object> term11135 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term11134 = ((Class) term11135).getDeclaredField((String) "NOT_NULL");
        ((Field) term11134).setAccessible(true);
        enum37 = ((Field) term11134).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ConstraintParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.db.table.ConstraintType");
        Object[] args = new Object[4];
        args[0] = term11073;
        args[1] = term11098;
        args[2] = term11100;
        args[3] = enum37;
        callMethod(klass, "createConstraint", argTypes, null, args);
    }

};


