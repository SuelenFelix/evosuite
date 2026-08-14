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

public class SQLiteMaster_query_18104740851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15066;
     Object term15099;
     Object term15100;

    public SQLiteMaster_query_18104740851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15230 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term15229 = ((Class) term15230).getDeclaredField((String) "TBL_NAME");
        ((Field) term15229).setAccessible(true);
        Object enum50 = ((Field) term15229).get((Object) null);
        Class<? extends Object> term15496 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term15495 = ((Class) term15496).getDeclaredField((String) "NAME");
        ((Field) term15495).setAccessible(true);
        Object enum51 = ((Field) term15495).get((Object) null);
        Class<? extends Object> term15750 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term15749 = ((Class) term15750).getDeclaredField((String) "ROOTPAGE");
        ((Field) term15749).setAccessible(true);
        Object enum52 = ((Field) term15749).get((Object) null);
        term15066 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 4);
        setElement(term15066, 0, enum50);
        setElement(term15066, 1, enum51);
        setElement(term15066, 2, enum52);
        setElement(term15066, 3, enum51);
        term15099 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 0);
        ArrayList term15113 = new ArrayList();
        ((ArrayList) term15113).add("IgRJUzaCwW");
        ((ArrayList) term15113).add("JUmudUmaaV");
        ((ArrayList) term15113).add("KoyGrUJeJW");
        ((ArrayList) term15113).add("HqBOwkVqjD");
        ((ArrayList) term15113).add("MAcUBcBckh");
        ((ArrayList) term15113).add("oVgzLbrsFr");
        ((ArrayList) term15113).add("vQVyKLdtaz");
        ArrayList term15201 = new ArrayList();
        ((ArrayList) term15201).add("OWKQODBLzb");
        ((ArrayList) term15201).add("wGmYcqUkgE");
        term15100 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term15100, term15100.getClass(), "combineOperation", "whBvTVIIlC");
        setField(term15100, term15100.getClass(), "queries", term15113);
        setField(term15100, term15100.getClass(), "arguments", term15201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        argTypes[3] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term15066;
        args[2] = term15099;
        args[3] = term15100;
        callMethod(klass, "query", argTypes, null, args);
    }

};


