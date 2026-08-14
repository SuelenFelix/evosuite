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

public class TableConstraints_getColumnConstraint_158574063815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8444;
     Object term8473;

    public TableConstraints_getColumnConstraint_158574063815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8446 = new ArrayList();
        HashMap term8450 = new HashMap();
        LinkedHashMap term8455 = new LinkedHashMap();
        term8444 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8445 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8445, term8445.getClass(), "constraints", term8446);
        setField(term8445, term8445.getClass(), "typedContraints", term8450);
        setField(term8444, term8444.getClass(), "constraints", term8445);
        setField(term8444, term8444.getClass(), "columnConstraints", term8455);
        term8473 = new Integer(1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "jDmhBrIoDa";
        args[1] = term8473;
        callMethod(klass, "getColumnConstraint", argTypes, term8444, args);
    }

};


