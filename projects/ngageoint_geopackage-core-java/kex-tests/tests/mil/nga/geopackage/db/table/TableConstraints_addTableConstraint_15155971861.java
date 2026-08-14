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

public class TableConstraints_addTableConstraint_15155971861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8063;

    public TableConstraints_addTableConstraint_15155971861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8065 = new ArrayList();
        HashMap term8069 = new HashMap();
        LinkedHashMap term8074 = new LinkedHashMap();
        term8063 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8064 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8064, term8064.getClass(), "constraints", term8065);
        setField(term8064, term8064.getClass(), "typedContraints", term8069);
        setField(term8063, term8063.getClass(), "constraints", term8064);
        setField(term8063, term8063.getClass(), "columnConstraints", term8074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraint");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTableConstraint", argTypes, term8063, args);
    }

};


