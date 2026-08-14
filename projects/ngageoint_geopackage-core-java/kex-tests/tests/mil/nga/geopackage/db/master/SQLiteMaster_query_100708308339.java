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

public class SQLiteMaster_query_100708308339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7331;
     Object enum27;

    public SQLiteMaster_query_100708308339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7362 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term7361 = ((Class) term7362).getDeclaredField((String) "TYPE");
        ((Field) term7361).setAccessible(true);
        Object enum26 = ((Field) term7361).get((Object) null);
        term7331 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 1);
        setElement(term7331, 0, enum26);
        Class<? extends Object> term7616 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term7615 = ((Class) term7616).getDeclaredField((String) "INDEX");
        ((Field) term7615).setAccessible(true);
        enum27 = ((Field) term7615).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term7331;
        args[2] = enum27;
        args[3] = "MjGYSRKTNF";
        callMethod(klass, "query", argTypes, null, args);
    }

};


