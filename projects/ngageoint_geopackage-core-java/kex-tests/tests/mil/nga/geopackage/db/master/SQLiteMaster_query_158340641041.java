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

public class SQLiteMaster_query_158340641041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8393;
     Object term8429;

    public SQLiteMaster_query_158340641041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8440 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term8439 = ((Class) term8440).getDeclaredField((String) "NAME");
        ((Field) term8439).setAccessible(true);
        Object enum30 = ((Field) term8439).get((Object) null);
        Class<? extends Object> term8694 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term8693 = ((Class) term8694).getDeclaredField((String) "TBL_NAME");
        ((Field) term8693).setAccessible(true);
        Object enum31 = ((Field) term8693).get((Object) null);
        Class<? extends Object> term8960 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term8959 = ((Class) term8960).getDeclaredField((String) "TYPE");
        ((Field) term8959).setAccessible(true);
        Object enum32 = ((Field) term8959).get((Object) null);
        Class<? extends Object> term9214 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term9213 = ((Class) term9214).getDeclaredField((String) "SQL");
        ((Field) term9213).setAccessible(true);
        Object enum33 = ((Field) term9213).get((Object) null);
        term8393 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 6);
        setElement(term8393, 0, enum30);
        setElement(term8393, 1, enum31);
        setElement(term8393, 2, enum32);
        setElement(term8393, 3, enum32);
        setElement(term8393, 4, enum33);
        setElement(term8393, 5, enum33);
        Class<? extends Object> term9465 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term9464 = ((Class) term9465).getDeclaredField((String) "TABLE");
        ((Field) term9464).setAccessible(true);
        Object enum34 = ((Field) term9464).get((Object) null);
        term8429 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 1);
        setElement(term8429, 0, enum34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term8393;
        args[2] = term8429;
        callMethod(klass, "query", argTypes, null, args);
    }

};


