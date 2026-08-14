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
import java.lang.Object;
import java.lang.String;

public class SQLiteMaster_query_158340641037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5712;
     Object enum24;

    public SQLiteMaster_query_158340641037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5762 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term5761 = ((Class) term5762).getDeclaredField((String) "ROOTPAGE");
        ((Field) term5761).setAccessible(true);
        Object enum20 = ((Field) term5761).get((Object) null);
        Class<? extends Object> term6028 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term6027 = ((Class) term6028).getDeclaredField((String) "SQL");
        ((Field) term6027).setAccessible(true);
        Object enum21 = ((Field) term6027).get((Object) null);
        Class<? extends Object> term6279 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term6278 = ((Class) term6279).getDeclaredField((String) "TBL_NAME");
        ((Field) term6278).setAccessible(true);
        Object enum22 = ((Field) term6278).get((Object) null);
        Class<? extends Object> term6545 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term6544 = ((Class) term6545).getDeclaredField((String) "NAME");
        ((Field) term6544).setAccessible(true);
        Object enum23 = ((Field) term6544).get((Object) null);
        term5712 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 4);
        setElement(term5712, 0, enum20);
        setElement(term5712, 1, enum21);
        setElement(term5712, 2, enum22);
        setElement(term5712, 3, enum23);
        Class<? extends Object> term6799 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term6798 = ((Class) term6799).getDeclaredField((String) "INDEX");
        ((Field) term6798).setAccessible(true);
        enum24 = ((Field) term6798).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5712;
        args[2] = enum24;
        callMethod(klass, "query", argTypes, null, args);
    }

};


