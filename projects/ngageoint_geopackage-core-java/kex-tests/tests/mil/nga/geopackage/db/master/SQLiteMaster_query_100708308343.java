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

public class SQLiteMaster_query_100708308343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9986;
     Object term9995;

    public SQLiteMaster_query_100708308343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10035 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term10034 = ((Class) term10035).getDeclaredField((String) "NAME");
        ((Field) term10034).setAccessible(true);
        Object enum36 = ((Field) term10034).get((Object) null);
        term9986 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 2);
        setElement(term9986, 0, enum36);
        setElement(term9986, 1, enum36);
        Class<? extends Object> term10289 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term10288 = ((Class) term10289).getDeclaredField((String) "VIEW");
        ((Field) term10288).setAccessible(true);
        Object enum37 = ((Field) term10288).get((Object) null);
        Class<? extends Object> term10533 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term10532 = ((Class) term10533).getDeclaredField((String) "INDEX");
        ((Field) term10532).setAccessible(true);
        Object enum38 = ((Field) term10532).get((Object) null);
        Class<? extends Object> term10780 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term10779 = ((Class) term10780).getDeclaredField((String) "TABLE");
        ((Field) term10779).setAccessible(true);
        Object enum39 = ((Field) term10779).get((Object) null);
        term9995 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 3);
        setElement(term9995, 0, enum37);
        setElement(term9995, 1, enum38);
        setElement(term9995, 2, enum39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term9986;
        args[2] = term9995;
        args[3] = "RMFIsYGgne";
        callMethod(klass, "query", argTypes, null, args);
    }

};


