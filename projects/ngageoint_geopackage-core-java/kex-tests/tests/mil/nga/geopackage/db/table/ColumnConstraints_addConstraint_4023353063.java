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

public class ColumnConstraints_addConstraint_4023353063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12605;

    public ColumnConstraints_addConstraint_4023353063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12619 = new ArrayList();
        HashMap term12623 = new HashMap();
        term12605 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12618 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12605, term12605.getClass(), "name", "JeZFtaqkzW");
        setField(term12618, term12618.getClass(), "constraints", term12619);
        setField(term12618, term12618.getClass(), "typedContraints", term12623);
        setField(term12605, term12605.getClass(), "constraints", term12618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addConstraint", argTypes, term12605, args);
    }

};


