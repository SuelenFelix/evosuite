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

public class SQLiteMaster_count_213158330642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9711;

    public SQLiteMaster_count_213158330642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9733 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term9732 = ((Class) term9733).getDeclaredField((String) "VIEW");
        ((Field) term9732).setAccessible(true);
        Object enum35 = ((Field) term9732).get((Object) null);
        term9711 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 1);
        setElement(term9711, 0, enum35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term9711;
        args[2] = "hRNSzYYIrc";
        callMethod(klass, "count", argTypes, null, args);
    }

};


