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

public class TableConstraints_getColumnsWithConstraints_27617843613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8388;

    public TableConstraints_getColumnsWithConstraints_27617843613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8390 = new ArrayList();
        HashMap term8394 = new HashMap();
        LinkedHashMap term8399 = new LinkedHashMap();
        term8388 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8389 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8389, term8389.getClass(), "constraints", term8390);
        setField(term8389, term8389.getClass(), "typedContraints", term8394);
        setField(term8388, term8388.getClass(), "constraints", term8389);
        setField(term8388, term8388.getClass(), "columnConstraints", term8399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumnsWithConstraints", argTypes, term8388, args);
    }

};


