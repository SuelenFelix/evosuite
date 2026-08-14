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

public class TableConstraints_getColumnConstraints_61661161814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8405;

    public TableConstraints_getColumnConstraints_61661161814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8407 = new ArrayList();
        HashMap term8411 = new HashMap();
        LinkedHashMap term8416 = new LinkedHashMap();
        term8405 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8406 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8406, term8406.getClass(), "constraints", term8407);
        setField(term8406, term8406.getClass(), "typedContraints", term8411);
        setField(term8405, term8405.getClass(), "constraints", term8406);
        setField(term8405, term8405.getClass(), "columnConstraints", term8416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BwtdjiefJn";
        callMethod(klass, "getColumnConstraints", argTypes, term8405, args);
    }

};


