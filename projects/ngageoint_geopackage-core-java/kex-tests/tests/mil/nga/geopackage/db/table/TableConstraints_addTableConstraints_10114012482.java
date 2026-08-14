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

public class TableConstraints_addTableConstraints_10114012482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8080;
     Object term8097;

    public TableConstraints_addTableConstraints_10114012482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8082 = new ArrayList();
        HashMap term8086 = new HashMap();
        LinkedHashMap term8091 = new LinkedHashMap();
        term8080 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8081 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8081, term8081.getClass(), "constraints", term8082);
        setField(term8081, term8081.getClass(), "typedContraints", term8086);
        setField(term8080, term8080.getClass(), "constraints", term8081);
        setField(term8080, term8080.getClass(), "columnConstraints", term8091);
        ArrayList term8098 = new ArrayList();
        HashMap term8102 = new HashMap();
        term8097 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8097, term8097.getClass(), "constraints", term8098);
        setField(term8097, term8097.getClass(), "typedContraints", term8102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term8097;
        callMethod(klass, "addTableConstraints", argTypes, term8080, args);
    }

};


