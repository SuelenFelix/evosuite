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
import java.util.ArrayList;

public class SQLiteMaster_query_18104740849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12950;
     Object enum48;
     Object term13006;

    public SQLiteMaster_query_18104740849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13028 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term13027 = ((Class) term13028).getDeclaredField((String) "ROOTPAGE");
        ((Field) term13027).setAccessible(true);
        Object enum43 = ((Field) term13027).get((Object) null);
        Class<? extends Object> term13294 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term13293 = ((Class) term13294).getDeclaredField((String) "SQL");
        ((Field) term13293).setAccessible(true);
        Object enum44 = ((Field) term13293).get((Object) null);
        Class<? extends Object> term13545 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term13544 = ((Class) term13545).getDeclaredField((String) "NAME");
        ((Field) term13544).setAccessible(true);
        Object enum45 = ((Field) term13544).get((Object) null);
        Class<? extends Object> term13799 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term13798 = ((Class) term13799).getDeclaredField((String) "TYPE");
        ((Field) term13798).setAccessible(true);
        Object enum46 = ((Field) term13798).get((Object) null);
        Class<? extends Object> term14053 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term14052 = ((Class) term14053).getDeclaredField((String) "TBL_NAME");
        ((Field) term14052).setAccessible(true);
        Object enum47 = ((Field) term14052).get((Object) null);
        term12950 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 8);
        setElement(term12950, 0, enum43);
        setElement(term12950, 1, enum44);
        setElement(term12950, 2, enum45);
        setElement(term12950, 3, enum44);
        setElement(term12950, 4, enum46);
        setElement(term12950, 5, enum45);
        setElement(term12950, 6, enum47);
        setElement(term12950, 7, enum43);
        Class<? extends Object> term14319 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term14318 = ((Class) term14319).getDeclaredField((String) "VIEW");
        ((Field) term14318).setAccessible(true);
        enum48 = ((Field) term14318).get((Object) null);
        ArrayList term13019 = new ArrayList();
        ArrayList term13023 = new ArrayList();
        term13006 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term13006, term13006.getClass(), "combineOperation", "nHXjMycHlU");
        setField(term13006, term13006.getClass(), "queries", term13019);
        setField(term13006, term13006.getClass(), "arguments", term13023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term12950;
        args[2] = enum48;
        args[3] = term13006;
        callMethod(klass, "query", argTypes, null, args);
    }

};


