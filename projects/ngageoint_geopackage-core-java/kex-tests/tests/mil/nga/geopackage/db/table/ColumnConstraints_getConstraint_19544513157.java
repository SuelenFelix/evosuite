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
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class ColumnConstraints_getConstraint_19544513157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12715;
     Object term12738;

    public ColumnConstraints_getConstraint_19544513157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12729 = new ArrayList();
        HashMap term12733 = new HashMap();
        term12715 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12728 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12715, term12715.getClass(), "name", "aanyiAOJCl");
        setField(term12728, term12728.getClass(), "constraints", term12729);
        setField(term12728, term12728.getClass(), "typedContraints", term12733);
        setField(term12715, term12715.getClass(), "constraints", term12728);
        term12738 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12738;
        callMethod(klass, "getConstraint", argTypes, term12715, args);
    }

};


