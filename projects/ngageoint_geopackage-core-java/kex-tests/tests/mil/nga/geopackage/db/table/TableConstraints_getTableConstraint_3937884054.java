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
import java.util.LinkedHashMap;
import java.lang.Integer;

public class TableConstraints_getTableConstraint_3937884054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8124;
     Object term8141;

    public TableConstraints_getTableConstraint_3937884054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8126 = new ArrayList();
        HashMap term8130 = new HashMap();
        LinkedHashMap term8135 = new LinkedHashMap();
        term8124 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8125 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8125, term8125.getClass(), "constraints", term8126);
        setField(term8125, term8125.getClass(), "typedContraints", term8130);
        setField(term8124, term8124.getClass(), "constraints", term8125);
        setField(term8124, term8124.getClass(), "columnConstraints", term8135);
        term8141 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8141;
        callMethod(klass, "getTableConstraint", argTypes, term8124, args);
    }

};


