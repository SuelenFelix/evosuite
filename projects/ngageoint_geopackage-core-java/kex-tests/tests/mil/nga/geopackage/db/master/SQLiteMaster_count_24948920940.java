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

public class SQLiteMaster_count_24948920940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7872;

    public SQLiteMaster_count_24948920940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7894 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term7893 = ((Class) term7894).getDeclaredField((String) "TRIGGER");
        ((Field) term7893).setAccessible(true);
        Object enum28 = ((Field) term7893).get((Object) null);
        Class<? extends Object> term8147 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term8146 = ((Class) term8147).getDeclaredField((String) "INDEX");
        ((Field) term8146).setAccessible(true);
        Object enum29 = ((Field) term8146).get((Object) null);
        term7872 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 2);
        setElement(term7872, 0, enum28);
        setElement(term7872, 1, enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7872;
        callMethod(klass, "count", argTypes, null, args);
    }

};


