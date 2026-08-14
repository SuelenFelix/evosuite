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

public class SQLiteMaster_queryViewsOnTable_71852391453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16137;

    public SQLiteMaster_queryViewsOnTable_71852391453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16159 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term16158 = ((Class) term16159).getDeclaredField((String) "TYPE");
        ((Field) term16158).setAccessible(true);
        Object enum53 = ((Field) term16158).get((Object) null);
        term16137 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 1);
        setElement(term16137, 0, enum53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term16137;
        args[2] = "VgZnGoIFwQ";
        callMethod(klass, "queryViewsOnTable", argTypes, null, args);
    }

};


