package mil.nga.geopackage.db.master;

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
import static mil.nga.geopackage.db.master.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class SQLiteMaster_init_15909310870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;
     Object term1170;

    public SQLiteMaster_init_15909310870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167 = new LinkedList();
        Class<? extends Object> term1204 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term1203 = ((Class) term1204).getDeclaredField((String) "TBL_NAME");
        ((Field) term1203).setAccessible(true);
        Object enum4 = ((Field) term1203).get((Object) null);
        Class<? extends Object> term1470 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term1469 = ((Class) term1470).getDeclaredField((String) "ROOTPAGE");
        ((Field) term1469).setAccessible(true);
        Object enum5 = ((Field) term1469).get((Object) null);
        Class<? extends Object> term1736 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term1735 = ((Class) term1736).getDeclaredField((String) "TYPE");
        ((Field) term1735).setAccessible(true);
        Object enum6 = ((Field) term1735).get((Object) null);
        term1170 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 4);
        setElement(term1170, 0, enum4);
        setElement(term1170, 1, enum5);
        setElement(term1170, 2, enum6);
        setElement(term1170, 3, enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1167;
        args[1] = term1170;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


