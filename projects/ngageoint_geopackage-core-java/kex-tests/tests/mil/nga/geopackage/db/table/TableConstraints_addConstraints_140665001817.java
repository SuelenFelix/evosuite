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

public class TableConstraints_addConstraints_140665001817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8524;
     Object term8541;

    public TableConstraints_addConstraints_140665001817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8526 = new ArrayList();
        HashMap term8530 = new HashMap();
        LinkedHashMap term8535 = new LinkedHashMap();
        term8524 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8525 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8525, term8525.getClass(), "constraints", term8526);
        setField(term8525, term8525.getClass(), "typedContraints", term8530);
        setField(term8524, term8524.getClass(), "constraints", term8525);
        setField(term8524, term8524.getClass(), "columnConstraints", term8535);
        ArrayList term8543 = new ArrayList();
        HashMap term8547 = new HashMap();
        LinkedHashMap term8552 = new LinkedHashMap();
        term8541 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8542 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8542, term8542.getClass(), "constraints", term8543);
        setField(term8542, term8542.getClass(), "typedContraints", term8547);
        setField(term8541, term8541.getClass(), "constraints", term8542);
        setField(term8541, term8541.getClass(), "columnConstraints", term8552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Object[] args = new Object[1];
        args[0] = term8541;
        callMethod(klass, "addConstraints", argTypes, term8524, args);
    }

};


