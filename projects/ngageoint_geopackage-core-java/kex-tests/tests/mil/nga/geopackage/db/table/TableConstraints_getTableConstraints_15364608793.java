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

public class TableConstraints_getTableConstraints_15364608793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8107;

    public TableConstraints_getTableConstraints_15364608793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8109 = new ArrayList();
        HashMap term8113 = new HashMap();
        LinkedHashMap term8118 = new LinkedHashMap();
        term8107 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8108 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8108, term8108.getClass(), "constraints", term8109);
        setField(term8108, term8108.getClass(), "typedContraints", term8113);
        setField(term8107, term8107.getClass(), "constraints", term8108);
        setField(term8107, term8107.getClass(), "columnConstraints", term8118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableConstraints", argTypes, term8107, args);
    }

};


